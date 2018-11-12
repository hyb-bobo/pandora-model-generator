package com.realtech.pandora.templates.dbtools.generatorP;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import com.realtech.pandora.util.StringUtil;

/**
 * 用于向已生成的model类及其对应的mapper XML中添加association类型的字段
 */
public class Main {
	
	// 不要忘记路径结尾的 '/' 符号
	public static final String 
		// 项目源代码根路径
		PRJ_ROOT = "d:/apollo/apollo-model/src/main/",
		
		// model的.java文件及reader的.xml文件位置
		MDL_PATH = "java/com/renesola/apollo/model/",
		XML_PATH = "resources/com/renesola/apollo/xml/reader/";

	// -------------------------------------------
	// 需要修改的类。例如：Role
	// -------------------------------------------
	public static final String fileToEdit = "CustomerMaster";

	// -------------------------------------------
	// 需要添加的associattion，参数三个一组
	// 1. 数据库中的字段名
	// 2. java类中的字段名
	// 3. java类中的字段类型
	// 例如：
	//   public static final String[] fieldToAdd = new String[] {
	//     "company_id", "company", "Company",
	//     "user_id", "user", "SystemAccount"
	//   };
	// -------------------------------------------
	public static final String[] fieldToAdd = new String[] {
		"customer_basic_id", "customer", "CustomerBasic",
		"owner_sales_id", "owner", "SystemAccount",
		"owner_department_id", "department", "Department",
		"default_currency_id", "currency", "Currency",
		"default_payment_term", "paymentTerm", "PaymentTerm",
		"default_tax_schedule_id", "taxSchedule", "TaxSchedule",
		"default_trade_term_id", "tradeTerm", "TradeTerm",
		"default_ship_via_id", "shipVia", "ShipVia",
	};
	
	public static void main(String[] args) throws IOException {
		List<String> lines = Files.readAllLines(new File(PRJ_ROOT + MDL_PATH + fileToEdit + ".java").toPath());
		boolean fldAdded = false;
		for (int i=0; i<lines.size(); i++) {
			String line = lines.get(i);
			if (! fldAdded) {
				if (line.matches("\\s+public \\w+ \\w+\\(.*|\\s+@SkipJsonToString.*")) {
					fldAdded = true;
					for (int j=0; j<fieldToAdd.length; j+=3) {
						String add = "\tprivate " + fieldToAdd[j+2] + " " + fieldToAdd[j+1] + ";";
						lines.add(i-1, add);
					}
					lines.add(i-1, "");
				}
			}
			else if (line.matches("}")) {
				int mtdLs = 0;
				for (int j=0; j<fieldToAdd.length; j+=3) {
					String add = "\t@SkipJsonToString";
					lines.add(i + mtdLs++, add);
					add = "\tpublic " + fieldToAdd[j+2] + 
							" get" + StringUtil.toUpperCaseFristOne(fieldToAdd[j+1]) + "() {";
					lines.add(i + mtdLs++, add);
					add = "\t\treturn this." + fieldToAdd[j+1] + ";\r\n\t}\r\n";
					lines.add(i + mtdLs++, add);
					add = "\tpublic void set" + StringUtil.toUpperCaseFristOne(fieldToAdd[j+1]) + "(" +
							fieldToAdd[j+2] + " " + fieldToAdd[j+1] + ") {";
					lines.add(i + mtdLs++, add);
					add = "\t\tthis." + fieldToAdd[j+1] + " = " + fieldToAdd[j+1] + ";\r\n\t}\r\n";
					lines.add(i + mtdLs++, add);
				}
				break;
			}
		}
		for (String str : lines)
			System.out.println(str);

		List<String> lines2 = Files.readAllLines(new File(PRJ_ROOT + XML_PATH + fileToEdit + ".xml").toPath());
		for (int i=0; i<lines2.size(); i++) {
			if (lines2.get(i).matches("\\s+</resultMap>")) {
				for (int j=0; j<fieldToAdd.length; j+=3) {
					String add = "\t\t<association property=\"" + fieldToAdd[j+1] + "\" column=\"" +
							fieldToAdd[j] + "\" select=\"com.renesola.apollo.reader." + fieldToAdd[j+2] +
							"Reader.get\" />";
					lines2.add(i+j/3, add);
				}
				break;
			}
		}
		for (String str : lines2)
			System.out.println(str);
		
		System.err.println("以上是输出预览。输入'Y'确认并生成文件，输入其它则取消：");
		if (System.in.read() == 'y') {
			Files.write(new File(PRJ_ROOT + MDL_PATH + fileToEdit + ".java").toPath(), lines);
			Files.write(new File(PRJ_ROOT + XML_PATH + fileToEdit + ".xml").toPath(), lines2);
			System.err.println("输出成功");
		} else {
			System.err.println("已取消");
		}
	}

}
