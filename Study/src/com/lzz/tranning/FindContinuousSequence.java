package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Scanner;

public class FindContinuousSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		ArrayList<ArrayList<Integer>> list = findContinuousSequence(s);
		System.out.println(list);
		sc.close();
	}

	public static ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {	
		ArrayList<ArrayList<Integer>> sequences = new ArrayList<>();
		/**
		 * 暴力求和
		 */
//		for (int i = 1; i <= sum; i++) {
//			int s = 0;
//			ArrayList<Integer> sequence = new ArrayList<>();
//			for (int j = i; j <= sum; j++) {
//				if (s < sum) {
//					s += j;
//					sequence.add(j);
//				} else if (s == sum) {
//					sequences.add(sequence);
//					break;
//				} else {
//					break;
//				}
//			}
//		}
		
		/**
		 * 双指针夹逼法
		 */
		int small = 1;
		int big = 2;
		while(small!=(1+sum)/2) {
			int s = small;
			for(int i = small+1 ; i <= big ; i++) {
				s += i;
			}
			if(s < sum) {
				big++;
			}
			else if(s > sum) {
				small++;
			}
			else {
				ArrayList<Integer> sequence = new ArrayList<>();
				for(int j = small ; j <= big; j++) {
					sequence.add(j);
				}
				sequences.add(sequence);
				small++;
				big++;
			}
		}
		return sequences;
	}
}
