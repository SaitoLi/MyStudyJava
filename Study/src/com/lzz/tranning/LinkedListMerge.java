package com.lzz.tranning;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 输出两个单向有序链表的并集 如链表 A {1 -> 2 -> 5 -> 7}   链表 B {3 -> 5 -> 7 -> 8} 输出: {1 -> 2 ->3 -> 5 -> 7 ->8} 。（测试用例仅做参考，我们会根据代码质量进行评分）

输入描述：第一行输入整数n，m,(1<=n,m<=1000)分别表示两个链表的长度。
第二行给出A链表所包含元素。(1<=a<=1000)
第三行给出B链表所包含元素。(1<=b<=1000)

输出描述：按题目描述输出。
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
		//注意使用HashSet和TreeSet的区别
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
