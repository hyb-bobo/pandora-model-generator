package com.realtech.pandora.templates.dbtools.generatorP2;

import java.io.InputStream;
import java.util.Properties;

import com.realtech.pandora.templates.dbtools.Config;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.db.DBBase;
import com.realtech.pandora.templates.dbtools.model.db.DBManager;
import com.realtech.pandora.util.FMGenerator;

/**
 * Author: liumangafei Date: 2014/10/25 Project Name: generator Description:
 * 生成器的主要生成类，运行该类可以生成对应的model、xml文件
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Properties config = new Properties();
		InputStream is = Main.class.getClassLoader().getResourceAsStream("dbtools.properties");
        config.load(is);
        DBBase db = DBManager.getInstance();
		for(String tableName: Config.tableNames.split(",")) {
			Table table = db.queryTables(tableName);
//		for (Table table : db.queryTables(config.getProperty("tableNames").split(","))) {
			new FMGenerator(config, table)
				.replace("$className", table.getClassName())
				.replace("$package", config.getProperty("basePackage").replace(".", "/"))
				.generateFile("d:/work/apollo-model/src/main/java/$package/model/column/$classNameColumn.java", "templates/dbtools/column.ftl")
			;
		}
		System.out.println("生成器执行结束");
	}

}
