package com.realtech.pandora.templates.dbtools.generatorP;

import java.util.Locale;

/**
 * Created by dell on 2017/6/22.
 */
public class PsInsert {

    // 改变以下的常量值，执行main方法
    public static final String tableName = "TCommonNonScheduleExecuteDetail";          //传入新表对应Bean的名字（实体名）
    public static final String chinaseTableName="非周期执行明细表";       //传入新表对应的中文翻译


    // 以下不用填写
    public static String _TableNameL="";
    public static String _TableNameH="";
    public static String _TableNameV="";
    public static final char UNDERLINE='_';


    public static String camelToUnderline(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if (Character.isUpperCase(c)){
                if(i != 0)
                {
                    sb.append(UNDERLINE);
                }
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0,1).toLowerCase() + tableName.substring(1);
        System.out.println(_TableNameL + "****" + _TableNameH+ "*****" + _TableNameV);
        System.out.println("________________________________PSServerSocketHandler.java___________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        System.out.println("/* " + tableName + "<" + chinaseTableName +"> */\n" +
                "\t\t\t\telse if(pojo.getClazz().equals(" + tableName +".class.getName())) {\n" +
                "\t\t\t\t\tPSProcessor PSProcessor = new PSProcessor();\n" +
                "    \t\t\t\ttry {\n" +
                "    \t\t\t\t\tSqlReplyModel curSqlReplyModel = PSProcessor.process(BillTypeEnum." + _TableNameH + ", pojo, sqlSession, referProcessor);\n" +
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
                "    \t\t\t\t\t/* 'PSProcessor'不支持'" + tableName + "'的处理 */\n" +
                "    \t\t\t\t\tlogger.error(\"\\'" + tableName + "\\' is not supported by \\'PSProcessor\\' currently!\");\n" +
                "\n" +
                "\t\t\t\t\t\t/* 设置‘失败’标志 */\n" +
                "\t\t\t\t\t\tsuccess = false;\n" +
                "\n" +
                "\t\t\t\t\t\t/* 设置‘失败点’现场信息 */\n" +
                "\t\t\t\t\t    sqlExecResult.append(\"\\'" + tableName + "\\' is not supported by \\'PSProcessor\\' currently!\");\n" +
                "\t\t\t\t\t    break;\n" +
                "    \t\t\t\t}\n" +
                "\t\t\t\t}");


        System.out.println("________________________________PSProcessor.java___________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        System.out.println("else if(pojo_type == BillTypeEnum." + _TableNameH + ") {\n" +
                "\t\t\t/* 执行'" + chinaseTableName + "'实体数据库操作 */\n" +
                "\t\t\t"+ tableName + " " + _TableNameV +" = ("+ tableName +")pojo;\n" +
                "\t\t\treturn process" + tableName + "(" + _TableNameV + ", sql_session, refer_processor);\n" +
                "\t\t}");



        System.out.println("_____________________________________________________________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        System.out.println("/**\n" +
                "\t * 执行'"+ tableName +"<" + chinaseTableName +">'的数据库持久化原子操作\n" +
                "\t * @param " + _TableNameL +"\n" +
                "\t * @param sql_session\n" +
                "\t * @param refer_processor\n" +
                "\t * @return SqlReplyModel\n" +
                "\t * @throws\n" +
                "\t */\n" +
                "\tpublic SqlReplyModel process"+ tableName +"("+ tableName +" "+ _TableNameL +", SqlSession sql_session, ReferenceProcessor<BaseModel> refer_processor) {\n" +
                "\t\tPersistenceUtil<"+ tableName +"> persister = new PersistenceUtil<" + tableName + ">();\n" +
                "\t\treturn persister.persist("+ _TableNameL +", sql_session, "+ tableName +"Writer.class, refer_processor);\n" +
                "\t}");


        System.out.println("___________________________________________ BillTypeEnum.java _____________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        System.out.println(_TableNameH + "(" + "code" + ", \"" + tableName + "\", \""+ _TableNameL +"\", \"" + chinaseTableName + "\", \"" + _TableNameL + "\"),");


    }

}
