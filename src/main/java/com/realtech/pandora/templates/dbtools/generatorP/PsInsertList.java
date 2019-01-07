package com.realtech.pandora.templates.dbtools.generatorP;

import com.realtech.pandora.constants.BillTypeEnum;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by dell on 2017/6/22.
 */
public class PsInsertList {


    //TODO 每次修改下面这个数组，执行main方法直接生成 ps 服务所有相关内容
    /**
     * beanName1 数据库表对应的 bean 的类名
     * tableName1 数据库表对应的 中文翻译
     */
    public static final String[] fieldToAdd = new String[]{
//            "TWfWorkItem","流程工作项表",
//            "TEamEquipmentMaintenanceStatistics","设备保养及时率统计表",
//            "TEamEquipmentRepairStatistics","设备维修及时率统计表",
//            "TBdItem","物料表",
//            "TBdItemType","物料类型表",
//            "TBdItemTypeAttribute","物料类型属性表",
//            "TBdItemTypeAttributeValue","物料类型属性值表",
//            "TBdProcess","工序表",
//            "TBdProcessParameter","工艺参数表",
//            "TBdProcessRoute","工艺路线表",
//            "TBdBom","计量单位表",
//            "TBdCustomer","客户表",
//            "TBdBomHead","BOM头表",
//            "TBdWorkshop","车间表",
//            "TBdShift","班次表",
//            "TBdCompany","公司表",
//            "TBdLanguage","语言表",
//            "TTeamMember","班组成员表",
//            "TBdOrganization","组织机构表","PSProcessorQLL",
//            "TBdDepartment","部门表",
//            "TBdProductionTeam","班组表",
//            "TBdPerson","人员表",
//            "TEamEquipmentMaintenanceStatistics","设备保养及时率统计表",
//            "TWfDef","流程定义表",
//            "TWfActivityInboundStatusDef","流程活动入口状态定义表","TWfActivityActionDef","流程活动操作定义表","TWfActivityDef","流程活动定义表","TWfActivityFormulaDef","流程活动执行公式定义表","TWfRoleActivityLink","流程活动执行角色定义表","TWfInstance","流程实例表","TMdmUnicodeType","编码类型表","TMdmUnicodeTypeAttributes","编码类型属性表","TMdmUnicodeApplicationForm","编码申请表","TMdmUnicode","编码表","TMdmUnicodeRuleTemplate","编码规则模板表","TMdmUnicodeRule","编码规则表","TUnicodeRuleTemplateFormat","编码规则模板格式表","TEaiServiceRegister","接口服务注册表","TEaiServiceParamDef","接口服务参数定义表","TEaiErrorCodeDef","接口错误代码表","TEaiIoFlow","接口流水表"
            "T700Company", "公司表", "PSProcessorQLL",
            "T700Country", "国家表", "PSProcessorQLL",
            "T700Currency", "币种表", "PSProcessorQLL",
            "T700Factory", "工厂表", "PSProcessorQLL",
            "T700Language", "语言表", "PSProcessorQLL",
            "T700Member", "会员表", "PSProcessorQLL",
            "T700Person", "人员表", "PSProcessorQLL",
            "T700Position", "岗位表", "PSProcessorQLL",
            "T700Process", "工序表", "PSProcessorQLL",
            "T700ProcessParameter", "工艺参数表", "PSProcessorQLL",
            "T700ProcessRoute", "工艺路线表", "PSProcessorQLL",
            "T700Product", "产品表", "PSProcessorQLL",
            "T700ProductCategory", "产品分类表", "PSProcessorQLL",
            "T700ProductCategoryAttribute", "产品分类属性表", "PSProcessorQLL",
            "T700ProductCategoryAttributeValue", "产品分类属性值表", "PSProcessorQLL",
            "T700Region", "地区表", "PSProcessorQLL",
            "T700TransportMethod", "运输方式表", "PSProcessorQLL",
            "T700Uom", "计量单位表", "PSProcessorQLL",
            "T700Website", "网站表", "PSProcessorQLL",
            "T700WebsiteCopyright", "版权声明表", "PSProcessorQLL",
            "TBdBom", "BOM表", "PSProcessorQLL",
            "TBdBomHead", "BOM头表", "PSProcessorQLL",
            "TBdCompany", "公司表", "PSProcessorQLL",
            "TBdCountry", "国家表", "PSProcessorQLL",
            "TBdCustomer", "客户表", "PSProcessorQLL",
            "TBdDepartment", "部门表", "PSProcessorQLL",
            "TBdEquipment", "设备表", "PSProcessorQLL",
            "TBdEquipmentFault", "设备故障描述表", "PSProcessorQLL",
            "TBdEquipmentManufacturer", "设备制造商表", "PSProcessorQLL",
            "TBdEquipmentModel", "设备型号表", "PSProcessorQLL",
            "TBdEquipmentResume", "设备履历表", "PSProcessorQLL",
            "TBdEquipmentType", "设备类型表", "PSProcessorQLL",
            "TBdFactory", "工厂表", "PSProcessorQLL",
            "TBdFactoryLocation", "工厂地点表", "PSProcessorQLL",
            "TBdItem", "物料表", "PSProcessorQLL",
            "TBdItemType", "物料类型表", "PSProcessorQLL",
            "TBdItemTypeAttribute", "物料类型属性表", "PSProcessorQLL",
            "TBdItemTypeAttributeValue", "物料类型属性值表", "PSProcessorQLL",
            "TBdLanguage", "语言表", "PSProcessorQLL",
            "TBdMould", "模具表", "PSProcessorQLL",
            "TBdMouldManufacturer", "模具制造商表", "PSProcessorQLL",
            "TBdMouldModel", "模具型号表", "PSProcessorQLL",
            "TBdMouldResume", "模具履历表", "PSProcessorQLL",
            "TBdMouldType", "模具类型表", "PSProcessorQLL",
            "TBdOrganization", "组织机构表", "PSProcessorQLL",
            "TBdPerson", "人员表", "PSProcessorQLL",
            "TBdPosition", "岗位表", "PSProcessorQLL",
            "TBdProcess", "工序表", "PSProcessorQLL",
            "TBdProcessParameter", "工艺参数表", "PSProcessorQLL",
            "TBdProcessRoute", "工艺路线表", "PSProcessorQLL",
//            "TBdProductUnit","","PSProcessorQLL",
            "TBdProductionTeam", "班组表", "PSProcessorQLL",
//            "TBdProductionTeamMember","","PSProcessorQLL",
            "TBdShift", "班次表", "PSProcessorQLL",
            "TBdSparePart", "备品备件表", "PSProcessorQLL",
            "TBdSparePartCategory", "备品备件分类表", "PSProcessorQLL",
            "TBdSparePartModel", "备品备件型号表", "PSProcessorQLL",
            "TBdSparePartSupplier", "备品备件供应商表", "PSProcessorQLL",
            "TBdTerminal", "终端表", "PSProcessorQLL",
//            "TBdTransportMethod","","PSProcessorQLL",
            "TBdUom", "计量单位表", "PSProcessorQLL",
            "TBdWarehouse", "仓库表", "PSProcessorQLL",
            "TBdWorkshop", "车间表", "PSProcessorQLL",
            "TEquipmentLink", "设备关联表", "PSProcessorQLL",
            "TEquipmentModelSparePartLink", "设备型号_备品备件_关联表", "PSProcessorQLL",
            "TFactoryLocationLink", "工厂地点关联表", "PSProcessorQLL",
            "TPersonLink", "人员关联表", "PSProcessorQLL",
//            "TTeamLocationLink","","PSProcessorQLL",
//            "TTeamShiftPersonLink","","PSProcessorQLL",
            "TTeamMember", "班组成员表", "PSProcessorQLL",
    };

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

    public void generaPSProcessor(String tableName, String chinaseTableName) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);
        System.out.println("else if(pojo_type == BillTypeEnum." + _TableNameH + ") {\n" +
                "\t\t\t/* 执行'" + chinaseTableName + "'实体数据库操作 */\n" +
                "\t\t\t" + tableName + " " + _TableNameV + " = (" + tableName + ")pojo;\n" +
                "\t\t\treturn process" + tableName + "(" + _TableNameV + ", sql_session, refer_processor);\n" +
                "\t\t}");
    }

    public void generaPSProcessor2(String tableName, String chinaseTableName) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);
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

    public void generaBillTypeEnum(String tableName, String chinaseTableName) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);
        System.out.println(_TableNameH + "(" + "code" + ", \"" + tableName + "\", \"" + _TableNameL + "\", \"" + chinaseTableName + "\", \"" + _TableNameL + "\"),");
    }

    public static void main(String[] args) {







        PsInsertList ps = new PsInsertList();

        System.out.println("________________________________ PSServerSocketHandler.java___________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        System.out.println();
        for (int j = 0; j < fieldToAdd.length; j += 3) {
            ps.generaPSServerSocketHandler1(fieldToAdd[j], fieldToAdd[j + 1], fieldToAdd[j + 2]);
        }

        System.out.println("________________________________ PSProcessor.java____________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        for (int j = 0; j < fieldToAdd.length; j += 3) {
            ps.generaPSProcessor(fieldToAdd[j], fieldToAdd[j + 1]);
        }
        System.out.println();
        System.out.println("===============================================================================");
        for (int j = 0; j < fieldToAdd.length; j += 3) {
            ps.generaPSProcessor2(fieldToAdd[j], fieldToAdd[j + 1]);
        }

        System.out.println("________________________________ BillTypeEnum.java __________________________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________________________________");
        for (int j = 0; j < fieldToAdd.length; j += 3) {
            ps.generaBillTypeEnum(fieldToAdd[j], fieldToAdd[j + 1]);
        }

    }

    private void generaPSServerSocketHandler1(String tableName, String chinaseTableName, String psName) {
        _TableNameL = camelToUnderline(tableName);
        _TableNameH = _TableNameL.toUpperCase();
        _TableNameV = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);
        //System.out.println(_TableNameL + "****" + _TableNameH+ "*****" + _TableNameV);
        System.out.println("/* " + tableName + "<" + chinaseTableName + "> */\n" +
                "\t\t\t\telse if(pojo.getClazz().equals(" + tableName + ".class.getName())) {\n" +
                "\t\t\t\tsuccess = new ModelHandler(sqlExecResult, BillTypeEnum." + _TableNameH + ", new "+psName+"()).execute(pojo, sqlSession, referProcessor);\n" +
                "\t\t\t\t}");
        System.out.println();
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
