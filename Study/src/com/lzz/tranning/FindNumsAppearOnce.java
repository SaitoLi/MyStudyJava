package com.lzz.tranning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字
 * 
 * @author CunsiALIEN
 *
 */
public class FindNumsAppearOnce {
	public static void FindNumsAppearOnce_Solution(int[] array, int num1[], int num2[]) {
		if (array.length < 2) {
			return;
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer num : array) {
			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		int[] nums = new int[2];
		int index = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				nums[index++] = entry.getKey();
			}
		}
		num1[0] = nums[0];
		num2[0] = nums[1];
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 6, 91, 5, 6, 91, 1, 55, 3, 3, 101 };
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		FindNumsAppearOnce_Solution(array, num1, num2);
		System.out.println(num1[0] + " " + num2[0]);
	}
}
