package com.realtech.pandora.templates.dbtools.model;

import java.sql.Types;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 2017/4/25.
 * Description: 数据库字段类型与java类型之间的对应关系枚举
 */
public enum TypeEnum {
    BIT(Types.BIT, "Boolean", "BIT"),
    TINYINT(Types.TINYINT, "Integer", "TINYINT"),
    SMALLINT(Types.SMALLINT, "Integer", "SMALLINT"),
    INTEGER(Types.INTEGER, "Integer", "INTEGER,INT"),
    BIGINT(Types.BIGINT, "Long", "BIGINT"),
    FLOAT(Types.FLOAT, "Boolean", "FLOAT"),
    REAL(Types.REAL, "BigDecimal", "REAL"),
    DOUBLE(Types.DOUBLE, "Double", "DOUBLE"),
    DECIMAL(Types.DECIMAL, "BigDecimal", "DECIMAL"),
    NUMERIC(Types.NUMERIC, "BigDecimal", "NUMERIC"),
    CHAR(Types.CHAR, "String", "CHAR"),
    VARCHAR(Types.VARCHAR, "String", "VARCHAR"),
    LONGVARCHAR(Types.LONGVARCHAR, "String", "LONGVARCHAR,UNIQUEIDENTIFIER,TEXT"),
    DATE(Types.DATE, "Timestamp", "DATE,DATETIME"),
    TIME(Types.TIME, "Date", "TIME"),
//    TIMESTAMP(Types.TIMESTAMP, "Date", "TIMESTAMP"),
    TIMESTAMP(Types.BINARY, "byte[]", "TIMESTAMP"),
    BINARY(Types.BINARY, "byte[]", "BINARY"),
    VARBINARY(Types.VARBINARY, "byte[]", "VARBINARY"),
    LONGVARBINARY(Types.LONGVARBINARY, "byte[]", "LONGVARBINARY"),
    BLOB(Types.BLOB, "byte[]", "BLOB"),
    CLOB(Types.CLOB, "char[]", "CLOB"),
    BOOLEAN(Types.BOOLEAN, "Boolean", "BOOLEAN"),
    ROWID(Types.ROWID, "Long", "ROWID"),
    NCHAR(Types.NCHAR, "String", "NCHAR"),
    NVARCHAR(Types.NVARCHAR, "String", "NVARCHAR,SYSNAME"),
    LONGNVARCHAR(Types.LONGNVARCHAR, "String", "LONGNVARCHAR"),
    NCLOB(Types.NCLOB, "String", "NCLOB"),
    TIME_WITH_TIMEZONE(Types.TIME_WITH_TIMEZONE, "Date", "TIME_WITH_TIMEZONE"),
    TIMESTAMP_WITH_TIMEZONE(Types.TIMESTAMP_WITH_TIMEZONE, "Date", "TIMESTAMP_WITH_TIMEZONE"),
    ;

    private int code;
    private String javaType;
    private String tableType;

    TypeEnum(int code, String javaType, String tableType) {
        this.code = code;
        this.javaType = javaType;
        this.tableType = tableType;
    }

    public int getCode() {
        return code;
    }

    public String getJavaType() {
        return javaType;
    }

    public String getTableType() {
        return tableType;
    }

    /**
     * 根据数据库字段类型名称dbTypeName，获取到对应的java类型
     */
    public static TypeEnum getJavaType(int dbType) {
        for(TypeEnum type: TypeEnum.values()) {
            if(dbType == type.getCode())
                return type;
        }
        System.err.println("Unknown dbType " + dbType);
        return null;
    }

    /**
     * 根据数据库字段类型名称dbTypeName，获取到对应的java类型
     */
    public static TypeEnum getJavaTypeByTableType(String tableType) {
        for(TypeEnum type: TypeEnum.values()) {
            List<String> tableTypes =  Arrays.asList(type.getTableType().split(","));
            if(tableTypes.contains(tableType.trim().toUpperCase()))
                return type;
        }
        System.err.println("Unknown table type: " + tableType);
        return null;
    }

    public static boolean existJavaType(String simpleTypeName) {
        for(TypeEnum type: TypeEnum.values()) {
            if(simpleTypeName.equals(type.getJavaType()))
                return true;
        }
        return false;
    }

}
