package com.realtech.pandora.templates.dbtools.model.db;

import com.realtech.pandora.templates.dbtools.exception.GeneratorException;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.Property;
import com.realtech.pandora.templates.dbtools.model.TableSet;
import com.realtech.pandora.util.StringUtil;
import com.realtech.pandora.templates.dbtools.model.TypeEnum;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by admin on 2017/4/25.
 */
@Component
public class DBSqlServer extends DBBase {

    private final Logger log = Logger.getLogger(DBSqlServer.class);

    /*拉取表相关字段信息*/
    private final String querySql = "select" +
                            " c.name as cloumnName,t.name as cloumnType" +
                            " ,convert(bit,c.IsNullable)  as canBeNull" +
                            " ,convert(bit,case when exists(select 1 from sysobjects where xtype='PK' and parent_obj=c.id and name in (" +
                            " select name from sysindexes where indid in(" +
                            " select indid from sysindexkeys where id = c.id and colid=c.colid))) then 1 else 0 end) " +
                            " as isPrimaryKey" +
                            " ,convert(bit,COLUMNPROPERTY(c.id,c.name,'IsIdentity')) as isAutoIncrement" +
                            " ,c.Length as ByteSize" +
                            " ,COLUMNPROPERTY(c.id,c.name,'PRECISION') as length" +
                            " ,isnull(COLUMNPROPERTY(c.id,c.name,'Scale'),0) as decimalDigit" +
                            " ,ISNULL(CM.text,'') as defaultValue" +
                            " ,isnull(ETP.value,'') AS des" +
//                            "     --,ROW_NUMBER() OVER (ORDER BY C.name) AS [Row]" +
                            " from syscolumns c" +
                            " inner join systypes t on c.xusertype = t.xusertype" +
                            " left join sys.extended_properties ETP on ETP.major_id = c.id and ETP.minor_id = c.colid and ETP.name ='MS_Description'" +
                            " left join syscomments CM on c.cdefault=CM.id" +
                            " where c.id = object_id(?)";

    private Map<String, Property> proertiesMap;
    private Property keyProperty;

    private void getPropertiesFromTable(String tableName) {
        proertiesMap = new HashMap<>();
        Property p;
        try(PreparedStatement ps= conn.prepareStatement(querySql)) {
            ps.setString(1, tableName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TypeEnum type = TypeEnum.getJavaTypeByTableType(rs.getString("cloumnType"));
                if(type == null)
                    log.error("[Error Type Mapping]table: " + tableName + ";clumnName: " + rs.getString("cloumnName") + ";type: " + rs.getString("cloumnType"));
                p = new Property();
                p.setTablePropertyName(rs.getString("cloumnName"));
                p.setTablePropertyType(type.getCode());
                p.setTablePropertyRemarmk(rs.getString("des"));
                p.setPropertyName(StringUtil.toLowerCamelCase(p.getTablePropertyName()));
                p.setPropertyType(type.getJavaType());
                p.setTablePropertyTypeStr(rs.getString("cloumnType"));
                p.setMethodName(StringUtil.toUpperCamelCase(p.getTablePropertyName()));
                p.setNatureName(p.getTablePropertyName().replace("_", " "));
                /*联合主键的情况下，只取第一个作为主键*/
                if(keyProperty == null) {
                    p.setPrimaryKey(rs.getString("isPrimaryKey").equals("1")? true: false);
                    if(p.isPrimaryKey() == true) {
                        keyProperty = p;
                        continue;
                    }
                }
                if(!TableSet.filterBuiltField(p.getTablePropertyName())) {
                    proertiesMap.put(p.getPropertyName(), p);
                }
            }
        }catch (SQLException e) {
            System.err.println(tableName);
            e.printStackTrace();
        }
    }

    @Override
    protected String queryTableComent(String tableName) {
        tableName = tableName.split("\\.")[1];
        try (PreparedStatement ps = conn.prepareStatement(getSqlAllTableComent(tableName))){
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
               return rs.getString("remark");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String queryPrimarykey(String tableName) throws GeneratorException {
        if(proertiesMap == null)
            getPropertiesFromTable(tableName);
        if(keyProperty == null) {
            proertiesMap = null;
            throw new GeneratorException("[error]" + tableName + " 没有主键");
        }
        return keyProperty.getTablePropertyName();
    }

    @Override
    public String queryPrimarykeyType(String tableName) {
        if(proertiesMap == null)
            getPropertiesFromTable(tableName);
        return keyProperty.getTablePropertyTypeStr();
    }
    @Override
    public String queryPrimarykeyClassType(String tableName) {
        return TypeEnum.getJavaTypeByTableType(queryPrimarykeyType(tableName)).getJavaType();
    }


    @Override
    public List<Property> queryField(Table table) {
        getPropertiesFromTable(table.getTableName());
        List<Property> fieldL = new ArrayList<>(proertiesMap.values());
        proertiesMap = null;
        keyProperty = null;
        return fieldL;
    }

    @Override
    protected String getSqlAllTableNames() {
        return "select table_schema+'.'+table_name as TABLE_NAME from information_schema.tables where table_type = 'base table' order by TABLE_NAME";
    }

    @Override
    protected String getSqlAllTableComent(String tableName) {
        return "SELECT c.name,CAST (isnull(f.[value], '') AS nvarchar (100)) AS remark FROM sys.objects c LEFT JOIN sys.extended_properties f ON f.major_id = c.object_id AND f.minor_id = 0 AND f.class = 1 WHERE c.type = 'u' AND c.name = '"+ tableName +"'";
    }

    @Override
    protected String getSqlTableName(String tableName) {
        return "select table_schema+'.'+table_name as TABLE_NAME from information_schema.tables where table_type = 'base table' and TABLE_NAME like '%" + tableName + "%' order by TABLE_NAME";
    }


    @Override
    protected String queryAllDataBasesSQL() {
        return "SELECT Name FROM Master..SysDatabases ORDER BY Name";
    }
}
