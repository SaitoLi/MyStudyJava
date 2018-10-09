package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Scanner;

/**
   *    输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @author CunsiALIEN
 *
 */
public class FindNumbersWithSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = {1,2,4,6,8,13,22,50};
		int s = sc.nextInt();
		ArrayList<Integer> result = findNumbersWithSum(array,s);
		System.out.println(result);
		sc.close();
	}
	
	public static ArrayList<Integer> findNumbersWithSum(int[] array , int sum){
		ArrayList<Integer> list = new ArrayList<>();
		if(array.length == 0) {
			return list;
		}
		int small = 0;
		int big = array.length-1;
		while(array[small]<=sum/2) {
			int s = array[small] + array[big];
			if(s > sum) {
				big--;
			}
			else if(s < sum) {
				small++;
			}
			else {
				list.add(array[small]);
				list.add(array[big]);
				break;
			}
		}
		return list;
	}
}
