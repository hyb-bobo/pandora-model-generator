<?xml version="1.0"  encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="${basePackage}.writer.${className}Writer">

	<insert id="insert" parameterType="${basePackage}.model.${className}">
		insert into ${tableName} (
			<#if autoIncrementIdConfig == false>${primaryKey},</#if>
		<#list propertyList as property>
			${property.tablePropertyName}<#if property_has_next>,<#elseif (insertPublicProperties != "")>,</#if>
		</#list>
			<#--createAt, createBy,-->
			<#--updateAt, updateBy,-->
			<#--dr, data_version-->
            ${insertPublicTableProperties}
		) values (
            <#if autoIncrementIdConfig == false>${"#"}{id},</#if>
		<#list propertyList as property>
			${"#{" + property.propertyName + "}"}<#if property_has_next>,<#elseif (insertPublicProperties != "")>,</#if>
		</#list>
            ${insertPublicPropertiesVal}
			<#--${"#"}{createAt}, ${"#"}{createBy},-->
			<#--${"#"}{updateAt}, ${"#"}{updateBy},-->
			<#--0, 1-->
		)
	</insert>

	<update id="update" parameterType="${basePackage}.model.${className}">
		update ${tableName} set
        <#if dr!="">
        <if test="${propertiesDr}==0">
            <#list propertyList as property>
            ${property.tablePropertyName} = ${"#{" + property.propertyName + "}"},
            </#list>
            <#--updateAt = ${"#"}{updateAt},-->
            <#--updateBy = ${"#"}{updateBy},-->
            ${updateSqlDr0}
        </if>
        <if test="${propertiesDr}==1">
            <#--updateAt = ${"#"}{updateAt},-->
            <#--updateBy = ${"#"}{updateBy},-->
            <#--deleteAt = ${"#"}{deleteAt},-->
            <#--deleteBy = ${"#"}{deleteBy},-->
            <#--dr = 1,-->
            ${updateSqlDr1}
        </if>
        <#else>
        <#list propertyList as property>
        ${property.tablePropertyName} = ${"#{" + property.propertyName + "}"}<#if property_has_next>,</#if>
        </#list>
        </#if>
        <#if dataVersion!="">
			<#--data_version = data_version + 1-->
        ${updateDataVersionSql}
        </#if>
		where
			${primaryKey} = ${"#"}{id} <#if dataVersion!="">and data_version = ${"#"}{dataVersion}</#if>
	</update>

<#if dr="">
    <delete id="delete" parameterType="java.lang.String">
        delete from ${tableName} where ${primaryKey} = ${"#"}{id}
    </delete>
</#if>

</mapper>