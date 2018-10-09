package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Scanner;

/**
   *    ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
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
