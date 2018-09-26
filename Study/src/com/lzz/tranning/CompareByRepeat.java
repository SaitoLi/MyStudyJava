package com.lzz.tranning;

import java.util.Scanner;

/**
 * ������������������x��k,���Ƕ���repeat(x, k)Ϊ��x�ظ�дk���γɵ���,
 * ����repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 * ţţ���ڸ���4������x1, k1, x2, k2, ����v1 = (x1, k1), v2 = (x2, k2),�������Ƚ�v1��v2�Ĵ�С�� 
 * @author CunsiALIEN
 *
 * ��������:
 *    �������һ��,һ������4��������x1, k1, x2, k2(1 �� x1,x2 �� 10^9, 1 �� k1,k2 �� 50),�Կո�ָ�
 * �������:
 *    ���v1С��v2���"Less",v1����v2���"Equal",v1����v2���"Greater".
 */
public class CompareByRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int k1 = sc.nextInt();
		int x2 = sc.nextInt();
		int k2 = sc.nextInt();
		String v1 = repeat(x1,k1);
		String v2 = repeat(x2,k2);
		
		String result = compareByRepeat_Solution(v1,v2);
		System.out.println(result);
		sc.close();
	}
	
	public static String compareByRepeat_Solution(String v1, String v2) {
		/**
		 * ����ͨ��ת��Ϊ�ַ������бȽ�
		 * �ȱȽ��ַ������ȣ����������ͬ��ʹ��compareTo�Ƚ�
		 */
		if(v1.length() > v2.length()) {
			return "Greater";
		}
		else if(v1.length() < v2.length()) {
			return "Less";
		}
		else {
			if(v1.compareTo(v2) > 0) {
				return "Greater";
			}
			else if(v1.compareTo(v2) < 0) {
				return "Less";
			}
			else {
				return "Equal";
			}
		}
	}
	
	public static String repeat(int x, int k) {
		String str = "";
		for(int i = 0 ; i < k ; i++) {
			str += x;
		}
		return str;
	}
	
	
}
