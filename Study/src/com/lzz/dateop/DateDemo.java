package com.lzz.dateop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		/*
		 * ���ڸ�ʽ��
		 *    ����-->�ַ���
		 */
//		Date date = new Date() ;
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//		String str = sdf.format(date); //��Date��ת��ΪString����
//		System.out.println(str);
		
		/*
		 * ���ڸ�ʽ��
		 * 	    �ַ���-->����
		 * 	   ��������͸������²��ԣ�����Զ���λ������ַ�����ʽ�������������쳣
		 */
//		String str = "2018-09-09 14:47:36:555";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//		Date date = sdf.parse(str);  //�ַ���������������
//		System.out.println(date);
		
		/*
		 *   long-->date 
		 */
		long cur = System.currentTimeMillis();  //ȡ�õ�ǰ������long�ͷ���
		Date date = new Date(cur);
		System.out.println(date);  // long --> date
		System.out.println(date.getTime()); // date-->long
	}
}
