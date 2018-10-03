package com.lzz.tranning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * дһ�����������������ǽ�����������飨A, B������ A, B �ϲ���һ���ǽ������� C������ C����Ҫʹ������ sort
 * �����������������������ο������ǻ���ݴ��������������֣�
 * 
 * ������������һ��������������n,m����1<=n,m<=100000���ֱ��ʾ����A,B�Ĵ�С�� �ڶ��и���n������a��(1<=a<=10000)
 * �����и���m������b��(1<=b<=10000)
 * 
 * �������������ϲ�֮������õ����顣
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
