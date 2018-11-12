package com.realtech.pandora.templates.dbtools.generatorAll;

import com.realtech.pandora.templates.dbtools.Config;
import com.realtech.pandora.templates.dbtools.exception.GeneratorException;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.db.DBBase;
import com.realtech.pandora.templates.dbtools.model.db.DBManager;
import com.realtech.pandora.util.FMGenerator;
import freemarker.template.TemplateException;
//import org.python.antlr.ast.Str;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/4/26.
 * 生成所有的表
 */
public class Main {
    public static void main(String[] args) throws IOException, TemplateException {
        DBBase db = DBManager.getInstance();
        List<String> tableL = db.queryAllTableNames();
        int index = 1, generated = 0;
        List<String> errGenerateTableNames = new ArrayList<>();
        for(String tableName: tableL) {
            System.out.print("全表生成：[ " + index++ + "/" + tableL.size() + " ][" + tableName + "]");
            Table table;
            try {
                table = db.queryTables(tableName);
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
                ++generated;
            } catch (GeneratorException e) {
                errGenerateTableNames.add(tableName);
                System.out.println("error[ " + e.getMessage() + " ]");
            }
        }
        System.out.println("生成器执行结束");
        System.out.println("-->生成： " + generated + "/" + tableL.size());
        if(generated < tableL.size()) {
            System.out.println("-->错误： " + errGenerateTableNames);
        }
    }
}