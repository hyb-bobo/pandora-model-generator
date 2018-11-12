package com.realtech.pandora.templates.dbtools.model.db;

import org.springframework.stereotype.Component;

/**
 * Author: liumangafei
 * Date: 2014/10/25
 * Project Name: generator
 * Description: 数据库连接类，几个方法为了获取到表和字段的相关信息
 */
@Component
public class DBMysql extends DBBase{
    @Override
    protected String getSqlAllTableNames() {
        return null;
    }

    @Override
    protected String getSqlTableName(String tableName) {
        return null;
    }

//	/**
//	 * 根据表名获取表
//	 */
//	public List<Table> queryTables(String... tableNames) {
//		List<Table> li = new ArrayList<>(tableNames.length);
//		for (String tableName : tableNames) {
//			Table table = new Table();
//			table.setPrimaryKey(queryPrimarykey(tableName));
//			table.setTableName(tableName);
//			table.setClassName(StringUtil.toUpperCamelCase(tableName.substring(2)));
//			table.setGenPropertyList(queryField(table));
//			li.add(table);
//		}
//		return li;
//	}

//	/**
//	 * 根据表名获取主键
//	 */
//	public String queryPrimarykey(String tableName) {
//		try {
//			ResultSet rs = conn.getMetaData().getPrimaryKeys(null, null, tableName);
//			rs.next();
//			return rs.getString("PK_NAME");
////			return rs.getString(4);
//		} catch (SQLException e) {
//			System.err.println(tableName);
//			e.printStackTrace();
//			return null;
//		}
//	}

//	/**
//	 * 获取字段和字段对应类型
//	 */
//	public List<Property> queryField(Table table) {
//		List<Property> li = new ArrayList<Property>();
//		try {
//			ResultSet rs = conn.getMetaData().getColumns(null, "%", table.getTableName(), "%");
//			while (rs.next()) {
//				String colName = rs.getString("COLUMN_NAME");
//				int colType = rs.getInt("DATA_TYPE");
//				if (colName.equals(table.getPrimaryKey()) || colName.equalsIgnoreCase("createAt")
//						|| colName.equalsIgnoreCase("createBy") || colName.equalsIgnoreCase("updateAt")
//						|| colName.equalsIgnoreCase("updateBy") || colName.equalsIgnoreCase("deleteAt")
//						|| colName.equalsIgnoreCase("deleteBy") || colName.equalsIgnoreCase("dr")
//						|| colName.equalsIgnoreCase("data_version"))
//					continue;
//
//				Property prop = new Property();
//				prop.setTablePropertyName(colName);
//				prop.setTablePropertyType(colType);
//				prop.setTablePropertyRemarmk(rs.getString("REMARKS"));
//				prop.setPropertyName(StringUtil.toLowerCamelCase(colName));
//				prop.setPropertyType(Type.getJavaType(colType));
//				prop.setMethodName(StringUtil.toUpperCamelCase(colName));
//				prop.setNatureName(colName.replace("_", " "));
//				li.add(prop);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return li;
//	}

//	/**
//	 * 获取所有表名
//	 */
//	public List<String> queryAllTableNames() {
//		List<String> resultList = new ArrayList<String>();
//		try {
//			ResultSet rs = conn.getMetaData().getTables(null, null, null, null);
//			while (rs.next())
//				resultList.add(rs.getString("TABLE_NAME"));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return resultList;
//	}


    @Override
    protected String queryAllDataBasesSQL() {
        return null;
    }
}
