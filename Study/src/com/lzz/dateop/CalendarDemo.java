package com.lzz.dateop;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		//使用Calendar可以进行日期的计算
		Calendar cal = Calendar.getInstance();  //获取本类对象
		StringBuffer buf = new StringBuffer();
		buf.append(cal.get(Calendar.YEAR)).append("-");
		buf.append(cal.get(Calendar.MONTH)+1).append("-"); //从零开始计算，0代表一月，所以要+1
		buf.append(cal.get(Calendar.DAY_OF_MONTH)+5).append("  "); //进行日期计算
		buf.append(cal.get(Calendar.HOUR_OF_DAY)).append(":");
		buf.append(cal.get(Calendar.MINUTE)).append(":");
		buf.append(cal.get(Calendar.SECOND)).append(".");
		System.out.println(buf);
	}
}
