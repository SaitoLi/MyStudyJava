package com.lzz.tranning;

import java.util.Scanner;

/**
 * ��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C��
 * 
 * ʹ�õݹ�ķ���
 * 
 * @author CunsiALIEN
 *
 */
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = sum_Solution(n);
		System.out.println(sum);
		sc.close();
	}
	
	public static int sum_Solution(int n) {
		int sum = 0;
		sum = sum_Start(sum,n);
		return sum;
	}
	
	public static int sum_Start(int sumPre , int n) {
		if(n < 1) {
			return sumPre;
		}
		int sumNow = sumPre + n;
		return sum_Start(sumNow, n -1);
	}
}
