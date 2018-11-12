<?xml version="1.0"  encoding="UTF-8" ?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd" >
<mapper namespace="${basePackage}.reader.${className}Reader">

	<resultMap id="${modelResultMap}" type="${basePackage}.model.${className}">
		<id property="id" column="${primaryKey}" />
		<#list propertyList as property>
		<result property="${property.propertyName}" column="${property.tablePropertyName}" />
		</#list>
		<#list publicPropertyList as property>
        <result property="${property.propertyName}" column="${property.tablePropertyName}" />
		</#list>
		<#--<result property="createAt" column="createAt" />-->
		<#--<result property="createBy" column="createBy" />-->
		<#--<result property="updateAt" column="updateAt" />-->
		<#--<result property="updateBy" column="updateBy" />-->
		<#--<result property="deleteAt" column="deleteAt" />-->
		<#--<result property="deleteBy" column="deleteBy" />-->
		<#--<result property="dr" column="dr" />-->
		<#--<result property="dataVersion" column="data_version" />-->
	</resultMap>
	
	<!--用于非关联查询使用，不要改-->
	<resultMap id="${modelResultMap}2" type="${basePackage}.model.${className}">
		<id property="id" column="${primaryKey}" />
		<#list propertyList as property>
		<result property="${property.propertyName}" column="${property.tablePropertyName}" />
		</#list>
		<#list publicPropertyList as property>
		<result property="${property.propertyName}" column="${property.tablePropertyName}" />
		</#list>
		<#--<result property="createAt" column="createAt" />-->
		<#--<result property="createBy" column="createBy" />-->
		<#--<result property="updateAt" column="updateAt" />-->
		<#--<result property="updateBy" column="updateBy" />-->
		<#--<result property="deleteAt" column="deleteAt" />-->
		<#--<result property="deleteBy" column="deleteBy" />-->
		<#--<result property="dr" column="dr" />-->
		<#--<result property="dataVersion" column="data_version" />-->
	</resultMap>

	<sql id="selectClause">
		${primaryKey},
		<#list propertyList as property>
		${property.tablePropertyName}<#if property_has_next>,<#elseif (publicPropertyList?size>0)>,</#if>
		</#list>
		<#list publicPropertyList as property>
        ${property.tablePropertyName}<#if property_has_next>,</#if>
		</#list>
		<#--createAt, createBy,-->
		<#--updateAt, updateBy,-->
		<#--deleteAt, deleteBy,-->
		<#--dr, data_version-->
	</sql>


    <#--2 为mysql语法，mysql分页查询是limit语法-->
    <#if dbType="2">
    <select id="get" resultMap="${modelResultMap}">
        select
        <include refid="selectClause" />
        from ${tableName}
        where
        ${primaryKey} = ${"#"}{id}
        limit 1
    </select>

    <!--用于非关联查询使用-->
    <select id="get2" resultMap="${modelResultMap}2">
        select
        <include refid="selectClause" />
        from ${tableName}
        where
        ${primaryKey} = ${"#"}{id}
        limit 1
    </select>

    <select id="query" parameterType="${basePackage}.sql.Where" resultMap="${modelResultMap}">
        select
        <include refid="selectClause" />
        from
        ${tableName}
            <if test="join != null">
            ${"$"}{join}
            </if>
        ${"$"}{whereHead}
        <trim suffixOverrides="and">
            <if test="id != null">
            ${primaryKey} = ${"#"}{id} and
            </if>
        ${"$"}{whereClause}
        </trim>
        <if test="groupBy != null">
            group by
        ${"$"}{groupBy}
        </if>
        <if test="orderBy != null">
            order by
        ${"$"}{orderBy}
        </if>
        <if test="pageSize != 0">
            limit ${"#"}{startRow}, ${"#"}{pageSize}
        </if>
    </select>

    <!--用于非关联查询使用-->
    <select id="query2" parameterType="${basePackage}.sql.Where" resultMap="${modelResultMap}2">
        select
        <include refid="selectClause" />
        from
        ${tableName}
            <if test="join != null">
            ${"$"}{join}
            </if>
        ${"$"}{whereHead}
        <trim suffixOverrides="and">
            <if test="id != null">
            ${primaryKey} = ${"#"}{id} and
            </if>
        ${"$"}{whereClause}
        </trim>
        <if test="groupBy != null">
            group by
        ${"$"}{groupBy}
        </if>
        <if test="orderBy != null">
            order by
        ${"$"}{orderBy}
        </if>
        <if test="pageSize != 0">
            limit ${"#"}{startRow}, ${"#"}{pageSize}
        </if>
    </select>
    <#--3 为sqlserver语法，sqlserver分页查询是top语法-->
    <#elseif dbType="3">
    <select id="get" resultMap="${modelResultMap}">
        select top 1
        <include refid="selectClause" />
        from ${tableName}
        where
        ${primaryKey} = ${"#"}{id}
    </select>

    <!--用于非关联查询使用-->
    <select id="get2" resultMap="${modelResultMap}2">
        select top 1
        <include refid="selectClause" />
        from ${tableName}
        where
        ${primaryKey} = ${"#"}{id}
    </select>

    <select id="query" parameterType="${basePackage}.sql.Where" resultMap="${modelResultMap}">
        select
        <if test="pageSize != 0">
            * FROM(
            SELECT TOP ${"$"}{allRowNums}
            ROW_NUMBER() OVER(
            <if test="orderBy != null">
                order by
            ${"$"}{orderBy}
            </if>
            <if test="orderBy == null">
                order by
                ${primaryKey}
            </if>
            ) AS ROWID,
        </if>
        <include refid="selectClause" />
        FROM ${tableName}
        <if test="join != null">
        ${"$"}{join}
        </if>
        ${"$"}{whereHead}
        <trim suffixOverrides="and">
            <if test="id != null">
                ${primaryKey} = ${"#"}{id} and
            </if>
        ${"$"}{whereClause}
        </trim>
        <if test="groupBy != null">
            group by
        ${"$"}{groupBy}
        </if>
        <if test="(pageSize == null or pageSize == 0)and orderBy != null">
            order by
        ${"$"}{orderBy}
        </if>
        <if test="pageSize != 0">
            ) AS TEMP1
            WHERE ROWID> ${"$"}{startRow}
        </if>
    </select>

    <!--用于非关联查询使用-->
    <select id="query2" parameterType="${basePackage}.sql.Where" resultMap="${modelResultMap}2">
        select
        <if test="pageSize != 0">
            * FROM(
            SELECT TOP ${"$"}{allRowNums}
            ROW_NUMBER() OVER(
            <if test="orderBy != null">
                order by
            ${"$"}{orderBy}
            </if>
            <if test="orderBy == null">
                order by
            ${primaryKey}
            </if>
            ) AS ROWID,
        </if>
        <include refid="selectClause" />
        FROM ${tableName}
        <if test="join != null">
        ${"$"}{join}
        </if>
    ${"#"}{whereHead}
        <trim suffixOverrides="and">
            <if test="id != null">
            ${primaryKey} = ${"#"}{id} and
            </if>
        ${"$"}{whereClause}
        </trim>
        <if test="groupBy != null">
            group by
        ${"$"}{groupBy}
        </if>
        <if test="(pageSize == null or pageSize == 0)and orderBy != null">
            order by
        ${"$"}{orderBy}
        </if>
        <if test="pageSize != 0">
            ) AS TEMP1
            WHERE ROWID> ${"$"}{startRow}
        </if>
    </select>
    </#if>

	<select id="count" parameterType="${basePackage}.sql.Where" resultType="java.lang.Integer">
		select
			count(*)
		from
			${tableName}
		<if test="join != null">
			${"$"}{join}
		</if>
		${"$"}{whereHead}
		${"$"}{whereClause}
		<if test="groupBy != null">
		group by
			${"$"}{groupBy}
		</if>
	</select>
	

</mapper>