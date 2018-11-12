package com.realtech.pandora.templates.dbtools;

import com.realtech.pandora.util.PropertiesUtil;
import com.realtech.pandora.util.StringUtil;

import java.util.Properties;

/**
 * Created by admin on 2017/4/26.
 */
public class Config {
    public static int dbType = 1;               //默认oracle
    public static String tableNamePrefix;       //表前缀
    public static boolean tableSchema;
    public static String driverName;
    public static String sqlUrl;
    public static String sqlUser;
    public static String sqlPassword;

    public static String tableNames;
    public static String basePackage;

    public static String autoIncrementIdSet;

    public static Properties properties;

    public static boolean generatorFile;

    static {
        PropertiesUtil.reflectLoadPropertiesToStaticFields("dbtools.properties", Config.class);
        properties = PropertiesUtil.loadProperties("dbtools.properties");
    }

    /**
     * 是否为自增id
     * @param tableName
     * @return
     */
    public static boolean isAutoIncrementId(String tableName) {
        if(StringUtil.isNullorEmpty(tableName)) return false;
        tableName = tableName.toLowerCase();
        String[] ss = autoIncrementIdSet.toLowerCase().split(",");
        for (int i = 0; i < ss.length; i ++) {
            if(!ss[i].contains("%") && ss[i].equals(tableName))
                return true;
            if(ss[i].endsWith("%") && tableName.startsWith(ss[i].substring(0, ss[i].lastIndexOf("%"))))
                return true;
            if(ss[i].startsWith("%") && tableName.endsWith(ss[i].substring(1)))
                return true;
        }
        return false;
    }

}
