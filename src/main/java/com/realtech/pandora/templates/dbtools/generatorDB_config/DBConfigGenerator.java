package com.realtech.pandora.templates.dbtools.generatorDB_config;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DBConfigGenerator {

	public static void main(String[] args) throws IOException {
//		File config = new File("src/main/resources/db-config.xml"); //TODO eclipse 用这个
//		String path = DBConfigGenerator.class.getResource("").getPath() + File.separator;    //TODO   项目里面生成打开
//		File config = new File( path + ("db-config.xml")); //src/main/resources/db-config.xml
		File config = new File("D:/db-config.xml"); //TODO  IDEA 用这个
		System.out.println("=-=-=-=-=-=-=-=-=-=-"+config.exists());
		System.out.println("=-=-=-=-=-=-=-=-=-=-"+config.getAbsolutePath());
		System.out.println("=-=-=-=-=-=-=-=-=-=-"+config.getPath());
//		File dir = new File( path+"com/realtech/pandora/xml");//TODO   项目里面直接用这个
		File dir = new File( "D:/com/realtech/pandora/xml");
		List<String> lns = FileUtils.readLines(config);
		int i = 0;
		for (String ln : lns)
			if (ln.contains("<mappers>"))
				break;
			else
				i++;
		lns = lns.subList(0, i);
		lns.add("\t<mappers>");
		appendLines(lns,"com/realtech/pandora", dir);
		lns.add("\t</mappers>");
		lns.add("</configuration>");
		FileUtils.writeLines(config, lns);
		System.out.println("done");
	}

	private static void appendLines(List<String> lines, String prefix, File file) {
		if (file.isDirectory()) {
			prefix = prefix + "/" + file.getName();
			for (File sub : file.listFiles())
				appendLines(lines, prefix, sub);
		}
		else if (file.isFile())
			lines.add(String.format("\t\t<mapper resource=\"" + prefix + "/%s\" />", file.getName()));
		else
			System.err.println(file);
	}

}
