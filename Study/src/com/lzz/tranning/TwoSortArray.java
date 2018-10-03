package com.lzz.tranning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 写一个函数，传入两个非降序的整数数组（A, B），将 A, B 合并成一个非降序数组 C，返回 C（不要使用内置 sort
 * 函数）。（测试用例仅做参考，我们会根据代码质量进行评分）
 * 
 * 输入描述：第一行输入两个整数n,m。（1<=n,m<=100000）分别表示数组A,B的大小。 第二行给出n个整数a。(1<=a<=10000)
 * 第三行给出m个整数b。(1<=b<=10000)
 * 
 * 输出描述：输出合并之后排序好的数组。
 * 
 * @author CunsiALIEN
 *
 */
public class TwoSortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[m];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for (int j = 0; j < m; j++) {
			B[j] = sc.nextInt();
		}

		int[] C = merge(A, B);
		for (Integer integer : C) {
			System.out.print(integer + " ");
		}
	}

	public static int[] merge(int[] A, int[] B) {
		int[] C = new int[A.length + B.length];
		int i = 0 ; 
		int j = 0;
		int index = 0 ;
		while(i<A.length && j < B.length) {
			if(A[i] <= B[j]) {
				C[index++] = A[i++];
			}
			else {
				C[index++] = B[j++];
			}
		}
		while(i < A.length) {
			C[index++] = A[i++];
		}
		while(j < B.length) {
			C[index++] = B[j++];
		}
			
		return C;
	}
}
