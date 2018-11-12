package com.realtech.pandora.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Author: liumangafei Date: 2014/10/25 Project Name: generator Description:
 */
public class StringUtil {

	/**
	 * 首字母大写
	 */
	public static String toUpperCaseFristOne(String str) {
		StringBuilder sb = new StringBuilder(str);
		return toUpperCaseFristOne(sb);
	}

	/**
	 * 首字母大写
	 */
	public static String toUpperCaseFristOne(StringBuilder sb) {
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		return sb.toString();
	}

	/**
	 * 首字母小写
	 */
	public static String toLowerCaseFristOne(String str) {
		StringBuilder sb = new StringBuilder(str);
		return toLowerCaseFristOne(sb);
	}

	/**
	 * 首字母小写
	 */
	public static String toLowerCaseFristOne(StringBuilder sb) {
		if(StringUtils.isEmpty(sb)) return sb.toString();
		sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)));
		return sb.toString();
	}

	/**
	 * 小驼峰标识
	 */
	public static String toLowerCamelCase(String str) {
		//不是下划线风格的字段则直接返回
		if(StringUtils.isEmpty(str)) return toLowerCaseFristOne(str);
//		if(StringUtils.isEmpty(str) || !str.contains("_")) return toLowerCaseFristOne(str);
		return toLowerCaseFristOne(toUpperCamelCase(str)).toString();
	}

	/**
	 * 大驼峰标识
	 */
	public static String toUpperCamelCase(String str) {
		StringBuilder sb = new StringBuilder();
		//不是下划线风格的字段则直接返回
//		if(str == null || !str.contains("_")) return str;
		if(str == null) return str;
		for (String buf : str.split("[_.]"))
			sb.append(toUpperCaseFristOne(buf.toLowerCase()));
		return sb.toString();
	}

    /**
     * 判断Bigdecimal是否为0或空
     */
    public static boolean isNullorEmpty(String val) {
        return val == null || val.trim().equals("");
    }

}
