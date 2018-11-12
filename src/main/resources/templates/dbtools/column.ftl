package ${basePackage}.model.column;

import ${basePackage}.model.${className};
import ${basePackage}.model.column.base.Column;

<#list importList as import>
import ${import};
</#list>

public class ${className}Column {

	public static final Column
		id = new Column(${className}.class, "id", "${primaryKey}", String.class),
		${primaryKeyJavaField} = new Column(${className}.class, "id", "${primaryKey}", String.class),
<#list propertyList as property>
		${property.propertyName} = new Column(${className}.class, "${property.propertyName}", "${property.tablePropertyName}", ${property.propertyType}.class),
</#list>
		createAt = new Column(${className}.class, "createAt", "createAt", String.class),
		createBy = new Column(${className}.class, "createBy", "createBy", String.class),
		updateAt = new Column(${className}.class, "updateAt", "updateAt", String.class),
		updateBy = new Column(${className}.class, "updateBy", "updateBy", String.class),
		deleteAt = new Column(${className}.class, "deleteAt", "deleteAt", String.class),
		deleteBy = new Column(${className}.class, "deleteBy", "deleteBy", String.class),
		dr = new Column(${className}.class, "dr", "dr", String.class),
		dataVersion = new Column(${className}.class, "dataVersion", "data_version", String.class)
	;

	private ${className}Column() {}

}