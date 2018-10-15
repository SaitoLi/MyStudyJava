package com.lzz.tranning;

import java.util.Scanner;

/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 * 
 * 使用递归的方法
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
