package com.realtech.pandora.util;

import java.io.IOException;
import java.util.UUID;

/**
 * 唯一标识符发生器(20位)
 * 
 * @author Fan Peng
 */
public class OidUtil {


	/* 36位随机种子（10位数字+26位字母） */
	private static char[] x36s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	/* 10位随机种子 */
	private static char[] x10s = "0123456789".toCharArray();

	/**
	 * 根据前缀生成随机数
	 * @param prefix 前缀
	 */
	public static String newId(String prefix) {
		return prefix + newId();
	}

	/**
	 * 根据前缀生成指定长度的随机数
	 * @param prefix 前缀
	 * @param length 长度，不包含前缀长度
	 */
	public static String newId(String prefix, int length) {
		return prefix + newId(length);
	}

	/**
	 * 生成指定长度（1<=length<=8）随机字符(‘第1位’必须为‘字母’)
	 */
	public static String newId(int length) {

		char[] chs = new char[length];

		long v = System.currentTimeMillis() >> 1;
		for (int i = length - 1; i >= 0; i--) {
			chs[i] = x36s[(int) (v % 36)];
			v = v / 36;
		}
		chs[0] = x36s[(int) (v % 26) + 10]; // 确保第一个随机字符是"字母"

		return new String(chs);
	}

//	/**
//	 * 基于加密伪随机数生成器生成的'UUID'（Type：4）
//	 * @param
//	 * @return String
//	 * @throws
//	 */
//	public static String newId() {
//		String randomStrType4 = UUID.randomUUID().toString().replace("-", "");
//		return randomStrType4.substring(randomStrType4.length()-20);
//	}

	/**
	 * 生成包含0-9数字、A-Z字母的20位随机数
	 * ‘前8位’随机字符以系统时间为随机池, ‘第1位’必须为‘字母’
	 * ‘后12位’随机字符以UUID为随机池
	 */
	public static String newId() {

		int len = 20;

		char[] chs = new char[len];

		// 生成‘前8位’随机字符
		long v = System.currentTimeMillis() >> 1;
		for (int i = 7; i > 0; i--) {
			chs[i] = x36s[(int) (v % 36)];
			v = v / 36;
		} /* for */
		chs[0] = x36s[(int) (v % 26) + 10]; // 确保第一个随机字符是"字母"

		// 生成‘后12位’随机字符
		UUID u = UUID.randomUUID();
		v = u.getLeastSignificantBits() ^ u.getMostSignificantBits();
		if (v < 0) {
			v = -v;
		}

		for (int i = 8; i < len; i++) {
			chs[i] = x36s[(int) (v % 36)];
			v = v / 36;
		}

		return new String(chs);
	}

	/**
	 * 生成仅包含0-9数字的10位随机数
	 */
	public static long newLongId() {

		/* 随机数长度 */
		short shortLength = 10;

		/* 结果随机数{保存在字符串中} */
		char[] chs = new char[shortLength];

		// 生成前3位随机字符(以系统时间为随机池, 以10位数字为随机种子)
		long v = (System.currentTimeMillis() - 936748800000L) >> 1; // 1999-9-9
		// 要横跨102年
		for (int i = 2; i >= 0; i--) {
			chs[i] = x10s[(int) (v % 10)];
			v = v / 10;
		}

		// 生成后7位随机字符(以UUID为随机池, 以10位数字为随机种子)
		UUID u = UUID.randomUUID();
		v = u.getLeastSignificantBits() ^ u.getMostSignificantBits();
		if (v < 0) {
			v = -v;
		}

		for (int i = 3; i < shortLength; i++) {
			chs[i] = x10s[(int) (v % 10)];
			v = v / 10;
		} /* for */

		return Long.parseLong(new String(chs));
	}

	/**
	 * 测试入口方法
	 */
	public static void main(String[] args) throws IOException {
		/* 生成20位长oid */
		for(int i=0; i<1; i++) {
		    String id = newId();
		    System.out.println(id);
		}

//		FileOutputStream fob = new FileOutputStream(new File("D://id.txt"));
//		for(int i=0;i<197;i++){
//			fob.write(OidUtil.newId().getBytes());
//			fob.write("\n".getBytes());
//			System.out.println(OidUtil.newId());
//		}
//		fob.close();

//		Date begin = new Date();
//		for(int i=0; i<10000; i++) {
//		    long id = newLongId();
//		    System.out.println(id);
//		}
//		Date end = new Date();
//		System.out.println(DateUtil.substract(end, begin));
	}
}
