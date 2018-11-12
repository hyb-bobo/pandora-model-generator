package com.realtech.pandora.templates.dbtools.model;

import com.realtech.pandora.util.PropertiesUtil;

/**
 * Created by admin on 2017/4/25.
 * 不变的字段名
 */
public class TableSet {
    public static String id;

    public static String createAt;
    public static String createBy;
    public static String updateAt;
    public static String updateBy;
    public static String deleteAt;
    public static String deleteBy;

    public static String dr;
    public static String dataVersion;

    static {
        PropertiesUtil.reflectLoadPropertiesToStaticFields("baseModel.properties", TableSet.class);
    }

    /**
     * 是否为内置字段，如果是则返回true
     * @param columnName
     * @return
     */
    public static boolean filterBuiltField(String columnName) {
        return (columnName.equalsIgnoreCase(createAt) || columnName.equalsIgnoreCase(createBy) || columnName.equalsIgnoreCase(updateAt)
                ||columnName.equalsIgnoreCase(updateBy) || columnName.equalsIgnoreCase(deleteAt) || columnName.equalsIgnoreCase(deleteBy)
                || columnName.equalsIgnoreCase(dr) || columnName.equalsIgnoreCase(dataVersion) || columnName.equalsIgnoreCase(id));
    }

}