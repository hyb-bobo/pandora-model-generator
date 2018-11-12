package com.realtech.pandora.templates.dbtools.model;

/**
 * 该类为表中的属性信息及对应类的相关信息
 */
public class Property {

	private String propertyType;
	private String propertyName;
	private int tablePropertyType;
	private String tablePropertyTypeStr;
	private String tablePropertyName;
	private String tablePropertyRemarmk;
	private String methodName;
    private String natureName;              //下划线转空格

    private boolean isPrimaryKey;           //是否主键

	public Property() {
	}

	public String getNatureName() {
		return natureName;
	}
	public void setNatureName(String natureName) {
		this.natureName = natureName;
	}
	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public int getTablePropertyType() {
		return tablePropertyType;
	}

	public void setTablePropertyType(int tablePropertyType) {
		this.tablePropertyType = tablePropertyType;
	}

	public String getTablePropertyName() {
		return tablePropertyName;
	}

	public void setTablePropertyName(String tablePropertyName) {
		this.tablePropertyName = tablePropertyName;
	}

	public String getTablePropertyRemarmk() {
		return tablePropertyRemarmk;
	}

	public void setTablePropertyRemarmk(String tablePropertyRemarmk) {
		this.tablePropertyRemarmk = tablePropertyRemarmk;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

    public boolean isPrimaryKey() {
        return isPrimaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        isPrimaryKey = primaryKey;
    }

	public String getTablePropertyTypeStr() {
		return tablePropertyTypeStr;
	}

	public void setTablePropertyTypeStr(String tablePropertyTypeStr) {
		this.tablePropertyTypeStr = tablePropertyTypeStr;
	}

	/**
	 * 生成公共字段构造
	 * @param tablePropertyName
	 * @param propertyName
	 */
	public Property(String tablePropertyName, String propertyName) {
		this.tablePropertyName = tablePropertyName;
		this.propertyName = propertyName;
	}
}