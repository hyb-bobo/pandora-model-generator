package com.realtech.pandora.templates.dbtools.generatorP;

/**
 * Created by dell on 2017/6/22.
 */
public class PsInsertList {

    //TODO 每次修改下面这个数组，执行main方法直接生成 ps 服务所有相关内容
    /**
     * beanName1 数据库表对应的 bean 的类名
     * tableName1 数据库表对应的 中文翻译
     */
    public static final String[] fieldToAdd = new String[] {
            "TWfWorkItem","流程工作项表","TWfDef","流程定义表","TWfActivityInboundStatusDef","流程活动入口状态定义表","TWfActivityActionDef","流程活动操作定义表","TWfActivityDef","流程活动定义表","TWfActivityFormulaDef","流程活动执行公式定义表","TWfRoleActivityLink","流程活动执行角色定义表","TWfInstance","流程实例表","TMdmUnicodeType","编码类型表","TMdmUnicodeTypeAttributes","编码类型属性表","TMdmUnicodeApplicationForm","编码申请表","TMdmUnicode","编码表","TMdmUnicodeRuleTemplate","编码规则模板表","TMdmUnicodeRule","编码规则表","TUnicodeRuleTemplateFormat","编码规则模板格式表","TEaiServiceRegister","接口服务注册表","TEaiServiceParamDef","接口服务参数定义表","TEaiErrorCodeDef","接口错误代码表","TEaiIoFlow","接口流水表"
    };

    // 以下不用填写
    public static String _TableNameL="";
    public static String _TableNameH="";
    public static String _TableNameV="";
    public static final char UNDERLINE='_';

    public  String camelToUnderline(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
             char c=param.charAt(i);
             if (Character.isUpperCase(c)){
                 if(i != 0){
                     sb.append(UNDERLINE);
                 }
                 sb.append(Character.toLowerCase(c));
             }else{
                 sb.append(c);
             }
        }
        return sb.toString();
    }

    public void generaPSServerSocketHandler(String tableName , String chinaseTableName){

        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0,1).toLowerCase() + tableName.substring(1);
        //System.out.println(_TableNameL + "****" + _TableNameH+ "*****" + _TableNameV);
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
               System.out.println();

    }

    public void generaPSProcessor(String tableName , String chinaseTableName) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0,1).toLowerCase() + tableName.substring(1);
        System.out.println("else if(pojo_type == BillTypeEnum." + _TableNameH + ") {\n" +
                "\t\t\t/* 执行'" + chinaseTableName + "'实体数据库操作 */\n" +
                "\t\t\t" + tableName + " " + _TableNameV + " = (" + tableName + ")pojo;\n" +
                "\t\t\treturn process" + tableName + "(" + _TableNameV + ", sql_session, refer_processor);\n" +
                "\t\t}");
    }

    public void generaPSProcessor2(String tableName , String chinaseTableName) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0,1).toLowerCase() + tableName.substring(1);
        System.out.println("/**\n" +
                "\t * 执行'" + tableName + "<" + chinaseTableName + ">'的数据库持久化原子操作\n" +
                "\t * @param " + _TableNameL + "\n" +
                "\t * @param sql_session\n" +
                "\t * @param refer_processor\n" +
                "\t * @return SqlReplyModel\n" +
                "\t * @throws\n" +
                "\t */\n" +
                "\tpublic SqlReplyModel process" + tableName + "(" + tableName + " " + _TableNameL + ", SqlSession sql_session, ReferenceProcessor<BaseModel> refer_processor) {\n" +
                "\t\tPersistenceUtil<" + tableName + "> persister = new PersistenceUtil<" + tableName + ">();\n" +
                "\t\treturn persister.persist(" + _TableNameL + ", sql_session, " + tableName + "Writer.class, refer_processor);\n" +
                "\t}");
        System.out.println();
    }

    public void generaBillTypeEnum(String tableName , String chinaseTableName){
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0,1).toLowerCase() + tableName.substring(1);
        System.out.println(_TableNameH + "(" + "code" + ", \"" + tableName + "\", \""+ _TableNameL +"\", \"" + chinaseTableName + "\", \"" + _TableNameL + "\"),");
    }

    public static void main(String[] args) {
        PsInsertList ps = new PsInsertList();

        System.out.println("________________________________PSServerSocketHandler.java___________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        System.out.println();
        for (int j=0; j<fieldToAdd.length; j+=2) {
            ps.generaPSServerSocketHandler(fieldToAdd[j],fieldToAdd[j+1]);
        }

        System.out.println("________________________________PSProcessor.java____________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        for (int j=0; j<fieldToAdd.length; j+=2) {
            ps.generaPSProcessor(fieldToAdd[j],fieldToAdd[j+1]);
        }
        System.out.println();
        System.out.println("===============================================================================");
        for (int j=0; j<fieldToAdd.length; j+=2) {
            ps.generaPSProcessor2(fieldToAdd[j],fieldToAdd[j+1]);
        }

        System.out.println("________________________________ BillTypeEnum.java __________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        for (int j=0; j<fieldToAdd.length; j+=2) {
            ps.generaBillTypeEnum(fieldToAdd[j],fieldToAdd[j+1]);
        }

    }

}
