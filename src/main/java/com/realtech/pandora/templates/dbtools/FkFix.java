package com.realtech.pandora.templates.dbtools;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.realtech.pandora.util.StringUtil;
import org.apache.commons.io.FileUtils;

public class FkFix {
	
	private static HashMap<String, List<String>> files = new HashMap<>();
	
	public static void main(String[] args) throws IOException {
		List<String> ls = FileUtils.readLines(new File("d:/fix.cols"));
		fixes: for (int i=0; i<ls.size(); i++) {
			String[] ln = ls.get(i).split(" ");
			String clazz = StringUtil.toUpperCamelCase(ln[0]);
			String field = StringUtil.toLowerCamelCase(ln[1]);
			String setter = StringUtil.toUpperCamelCase(ln[1]);
			List<String> cls = open(clazz);
			for (int j=0; j<cls.size(); j++) {
				String cln = cls.get(j);
				if (cln.matches("\\s*public void set" + setter + "\\(.*")) {
					cls.add(++j, "\t\tif (\"\".equals(" + field + ")) {");
					cls.add(++j, "\t\t\tthis."+field+" = null;");
					cls.add(++j, "\t\t\treturn;");
					cls.add(++j, "\t\t}");
					continue fixes;
				}
			}
			System.err.println(ln + " not fixed");
		}
		for (Entry<String, List<String>> fileE : files.entrySet()) {
			FileUtils.writeLines(new File(fileE.getKey()), fileE.getValue());
		}
	}
	
	private static List<String> open(String clazz) throws IOException {
		String file = "d:/work/apollo-model/src/main/java/com/renesola/apollo/model/"+clazz+".java";
		List<String> ls = files.get(file);
		if (ls != null)
			return ls;
		ls = FileUtils.readLines(new File(file));
		files.put(file, ls);
		return ls;
	}

}
