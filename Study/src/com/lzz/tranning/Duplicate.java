package com.lzz.tranning;

import java.util.Scanner;

/**
 * ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ�
 * ���ҳ�����������һ���ظ������֡� ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��
 * 
 * @author CunsiALIEN
 *
 */
public class Duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] nums = str.split(" ");
		int len = nums.length;
		int[] array = new int[len];
		for (int i = 0; i < len; i++) {
			array[i] = Integer.valueOf(nums[i]);
		}
		int duplication[] = new int[1];

		System.out.println(duplicate(array, len, duplication) + "," + duplication[0]);
		sc.close();
	}

	public static boolean duplicate(int numbers[], int length, int[] duplication) {
		boolean[] dup = new boolean[length];
		for(int i = 0 ; i < length ; i++) {
			if(dup[numbers[i]] == true) {
				duplication[0] = numbers[i];
				return true;
			}
			dup[numbers[i]] = true;
		}
		return false;
	}
}
