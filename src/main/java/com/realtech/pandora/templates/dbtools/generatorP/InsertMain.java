package com.realtech.pandora.templates.dbtools.generatorP;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 用于向已生成的model类及其对应的mapper XML中添加result类型的字段
 */
public class InsertMain {
	
	// 不要忘记路径结尾的 '/' 符号
	public static final String 
		// 项目源代码根路径
		PRJ_ROOT = "E:/apollo/apollo-model/src/main/",
		
		// model的.java文件及reader的.xml文件位置
		MDL_PATH = "java/com/renesola/apollo/model/",
		READER_XML_PATH = "resources/com/renesola/apollo/xml/reader/",
	    WRITER_XML_PATH = "resources/com/renesola/apollo/xml/writer/";

	// -------------------------------------------
	// 需要修改的类。例如：Role
	// -------------------------------------------
	public static final String fileToEdit = "CustomerMaster";

	// -------------------------------------------
	// 需要添加的associattion，参数三个一组
	// 1. 数据库表字段
	// 2. java类中的字段名
	// 3. java类中的字段类型
	// 例如：
	//   public static final String[] fieldToAdd = new String[] {
	//     "company_id", "company", "Company",
	//     "user_id", "user", "SystemAccount"
	//   };
	// -------------------------------------------
	/*public static final String[] fieldToAdd = new String[] {
		"customer_basic_id", "customerBasicId","String",   
		"owner_sales_id",  "ownerSalesId","BigDecimal",
		"owner_department_id","ownerDepartmentId","Integer",
		                                            Float
	};*/
//	EAM表结构变更 -
//			1. <工单_项目_明细表>(t_eam_dispatch_order_fulfilment) 被 <工单_派工_明细表>（t_eam_dispatch_order_assignment）取代；
//			+   t_eam_dispatch_order_assignment,dbo.t_eam_do_exec_record
//
//2. <工单_签出_明细表>(t_eam_dispatch_order_checkout) 被 <工单_执行记录表>（t_eam_do_exec_record）取代；
//			+   t_eam_do_exec_record





	public static final String[] fieldToAdd = new String[] {
			"lot_no","Integer",


};
	
	public static void main(String[] args) throws IOException {
		Date date = new Date();
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String updateTime = sdFormat.format(date);
		
//		List<String> lines = Files.readAllLines(new File(PRJ_ROOT + MDL_PATH + fileToEdit + ".java").toPath());
		
		System.out.println("-=-=-=-=-=-model=--=-=-=-=-=");
		for (int j=0; j<fieldToAdd.length; j+=2) { 
			String property = model(fieldToAdd[j]);
			String add = "\t\tprivate "+fieldToAdd[j+1]+" "+property+";\t\t //"+updateTime;
			System.out.println(add);
		}
		System.out.println();
		for (int j=0; j<fieldToAdd.length; j+=2) { 
			String property = model(fieldToAdd[j]);
			String add = "\t\t\""+ property + "\",\""+ fieldToAdd[j].replace("_", " ") +"\",";
			System.out.println(add);
		}
		 System.out.println();

	    for(int j = 0; j < fieldToAdd.length; j += 2) {
	        String property = model(fieldToAdd[j]);
	        String add1 = "\t\tpublic " + fieldToAdd[j + 1] + " get" + property.substring(0, 1).toUpperCase() + property.substring(1) + "() { return " + property + "; }";
	        System.out.println();
	        String get = "\t\tpublic void set" + property.substring(0, 1).toUpperCase() + property.substring(1) + "( " + fieldToAdd[j + 1] + " " + property + " ) { this." + property + " = " + property + "; }";
	        System.out.println(add1);
	        System.out.println(get);
	        System.out.println();
	    }
		
		System.out.println();
		System.out.println("-=-=-=-=-=-=-=-==-reader.xml=--=-=-=-=-=-=-=--=-=-=");
		for (int j=0; j<fieldToAdd.length; j+=2) {
			  String property = model(fieldToAdd[j]);
			  String add1 = "\t\t<result property=\""+property + "\" column=\""+fieldToAdd[j] +"\"/>";
			  System.out.println(add1);
		}
		
		System.out.println();
		for (int j=0; j<fieldToAdd.length; j+=2) {
	        System.out.println("\t\t"+fieldToAdd[j]+",");
        }
		
		System.out.println();
		System.out.println("-=-=-=-=-=-=-=-==-writer.xml=--=-=-=-=-=-=-=--=-=-=");
		for (int j=0; j<fieldToAdd.length; j+=2) {
			String property = model(fieldToAdd[j]);
			String add1 = "\t\t#{"+property+"},";
	        System.out.println(add1);
        }
		
		System.out.println();
		for (int j=0; j<fieldToAdd.length; j+=2) {
			//ss_guided_price = #{ssGuidedPrice},
			String property = model(fieldToAdd[j]);
			String add1 = "\t\t"+fieldToAdd[j]+" = "+"#{"+property+"},";
	        System.out.println(add1);
        }
	}

	public static String  model(String fieldToAdd){
		StringBuilder builder = new StringBuilder();
		boolean bol = true;
		for(int i = 0;i<fieldToAdd.length();i++){
			if(fieldToAdd.charAt(i)=='_'){
				bol =false;
			}else{
				if(bol){
					builder.append(fieldToAdd.charAt(i));
				}else{
					builder.append(Character.toUpperCase(fieldToAdd.charAt(i)));
					bol=true;
				}
			}
		}
		return builder.toString();
	}

}
