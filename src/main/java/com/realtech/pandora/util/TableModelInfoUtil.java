package com.realtech.pandora.util;

import com.realtech.pandora.templates.dbtools.Config;
import com.realtech.pandora.templates.dbtools.exception.GeneratorException;
import com.realtech.pandora.templates.dbtools.model.Property;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.TypeEnum;
import com.realtech.pandora.templates.dbtools.model.db.DBManager;
import com.realtech.pandora.templates.dbtools.model.po.ModelInfo;
import com.realtech.pandora.templates.dbtools.validate.ValidateException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jjz on 2017/5/7.
 * 生成表信息，model信息相关的工具
 */
public class TableModelInfoUtil implements ModelInfo {

    private final static Logger log = Logger.getLogger(TableModelInfoUtil.class);

    /**
     * 只获取java model 的字段值
     * @param javaPath
     * @return
     * @throws ValidateException
     */
    public static List<String> getModelFields(String javaPath) throws ValidateException {
        return (ArrayList<String>)getModelInfo(javaPath).get(FIELDS);
    }

    /**
     * 只获取java model 的字段值
     * @param modelName         model类名
     * @return
     * @throws ValidateException
     */
    public static List<String> getModelFieldsFromModelName(String modelName) throws ValidateException {
        String javaPath = Config.basePackage + ".model." +  modelName;
        return (ArrayList<String>)getModelInfo(javaPath).get(FIELDS);
    }

    /**
     * 获取java model基本信息
     * @param javaPath
     * @return {
     *          className:"",
     *          fields:["","",""],
     *          FIELDINFOS:[{modelColumnName:"",modelColumnType:""}]
     *          }
     * @throws ValidateException
     */
    public static Map<String, Object> getModelInfo (String javaPath) throws ValidateException {
        Map<String, Object> info = new HashMap<>();
        List<String> fields = new ArrayList<>();
        info.put(CLASS_NAME, javaPath);
        List<Map<String, String>> fieldIfos = new ArrayList<>();
        Class<?> baseModelClass;
        try {
            baseModelClass = Class.forName(javaPath);
            while(!baseModelClass.getSimpleName().equals("Object")){
                Field[] dd = baseModelClass.getDeclaredFields();
                for(Field f: dd) {
                    if(TypeEnum.existJavaType(f.getType().getSimpleName())) {
                        Map<String, String> fieldInfo = new HashMap<>();
                        fieldInfo.put(MODEL_COLUMN_NAME, f.getName());
                        fieldInfo.put(MODEL_COLUMN_TYPE, f.getType().getSimpleName());
                        fields.add(f.getName());
                        fieldIfos.add(fieldInfo);
                    }
                }
                baseModelClass = baseModelClass.getSuperclass();
            }
            info.put(FIELDINFOS, fieldIfos);
            info.put(FIELDS, fields);
        } catch (ClassNotFoundException e) {
            log.error(e);
            throw new ValidateException("找不到此class类： " + javaPath);
        }
        return info;
    }


    /**
     * 获取表基本信息
     * @param tableName             表名
     * @param idDefaultName         转换后默认id名称
     * @return
     *          {
     *          tableName:"",
     *          className:"",
     *          fields:["","",""],
     *          FIELDINFOS:[{tableColumnName:"",tableColumnType:"",modelColumnName:"",modelColumnType:""}]
     *          }
     * @throws ValidateException
     */
    public static Map<String, Object> getTableInfo (String tableName, String idDefaultName) throws GeneratorException {
        Table table = DBManager.getInstance().queryTable(tableName);
        Map<String, Object> info = new HashMap<>();

        info.put(TABLE_NAME, table.getTableName());
        info.put(CLASS_NAME, table.getClassName());

        List<String> fields = new ArrayList<>();
        /*主键*/
        Map<String, String> fieldInfo = new HashMap<>();
        fieldInfo.put(TABLE_COLUMN_NAME, table.getPrimaryKey());
        fieldInfo.put(TABLE_COLUMN_TYPE, table.getPrimaryKeyType());
        fieldInfo.put(MODEL_COLUMN_NAME, idDefaultName);
        fieldInfo.put(MODEL_COLUMN_TYPE, "String");
        fields.add(idDefaultName);

        List<Map<String, String>> fieldIfos = new ArrayList<>();
        fieldIfos.add(fieldInfo);

        /*其他列属性*/
        for(Property p : table.getGenPropertyList()) {
            fieldIfos.add(fieldToMap((p)));
            fields.add(p.getPropertyName());
        }
        info.put(FIELDINFOS, fieldIfos);
        info.put(FIELDS, fields);
        return info;
    }

    /**
     * 只获取表的字段值
     * @param tableName
     * @param idDefaultName
     * @return
     * @throws ValidateException
     */
    public static List<String> getTableFields(String tableName, String idDefaultName) throws ValidateException, GeneratorException {
        return (ArrayList<String>)getTableInfo(tableName, idDefaultName).get(FIELDS);
    }

    private static Map<String, String> fieldToMap(Property property) {
        Map<String, String> fieldInfo = new HashMap<>();
        fieldInfo.put(TABLE_COLUMN_NAME, property.getTablePropertyName());
        fieldInfo.put(TABLE_COLUMN_TYPE, property.getTablePropertyTypeStr());
        fieldInfo.put(MODEL_COLUMN_NAME, property.getPropertyName());
        fieldInfo.put(MODEL_COLUMN_TYPE, property.getPropertyType());
        return fieldInfo;
    }



    public static void main(String[] args) throws ValidateException {
        String javaPath = "com.realtech.pandora.model.UumsLocationRight";
        Map<String, Object> info = TableModelInfoUtil.getModelInfo(javaPath);
        System.out.println(info);
        JSONObject json = JSONObject.fromObject(info);
        System.out.println(json);
        System.out.println(TableModelInfoUtil.getModelFields(javaPath));
    }


}
