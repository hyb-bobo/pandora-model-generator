package com.realtech.pandora.templates.dbtools.generator;

import com.realtech.pandora.templates.dbtools.Config;
import com.realtech.pandora.templates.dbtools.exception.GeneratorException;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.db.DBBase;
import com.realtech.pandora.templates.dbtools.model.db.DBManager;
import com.realtech.pandora.util.FMGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

/**
 * Author: liumangafei Date: 2014/10/25 Project Name: generator Description:
 * 生成器的主要生成类，运行该类可以生成对应的model、xml文件
 */
public class Main {

	public static void main(String[] args) throws Exception {
        DBBase db = DBManager.getInstance();
        for(String tableName: Config.tableNames.split(",")) {
//		for (Table table : db.queryTables()) {
			Table table = db.queryTables(tableName);
//			System.out.println("指定表[ " + table.getTableName() + " ]开始生成");
//			System.out.println("-=-=-=-=-=-=-=-=-");
			System.out.println("table.getClassName() = "+table.getClassName());
			new FMGenerator(Config.properties, table)
				.replace("$className", table.getClassName())
				.replace("$package", Config.basePackage.replace(".", "/"))
				.generateFile("model/java/$package/model/$className.java", "templates/dbtools/model.ftl")
				.generateFile("model/java/$package/reader/$classNameReader.java", "templates/dbtools/reader.ftl")
				.generateFile("model/java/$package/writer/$classNameWriter.java", "templates/dbtools/writer.ftl")
				.generateFile("model/resources/$package/xml/reader/$className.xml", "templates/dbtools/readerXml.ftl")
				.generateFile("model/resources/$package/xml/writer/$className.xml", "templates/dbtools/writerXml.ftl")
				.generateFile("portal/$package/service/$classNameService.java", "templates/dbtools/service.ftl")
				.generateFile("portal/$package/service/impl/$classNameServiceImpl.java", "templates/dbtools/serviceImpl.ftl");
		}
	}

	public static void genertaor(String tableName) throws GeneratorException, IOException, TemplateException {
        DBBase db = DBManager.getInstance();
        Table table = db.queryTables(tableName);
        System.out.print("指定表[ " + table.getTableName() + " ]开始生成");
        new FMGenerator(Config.properties, table)
                .replace("$className", table.getClassName())
                .replace("$package", Config.basePackage.replace(".", "/"))
                .generateFile("model/java/$package/model/$className.java", "templates/dbtools/model.ftl")
                .generateFile("model/java/$package/reader/$classNameReader.java", "templates/dbtools/reader.ftl")
                .generateFile("model/java/$package/writer/$classNameWriter.java", "templates/dbtools/writer.ftl")
                .generateFile("model/resources/$package/xml/reader/$className.xml", "templates/dbtools/readerXml.ftl")
                .generateFile("model/resources/$package/xml/writer/$className.xml", "templates/dbtools/writerXml.ftl")
                .generateFile("portal/$package/service/$classNameService.java", "templates/dbtools/service.ftl")
                .generateFile("portal/$package/service/impl/$classNameServiceImpl.java", "templates/dbtools/serviceImpl.ftl");
            System.out.println("OK~");
	}

}
