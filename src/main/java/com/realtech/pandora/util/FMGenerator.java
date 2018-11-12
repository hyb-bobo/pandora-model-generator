package com.realtech.pandora.util;

import java.io.*;
import java.util.HashMap;

import freemarker.cache.MruCacheStorage;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateException;
import org.springframework.util.ResourceUtils;

/**
 * Author: liumangafei
 * Date: 2014/10/25
 * Project Name: generator
 * Description:
 */
public class FMGenerator {

    private static final String TEMPLATES_DIRECTORY = "templates"; //模板基础文件夹

    private static final Configuration freemarker = new Configuration();
    static {
        try {
//        	String dir = FMGenerator.class.getClassLoader().getResource("").getPath();
        	String dir = ResourceUtils.getFile("classpath:").getPath();
            freemarker.setDirectoryForTemplateLoading(new File(dir));
            freemarker.setDefaultEncoding("UTF-8");
            freemarker.setObjectWrapper(new DefaultObjectWrapper());
            freemarker.setCacheStorage(new MruCacheStorage(200, 200));
        } catch (IOException e) {
        	throw new Error(e);
        }
    }

    private Object[] roots;
    private HashMap<String, String> vars = new HashMap<>();

    public FMGenerator(Object... roots){
    	if (roots.length == 0)
    		throw new IllegalArgumentException("No Root Provided");
        this.roots = roots;
    }
    
    public FMGenerator replace(String variable, String replace) {
    	vars.put(variable, replace);
    	return this;
    }

    public FMGenerator generateFile(String filePath, String template) throws IOException, TemplateException {
    	for (String var : vars.keySet()) {
    		filePath = filePath.replace(var, vars.get(var));
    	}
    	File file = new File(filePath);
    	if (! file.getParentFile().exists())
    		file.getParentFile().mkdirs();
    	try (Writer out = new FileWriter(file)) {
    		freemarker.getTemplate(template).process(roots, out, MultiRootTemplateModel::new);
    	}
        return this;
    }

}
