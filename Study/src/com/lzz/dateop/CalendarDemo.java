package com.lzz.dateop;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		//ʹ��Calendar���Խ������ڵļ���
		Calendar cal = Calendar.getInstance();  //��ȡ�������
		StringBuffer buf = new StringBuffer();
		buf.append(cal.get(Calendar.YEAR)).append("-");
		buf.append(cal.get(Calendar.MONTH)+1).append("-"); //���㿪ʼ���㣬0����һ�£�����Ҫ+1
		buf.append(cal.get(Calendar.DAY_OF_MONTH)+5).append("  "); //�������ڼ���
		buf.append(cal.get(Calendar.HOUR_OF_DAY)).append(":");
		buf.append(cal.get(Calendar.MINUTE)).append(":");
		buf.append(cal.get(Calendar.SECOND)).append(".");
		System.out.println(buf);
	}
}
