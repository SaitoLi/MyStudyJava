package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * 寻找数组中最小的K个数
 * @author CunsiALIEN
 */
public class GetLeastNumbers {
	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		if(k > input.length) {
			return list;
		}
		Arrays.sort(input);
		for(int i = 0 ; i < k ; i++) {
			list.add(input[i]);
		}
		return list;
	}
}
