package com.realtech.pandora.templates.dbtools.generatorAll;

import com.realtech.pandora.templates.dbtools.Config;
import com.realtech.pandora.templates.dbtools.exception.GeneratorException;
import com.realtech.pandora.templates.dbtools.generatorP.PsInsertListCopy;
import com.realtech.pandora.templates.dbtools.model.Table;
import com.realtech.pandora.templates.dbtools.model.db.DBBase;
import com.realtech.pandora.templates.dbtools.model.db.DBManager;
import com.realtech.pandora.util.FMGenerator;
import com.realtech.pandora.util.StringUtil;
import freemarker.template.TemplateException;
import org.junit.Test;
//import org.python.antlr.ast.Str;

import java.io.*;
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
        StringBuilder sb = new StringBuilder();
        for(String tableName: tableL) {
//            System.out.print("全表生成：[ " + index++ + "/" + tableL.size() + " ][" + tableName + "]");
            Table table;

            try {
                table = db.queryTables(tableName);
                String s = StringUtil.toUpperCamelCase(tableName);
                System.out.println(  "\""+s+ "\",\""+table.getComment()+"\",\""+"PSProcessorQLL\",");
                sb.append("\""+s+ "\",\""+table.getComment()+"\",\""+"PSProcessorQLL\",").append("\n");
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
//                System.out.println("OK~");
                ++generated;
            } catch (GeneratorException e) {
                errGenerateTableNames.add(tableName);
                System.out.println("error[ " + e.getMessage() + " ]");
            }
        }
        try {
            byteOutStream(sb.toString(),"ps");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("生成器执行结束");
        System.out.println("-->生成： " + generated + "/" + tableL.size());
        if(generated < tableL.size()) {
            System.out.println("-->错误： " + errGenerateTableNames);
        }
    }

    public static void byteOutStream(String msg,String fileNmae) throws Exception {
        //1:使用File类创建一个要操作的文件路径
        File file = new File("D:" + File.separator + "ps" + File.separator + fileNmae+".txt");
        if(!file.getParentFile().exists()){ //如果文件的目录不存在
            file.getParentFile().mkdirs(); //创建目录
        }
        //2: 实例化OutputString 对象
        OutputStream output = new FileOutputStream(file);
        //3: 准备好实现内容的输出
        //将字符串变为字节数组
        byte data[] = msg.getBytes();
        output.write(data);
        //4: 资源操作的最后必须关闭
        output.close();

    }

    @Test
    public  void getStr() throws Exception {
        String encoding = "UTF-8";
        File file = new File("D:\\ps\\ps.txt");
        if (file.isFile() && file.exists()) { //判断文件是否存在
            InputStreamReader read = new InputStreamReader(
                    new FileInputStream(file), encoding);//考虑到编码格式
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            PsInsertListCopy psInsertListCopy = new PsInsertListCopy();
            while ((lineTxt = bufferedReader.readLine()) != null) {
//                System.out.println(lineTxt);
                psInsertListCopy.fieldToAdds.append(lineTxt);
            }
//            System.out.println(psInsertListCopy.fieldToAdds);
            String[] split = psInsertListCopy.fieldToAdds.toString().split(",");
            for(int j = 0; j < split.length; j += 1){
                psInsertListCopy.fieldToAdd.add(split[j]);
            }
            psInsertListCopy.getEnd();

            read.close();
        } else {
            System.out.println("找不到指定的文件");
        }
    }


}