package com.realtech.pandora.templates.dbtools.model.db;

import com.realtech.pandora.templates.dbtools.Config;
import com.realtech.pandora.templates.dbtools.exception.GeneratorException;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.TableSet;
import com.realtech.pandora.templates.dbtools.model.Property;
import com.realtech.pandora.templates.dbtools.model.TypeEnum;
import com.realtech.pandora.util.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/4/25.
 */
public abstract class DBBase {

    private final Logger log = Logger.getLogger(DBBase.class);
    protected String driverName, sqlUrl, sqlUser, sqlPassword;

    protected Connection conn;

    public DBBase() {}


    public Table queryTable(String tableName) throws GeneratorException {
        Table table = new Table();
        table.setPrimaryKey(queryPrimarykey(tableName));
        table.setPrimaryKeyType(queryPrimarykeyType(tableName));
        table.setPrimaryKeyClassType(queryPrimarykeyClassType(tableName));
        table.setTableName(tableName);
        table.setClassName(getClassNameFromTableName(tableName));
        table.setGenPropertyList(queryField(table));
        table.setAutoIncrementIdConfig(Config.isAutoIncrementId(getTableName(tableName)));
        return table;
    }

    public String getClassNameFromTableName(String tableName) {
        int preNum;
        if(Config.tableSchema == true) {
            preNum = tableName.indexOf(".") + 1;
        }else {
            preNum = StringUtils.defaultIfEmpty(Config.tableNamePrefix, "").length();
        }
        return StringUtil.toUpperCamelCase(tableName.substring(preNum));
    }

    public String getTableName(String tableName) {
        int preNum;
        if(Config.tableSchema == true) {
            preNum = tableName.indexOf(".") + 1;
        }else {
            preNum = StringUtils.defaultIfEmpty(Config.tableNamePrefix, "").length();
        }
        return tableName.substring(preNum);
    }

    /**
     * 根据表名获取表
     */
    public Table queryTables(String tableName) throws GeneratorException {
        return queryTable(tableName);
    }

    /**
     * 根据表名获取主键
     */
    public String queryPrimarykey(String tableName) throws GeneratorException {
        try {
            ResultSet rs = conn.getMetaData().getPrimaryKeys(null, null, tableName);
            rs.next();
			return rs.getString(4);
        } catch (SQLException e) {
            System.err.println(tableName);
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据表名获取主键
     */
    public String queryPrimarykeyType(String tableName) {
        return null;//至针对sqlserver,其他的待定
    }

    /**
     * 根据表名获取主键
     */
    public String queryPrimarykeyClassType(String tableName) {
        return null;//至针对sqlserver,其他的待定
    }


    /**
     * 获取字段和字段对应类型
     */
    public List<Property> queryField(Table table) {
        List<Property> li = new ArrayList<Property>();
        try {
            ResultSet rs = conn.getMetaData().getColumns(null, "%", table.getTableName(), "%");
            while (rs.next()) {
                String colName = rs.getString("COLUMN_NAME");
                int colType = rs.getInt("DATA_TYPE");
                if (colName.equals(table.getPrimaryKey()) || TableSet.filterBuiltField(colName))
                    continue;
                Property prop = new Property();
                prop.setTablePropertyName(colName);
                prop.setTablePropertyType(colType);
                prop.setTablePropertyRemarmk(rs.getString("REMARKS"));
                prop.setPropertyName(StringUtil.toLowerCamelCase(colName));
                prop.setPropertyType(TypeEnum.getJavaType(colType).getJavaType());
                prop.setMethodName(StringUtil.toUpperCamelCase(colName));
                prop.setNatureName(colName.replace("_", " "));
                li.add(prop);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return li;
    }

    /**
     * 所有表名保存至list
     */
    public List<String> queryAllTableNames() {
        List<String> resultList = new ArrayList<String>();
        try (PreparedStatement ps = conn.prepareStatement(getSqlAllTableNames())){
            ResultSet rs = ps.executeQuery();
            while (rs.next())
                resultList.add(rs.getString("TABLE_NAME"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    public List<String> queryTableName(String tableName) {
        List<String> resultList = new ArrayList<String>();
        try (PreparedStatement ps = conn.prepareStatement(getSqlTableName(tableName))){
            ResultSet rs = ps.executeQuery();
            while (rs.next())
                resultList.add(rs.getString("TABLE_NAME"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    public List<String> queryAllDataBases() {
        List<String> resultList = new ArrayList<String>();
        try (PreparedStatement ps = conn.prepareStatement(queryAllDataBasesSQL())){
            ResultSet rs = ps.executeQuery();
            while (rs.next())
                resultList.add(rs.getString("Name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    /**
     * 获取所有的表名的sql
     * @return
     */
    protected abstract String getSqlAllTableNames();

    /**
     * 模糊查询列表
     * @param tableName
     * @return
     */
    protected abstract String getSqlTableName(String tableName);

    /**
     * 获取所有数据库名 sql
     * @return
     */
    protected abstract String queryAllDataBasesSQL();

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getSqlUrl() {
        return sqlUrl;
    }

    public void setSqlUrl(String sqlUrl) {
        this.sqlUrl = sqlUrl;
    }

    public String getSqlUser() {
        return sqlUser;
    }

    public void setSqlUser(String sqlUser) {
        this.sqlUser = sqlUser;
    }

    public String getSqlPassword() {
        return sqlPassword;
    }

    public void setSqlPassword(String sqlPassword) {
        this.sqlPassword = sqlPassword;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}
