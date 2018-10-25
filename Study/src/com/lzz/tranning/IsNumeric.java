package com.lzz.tranning;

import java.util.Scanner;

/**
   *   ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
   *   ���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ�� 3
   *   ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
 * @author CunsiALIEN
 *
 */
public class IsNumeric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isNumeric(str.toCharArray()));
		sc.close();
	}
	
	/**
	   *   ʹ��������ʽ
	 * 
     *
	���¶�������н���:
	[\\+\\-]?            -> ���򸺷��ų������
	\\d*                 -> ���������Ƿ���֣���-.34 �� +3.34������
	(\\.\\d+)?           -> �������С���㣬��ôС���������������֣�����һ�𲻳���
	([eE][\\+\\-]?\\d+)? -> �������ָ�����֣���ôe��E�϶����֣�+��-���Բ����֣������ű�����������������������ֶ�������
     *
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(char[] str) {
		String string = String.valueOf(str);
		return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
	}
}
