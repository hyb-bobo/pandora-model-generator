package ${basePackage}.model;

import ${basePackage}.model.base.BaseModel;
import com.realtech.pandora.myAnnotation.PKType;
import ${basePackage}.myAnnotation.SkipJsonToString;
import ${basePackage}.tag.Enum;

<#list importList as import>
import ${import};
</#list>

<#if className?index_of("Tpm") == 0>@WriteType("ps")</#if>
@PKType(setType = ${primaryKeyClassType}.class)
public class ${className} extends BaseModel<${primaryKeyClassType}> {

<#list propertyList as property>
	private ${property.propertyType} ${property.propertyName};
</#list>

	@SkipJsonToString
	public ${primaryKeyClassType} get${primaryKeyJava}() {
		return id;
	}

	public void set${primaryKeyJava}(${primaryKeyClassType} id) {
		this.id = id;
	}
	
	public static final Enum businessColumns = new Enum(<#--
		--><#list propertyList as property><#if property_index gt 0>,</#if>
	 	"${property.propertyName}", "${property.natureName}"</#list>
	); 
	
<#list propertyList as property>
	public ${property.propertyType} get${property.methodName}() {
		return ${property.propertyName};
	}

	public void set${property.methodName}(${property.propertyType} ${property.propertyName}) {
		this.${property.propertyName} = ${property.propertyName};
	}
	
</#list>
}