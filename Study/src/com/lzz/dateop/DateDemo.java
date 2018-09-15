package com.lzz.dateop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		/*
		 * 日期格式化
		 *    日期-->字符串
		 */
//		Date date = new Date() ;
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//		String str = sdf.format(date); //将Date型转化为String类型
//		System.out.println(str);
		
		/*
		 * 日期格式化
		 * 	    字符串-->日期
		 * 	   如果日期型给出的月不对，则会自动进位；如果字符串格式不符合则会出现异常
		 */
//		String str = "2018-09-09 14:47:36:555";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//		Date date = sdf.parse(str);  //字符串变日期型数据
//		System.out.println(date);
		
		/*
		 *   long-->date 
		 */
		long cur = System.currentTimeMillis();  //取得当前日期以long型返回
		Date date = new Date(cur);
		System.out.println(date);  // long --> date
		System.out.println(date.getTime()); // date-->long
	}
}
