package com.bbs.common.util;

import java.util.Random;
import java.util.UUID;

/**
 * ID生成策略工具类
 * @author Administrator
 */
public class IDUtils {

	/**
	 * 图片名生成
	 */
	public static String genImageName() {
		long millis = System.currentTimeMillis();
		Random random = new Random();
		int end3 = random.nextInt(999);
		String str = millis + String.format("%03d", end3);
		return str;
	}
	
	/**
	 * UUID生成
	 */
	public static String createUUId() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
}
