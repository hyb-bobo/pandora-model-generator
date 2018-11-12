package com.realtech.pandora.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 属性文件加载
 * @author jun.zhang
 *
 */
public class PropertiesUtil {
	private static final Logger logger = Logger.getLogger(PropertiesUtil.class);

	/**
	 * 从类路径（classpath）加载指定的系统属性
	 * @param prop_file_name
	 * @return <Properties>
	 */
	public static Properties loadPropertiesFromClassPath(String prop_file_name) {
		return loadPropertiesFromClassPath(prop_file_name, null);
	}
	
	public static Properties loadPropertiesFromClassPath(String prop_file_name, String charset) {
		/*使用当前‘线程’的context class loader从class path加载属性文件 */
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream in = loader.getResourceAsStream(prop_file_name);
		if (in == null)
			return null;
		Properties properties = new Properties();
		try {
			if (charset != null)
				properties.load(new InputStreamReader(in, charset));
			else
				properties.load(in);
		} catch (IOException ioe) {
			logger.error("loading properties[" + prop_file_name + "] error!", ioe);
			/* 属性加载异常时返回空 */
			properties = null;
		} finally {
			/* 关闭文件流 */
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return properties;
	}
	
	/**
	 * 从本地文件系统（local file system）加载指定的系统属性
	 * @param prop_file_path
	 * @return <Properties>
	 */
	public static Properties loadPropertiesFromLocalFileSystem(String prop_file_path) {
		return loadPropertiesFromLocalFileSystem(prop_file_path, null);
	}
	
	public static Properties loadPropertiesFromLocalFileSystem(String prop_file_path, String charset) {
		InputStream in = null;
		Properties properties = null;
		/* 加载属性文件 */
		try {
			File file = new File(prop_file_path);
			if (!file.exists())
				return null;

			in = new FileInputStream(file);
			properties = new Properties();
			if (charset != null)
				properties.load(new InputStreamReader(in, charset));
			else
				properties.load(in);
		} catch (FileNotFoundException e) {
			// ignore
		} catch (IOException ioe) {
			logger.error("loading properties[" + prop_file_path + "] error!", ioe);

			/* 属性加载异常时返回空 */
			properties = null;
		} finally {
			/* 关闭文件流 */
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return properties;
	}
	
	/**
	 * 加载指定的系统属性。先从本地文件中搜索，无则从classpath搜索
	 */
	public static Properties loadProperties(String file) {
		Properties prop = loadPropertiesFromLocalFileSystem(file, "utf-8");
		if (prop == null)
			prop = loadPropertiesFromClassPath(file, "utf-8");
		return prop;
	}
	
	public static void reflectLoadPropertiesToStaticFields(String file, Class<?> clazz) {
		Properties prop = loadProperties(file);
		if (prop == null)
			throw new RuntimeException("Properties file " + file + " not found!");
		reflectLoadPropertiesToStaticFields(prop, clazz);
	}
	
	public static void reflectLoadPropertiesToStaticFields(Properties prop, Class<?> clazz) {
		for (Field field : clazz.getDeclaredFields()) {
			loadField(null, field, prop);
		}
	}
	
	public static void reflectLoadPropertiesToObject(String file, Object obj) {
		Properties prop = loadProperties(file);
		if (prop == null)
			throw new RuntimeException("Properties file " + file + " not found!");
		reflectLoadPropertiesToObject(prop, obj);
	}
	
	public static void reflectLoadPropertiesToObject(Properties prop, Object obj) {
		for (Field field : obj.getClass().getDeclaredFields()) {
			loadField(obj, field, prop);
		}
	}
	
	private static void loadField(Object obj, Field field, Properties prop) {
		String str = prop.getProperty(field.getName());
		if (str == null) {
			logger.info("property " + field.getName() + " value not found");
			return;
		}
		str = str.trim();
		Exception e;
		Class<?> clazz = field.getType();
		field.setAccessible(true);
		logger.info(field + " = " + str);
		try {
			if (obj == null && (field.getModifiers() & Modifier.STATIC) == 0) {
				// not support
			} else if (clazz == String.class) {
				field.set(obj, str);
				return;
			} else if (clazz == int.class) {
				field.setInt(obj, Integer.parseInt(str));
				return;
			} else if (clazz == double.class) {
				field.setDouble(obj, Double.parseDouble(str));
				return;
			} else if (clazz == boolean.class) {
				field.setBoolean(obj, Boolean.parseBoolean(str));
				return;
			} else if (clazz == BigDecimal.class) {
				field.set(obj, new BigDecimal(str));
				return;
			} else if (clazz == String[].class) {
				List<String> tmp = new ArrayList<>();
				for (String s : str.split(","))
					if (!(s = s.trim()).isEmpty())
						tmp.add(s);
				field.set(obj, tmp.toArray(new String[tmp.size()]));
				return;
			} else if (clazz == Integer[].class) {
				List<Integer> tmp = new ArrayList<>();
				for (String s : str.split(",")) {
					if (!(s = s.trim()).isEmpty()) {
						tmp.add(Integer.parseInt(s));
					}
					field.set(obj, tmp.toArray(new Integer[tmp.size()]));
				}
				return;
			}else if(clazz==BigDecimal[].class){
				List<BigDecimal> tmp=new ArrayList<>();
				for (String s : str.split(",")) {
					if (!(s = s.trim()).isEmpty()) {
						tmp.add(new BigDecimal(s));
					}
					field.set(obj, tmp.toArray(new BigDecimal[tmp.size()]));
				}
				return;
			} else if (clazz == Double[].class) {
				List<Double> tmp = new ArrayList<>();
				for (String s : str.split(",")) {
					if (!(s = s.trim()).isEmpty()) {
						tmp.add(Double.parseDouble(s));
					}
					field.set(obj, tmp.toArray(new Double[tmp.size()]));
				}
				return;
			}
			e = new UnsupportedOperationException();
		} catch (Exception ex) {
			e = ex;
		}
		logger.error("can not load field " + field + " with value " + str, e);
	}
}
