package com.realtech.pandora.templates.dbtools.generatorP;

import com.realtech.pandora.constants.BillTypeEnum;
import com.realtech.pandora.model.TEamPlanTask;
import com.realtech.pandora.model.base.BaseModel;
import com.realtech.pandora.model.persistent.SqlReplyModel;
import com.realtech.pandora.templates.dbtools.generatorAll.*;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/6/22.
 */
public class PsInsertListCopy {


    //TODO 每次修改下面这个数组，执行main方法直接生成 ps 服务所有相关内容
    /**
     * beanName1 数据库表对应的 bean 的类名
     * tableName1 数据库表对应的 中文翻译
     */
    public final List<String> fieldToAdd = new ArrayList<>();
    public  final StringBuilder fieldToAdds = new StringBuilder();


    // 以下不用填写
    public static String _TableNameL = "";
    public static String _TableNameH = "";
    public static String _TableNameV = "";
    public static final char UNDERLINE = '_';

    public String camelToUnderline(String param) {
        if (param == null || "".equals(param.trim())) {
            return "";
        }
        int len = param.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c = param.charAt(i);
            if (Character.isUpperCase(c)) {
                if (i != 0) {
                    sb.append(UNDERLINE);
                }
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public void generaPSServerSocketHandler(String tableName, String chinaseTableName, String psName) {

        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);
        //System.out.println(_TableNameL + "****" + _TableNameH+ "*****" + _TableNameV);
        System.out.println("/* " + tableName + "<" + chinaseTableName + "> */\n" +
                "\t\t\t\telse if(pojo.getClazz().equals(" + tableName + ".class.getName())) {\n" +
                "\t\t\t\t\t" + psName + " Ps = new " + psName + "();\n" +
                "    \t\t\t\ttry {\n" +
                "    \t\t\t\t\tSqlReplyModel curSqlReplyModel = " + psName + ".process(BillTypeEnum." + _TableNameH + ", pojo, sqlSession, referProcessor);\n" +
                "    \t\t\t\t\tif(curSqlReplyModel == null) {\n" +
                "    \t\t\t\t\t\t/* 加载'writer'失败 */\n" +
                "    \t\t\t\t\t\tlogger.error(\"load Writer failed!\");\n" +
                "\n" +
                "    \t\t\t\t\t\t/* 设置‘失败’标志 */\n" +
                "    \t\t\t\t\t\tsuccess = false;\n" +
                "\n" +
                "    \t\t\t\t\t\t/* 设置‘失败点’现场信息 */\n" +
                "    \t\t\t\t\t    sqlExecResult.append(\"load Writer failed!\");\n" +
                "\t\t\t\t\t\t    break;\n" +
                "    \t\t\t\t\t}\n" +
                "\n" +
                "    \t\t\t\t\tif(curSqlReplyModel.getSqlStatus() != SqlStatusEnum.SQL_EXEC_SUCCEED) {\n" +
                "    \t\t\t\t\t\t/* 原子SQL语句执行失败 */\n" +
                "    \t\t\t\t\t\tlogger.error(\"process \\'" + tableName + "\\' model failed!\");\n" +
                "\n" +
                "    \t\t\t\t\t\t/* 设置‘失败’标志 */\n" +
                "    \t\t\t\t\t\tsuccess = false;\n" +
                "    \t\t\t\t\t\t\n" +
                "    \t\t\t\t\t\t/* 设置‘失败点’现场信息 */\n" +
                "    \t\t\t\t\t    sqlExecResult.append(curSqlReplyModel.getSqlClause());\n" +
                "    \t\t\t\t\t    sqlExecResult.append(\"|\");\n" +
                "    \t\t\t\t\t    sqlExecResult.append(curSqlReplyModel.getSqlStatus());\n" +
                "    \t\t\t\t\t    sqlExecResult.append(\";\");\n" +
                "\t\t\t\t\t\t    break;\n" +
                "    \t\t\t\t\t}\n" +
                "    \t\t\t\t}\n" +
                "    \t\t\t\tcatch(UnknownModelTypeException umt) {\n" +
                "    \t\t\t\t\t/* '" + psName + "'不支持'" + tableName + "'的处理 */\n" +
                "    \t\t\t\t\tlogger.error(\"\\'" + tableName + "\\' is not supported by \\'" + psName + "\\' currently!\");\n" +
                "\n" +
                "\t\t\t\t\t\t/* 设置‘失败’标志 */\n" +
                "\t\t\t\t\t\tsuccess = false;\n" +
                "\n" +
                "\t\t\t\t\t\t/* 设置‘失败点’现场信息 */\n" +
                "\t\t\t\t\t    sqlExecResult.append(\"\\'" + tableName + "\\' is not supported by \\'" + psName + "\\' currently!\");\n" +
                "\t\t\t\t\t    break;\n" +
                "    \t\t\t\t}\n" +
                "\t\t\t\t}");
        System.out.println();

    }

    public void generaPSProcessor(String tableName, String chinaseTableName,StringBuilder sbGeneraPSProcessor) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);
/*        System.out.println("else if(pojo_type == BillTypeEnum." + _TableNameH + ") {\n" +
                "\t\t\t*//* 执行'" + chinaseTableName + "'实体数据库操作 *//*\n" +
                "\t\t\t" + tableName + " " + _TableNameV + " = (" + tableName + ")pojo;\n" +
                "\t\t\treturn process" + tableName + "(" + _TableNameV + ", sql_session, refer_processor);\n" +
                "\t\t}");*/
        sbGeneraPSProcessor.append("else if(pojo_type == BillTypeEnum." + _TableNameH.substring(2,_TableNameH.length()-1) + ") {\n" +
                "\t\t\t/* 执行'" + chinaseTableName.substring(1,chinaseTableName.length()-1)  + "'实体数据库操作 */\n" +
                "\t\t\t" + tableName.substring(1,tableName.length()-1) + " " + _TableNameV.substring(1,_TableNameV.length()-1) + " = (" + tableName.substring(1,tableName.length()-1)  + ")pojo;\n" +
                "\t\t\treturn process" + tableName.substring(1,tableName.length()-1) + "(" + _TableNameV.substring(1,_TableNameV.length()-1) + ", sql_session, refer_processor);\n" +
                "\t\t}").append("\n");
    }

    public void generaPSProcessor2(String tableName, String chinaseTableName,StringBuilder sbGeneraPSProcessor) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);
        /*System.out.println("*//**\n" +
                "\t * 执行'" + tableName + "<" + chinaseTableName + ">'的数据库持久化原子操作\n" +
                "\t * @param " + _TableNameL + "\n" +
                "\t * @param sql_session\n" +
                "\t * @param refer_processor\n" +
                "\t * @return SqlReplyModel\n" +
                "\t * @throws\n" +
                "\t *//*\n" +
                "\tpublic SqlReplyModel process" + tableName + "(" + tableName + " " + _TableNameL + ", SqlSession sql_session, ReferenceProcessor<BaseModel> refer_processor) {\n" +
                "\t\tPersistenceUtil<" + tableName + "> persister = new PersistenceUtil<" + tableName + ">();\n" +
                "\t\treturn persister.persist(" + _TableNameL + ", sql_session, " + tableName + "Writer.class, refer_processor);\n" +
                "\t}");
        System.out.println();*/
        sbGeneraPSProcessor.append("/**\n" +
                "\t * 执行'" + tableName.substring(1,tableName.length()-1) + "<" + chinaseTableName.substring(1,chinaseTableName.length()-1) + ">'的数据库持久化原子操作\n" +
                "\t * @param " + _TableNameL + "\n" +
                "\t * @param sql_session\n" +
                "\t * @param refer_processor\n" +
                "\t * @return SqlReplyModel\n" +
                "\t * @throws\n" +
                "\t */\n" +
                "\tpublic SqlReplyModel process" + tableName.substring(1,tableName.length()-1) + "(" + tableName.substring(1,tableName.length()-1) + " " + _TableNameL.substring(1,_TableNameL.length()-1) + ", SqlSession sql_session, ReferenceProcessor<BaseModel> refer_processor) {\n" +
                "\t\tPersistenceUtil<" + tableName.substring(1,tableName.length()-1)  + "> persister = new PersistenceUtil<" + tableName.substring(1,tableName.length()-1)  + ">();\n" +
                "\t\treturn persister.persist(" +  _TableNameL.substring(1,_TableNameL.length()-1) + ", sql_session, " + tableName.substring(1,tableName.length()-1)  + "Writer.class, refer_processor);\n" +
                "\t}").append("\n");

    }

    public void generaBillTypeEnum(String tableName, String chinaseTableName,StringBuilder sbGeneraBillTypeEnum) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);
//        System.out.println(_TableNameH + "(" + "code" + ", \"" + tableName + "\", \"" + _TableNameL + "\", \"" + chinaseTableName + "\", \"" + _TableNameL + "\"),");
        sbGeneraBillTypeEnum.append(_TableNameH.substring(2, _TableNameH.length()-1) + "(" + "code" + ", \"" + tableName.substring(1,tableName.length()-1) + "\", \"" + _TableNameL.substring(2, _TableNameL.length()-1)  + "\", \"" + chinaseTableName.substring(1,chinaseTableName.length()-1) + "\", \"" +  _TableNameL.substring(2, _TableNameL.length()-1)  + "\"),").append("\n");
    }

    public void getEnd(){
        StringBuilder sbGeneraPSServerSocketHandler1 = new StringBuilder();
        StringBuilder sbGeneraPSProcessor = new StringBuilder();
        StringBuilder sbGeneraPSProcessor2 = new StringBuilder();
        StringBuilder sbGeneraBillTypeEnum = new StringBuilder();

        PsInsertListCopy ps = new PsInsertListCopy();
        System.out.println("________________________________ PSServerSocketHandler.java___________________________________________________________________");
        System.out.println("________________________________ PSProcessorPOJOEnum.java___________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        System.out.println();
        for (int j = 0; j < fieldToAdd.size(); j += 3) {
            ps.generaPSServerSocketHandler2(fieldToAdd.get(j), fieldToAdd.get(j+1), fieldToAdd.get(j+2),sbGeneraPSServerSocketHandler1);
        }
        try {
            com.realtech.pandora.templates.dbtools.generatorAll.Main.byteOutStream(sbGeneraPSServerSocketHandler1.toString(),"PSProcessorPOJOEnum");
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("________________________________ PSProcessor.java____________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        for (int j = 0; j < fieldToAdd.size(); j += 3) {
            ps.generaPSProcessor(fieldToAdd.get(j), fieldToAdd.get(j+1),sbGeneraPSProcessor);
        }
        try {
            com.realtech.pandora.templates.dbtools.generatorAll.Main.byteOutStream(sbGeneraPSProcessor.toString(),"PSProcessor1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("===============================================================================");
        for (int j = 0; j < fieldToAdd.size(); j += 3) {
            ps.generaPSProcessor2(fieldToAdd.get(j), fieldToAdd.get(j+1),sbGeneraPSProcessor2);
        }
        try {
            com.realtech.pandora.templates.dbtools.generatorAll.Main.byteOutStream(sbGeneraPSProcessor2.toString(),"PSProcessor2");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("________________________________ BillTypeEnum.java __________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        for (int j = 0; j < fieldToAdd.size(); j += 3) {
            ps.generaBillTypeEnum(fieldToAdd.get(j), fieldToAdd.get(j+1),sbGeneraBillTypeEnum);
        }
        try {
            com.realtech.pandora.templates.dbtools.generatorAll.Main.byteOutStream(sbGeneraBillTypeEnum.toString(),"BillTypeEnum");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void generaPSServerSocketHandler1(String tableName, String chinaseTableName, String psName,StringBuilder sbGeneraPSServerSocketHandler1) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);
/*        System.out.println("*//* " + tableName + "<" + chinaseTableName + "> *//*\n" +
                "\t\t\t\telse if(pojo.getClazz().equals(" + tableName + ".class.getName())) {\n" +
                "\t\t\t\tsuccess = new ModelHandler(sqlExecResult, BillTypeEnum." + _TableNameH + ", new "+psName+"()).execute(pojo, sqlSession, referProcessor);\n" +
                "\t\t\t\t}");
        System.out.println();*/
        sbGeneraPSServerSocketHandler1.append("/* " + tableName + "<" + chinaseTableName + "> */\n" +
                "\t\t\t\telse if(pojo.getClazz().equals(" + tableName + ".class.getName())) {\n" +
                "\t\t\t\tsuccess = new ModelHandler(sqlExecResult, BillTypeEnum." + _TableNameH + ", new "+psName+"()).execute(pojo, sqlSession, referProcessor);\n" +
                "\t\t\t\t}").append("\n");

    }
//    QmsIssueDateDistribution(TQmsIssueDateDistribution.class, BillTypeEnum.T_QMS_ISSUE_DATE_DISTRIBUTION),
public void generaPSServerSocketHandler2(String tableName, String chinaseTableName, String psName,StringBuilder sbGeneraPSServerSocketHandler1) {
    _TableNameL = camelToUnderline(tableName);
    _TableNameH = _TableNameL.toUpperCase();
    _TableNameV = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);

    sbGeneraPSServerSocketHandler1.append( tableName.substring(1, tableName.length()-1)+"(com.eohi.yun.model."+tableName.substring(1, tableName.length()-1)+".class," +
            "BillTypeEnum."+_TableNameH.substring(2, _TableNameH.length()-1)+"),"+"\n");

    /*sbGeneraPSServerSocketHandler1.append( "QLL_"+tableName.substring(1, tableName.length()-1)+"(com.eohi.qll.model."+ tableName.substring(1, tableName.length()-1)+".class," +
            "BillTypeEnum.QLL_"+_TableNameH.substring(2, _TableNameH.length()-1)+"),"+"\n");*/

}

    final static String cfn = "net.sourceforge.jtds.jdbc.Driver";
    final static String url = "jdbc:jtds:sqlserver://192.168.0.8:1433/eohi-yun-db";

    @Test
    public void fieldToAdd (){
        StringBuilder fieldToAdd = new StringBuilder();
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet res = null;
        try {
            Class.forName(cfn);
            con = DriverManager.getConnection(url,"sa","Admin2012");

            String sql = "SELECT\n" +
                    "\tc.name,\n" +
                    "\tCAST (\n" +
                    "\t\tisnull(f.[value], '') AS nvarchar (100)\n" +
                    "\t) AS remark\n" +
                    "FROM\n" +
                    "\tsys.objects c\n" +
                    "LEFT JOIN sys.extended_properties f ON f.major_id = c.object_id\n" +
                    "AND f.minor_id = 0\n" +
                    "AND f.class = 1\n" +
                    "WHERE\n" +
                    "\tc.type = 'u'";//查询test表
            statement = con.prepareStatement(sql);
            res = statement.executeQuery();
            while(res.next()){
                String title = res.getString("name");//获取test_name列的元素                                                                                                                                                    ;
                System.out.println("姓名："+title);
                String remark = res.getString("remark");//获取test_name列的元素                                                                                                                                                    ;
                System.out.println("姓名："+remark);
                fieldToAdd.append(title).append(",").append(remark).append(",");
            }
            System.out.println(fieldToAdd);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                if(res != null) res.close();
                if(statement != null) statement.close();
                if(con != null) con.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
    }


}
