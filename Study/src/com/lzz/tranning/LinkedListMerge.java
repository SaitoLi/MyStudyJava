package com.lzz.tranning;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * �������������������Ĳ��� ������ A {1 -> 2 -> 5 -> 7}   ���� B {3 -> 5 -> 7 -> 8} ���: {1 -> 2 ->3 -> 5 -> 7 ->8} �����������������ο������ǻ���ݴ��������������֣�

������������һ����������n��m,(1<=n,m<=1000)�ֱ��ʾ��������ĳ��ȡ�
�ڶ��и���A����������Ԫ�ء�(1<=a<=1000)
�����и���B����������Ԫ�ء�(1<=b<=1000)

�������������Ŀ���������
 * @author CunsiALIEN
 *
 */
public class LinkedListMerge {
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
		int[] C = merge(A,B);
		for (Integer integer : C) {
			if(integer == C[C.length - 1]){
				System.out.print(integer);
			}
			else {
				System.out.print(integer + " -> ");
			}
		}
	}
	
	public static int[] merge(int[] A, int[] B) {
		//ע��ʹ��HashSet��TreeSet������
		Set<Integer> set = new TreeSet<Integer>();
		int i = 0 ; 
		int j = 0 ;
		while(i<A.length && j < B.length) {
			if(A[i] <= B[j]) {
				set.add(A[i++]);
			}
			else {
				set.add(B[j++]);
			}
		}
		while(i < A.length) {
			set.add(A[i++]);
		}
		while(j < B.length) {
			set.add(B[j++]);
		}
		int[] C = new int[set.size()];
		int index = 0 ;
		for(Integer integer : set) {
			C[index++] = integer;
		}
		return C;
	}
}
