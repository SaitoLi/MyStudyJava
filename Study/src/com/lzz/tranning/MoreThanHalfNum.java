package com.lzz.tranning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author CunsiALIEN
 *
 */
public class MoreThanHalfNum {
	public static void main(String[] args) {
		int[] array = {1,2,3,2,2,2,5,4,2};
		System.out.println(MoreThanHalfNum_Solution(array));
	}
	public static int MoreThanHalfNum_Solution(int[] array) {
		/*
		 * 方法一
		 * 使用Map统计找出重复次数最多的元素重复的次数，如果次数max>len/2，则返回结果
		 * 否则返回0
		 */
//		int len = array.length;
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//		for(int i = 0 ; i < array.length ; i++) {
//			if(!map.containsKey(array[i])) {
//				map.put(array[i], 1);
//			}
//			else {
//				map.put(array[i], map.get(array[i]) + 1);
//			}
//		}
//		int max = 0;
//		for(Map.Entry<Integer, Integer> m : map.entrySet()) {
//			if(max < m.getValue()) {
//				max = m.getValue();
//			}
//		}
//		if(max > len/2) {
//			return getKey(map,max);
//		}
//		return 0;
		
		/*
		 * 方法二
		 * 使用一个计数器count
		 */
		int len = array.length;
		if(len == 0) {
			return 0;
		}
		
		int maxNum = array[0];
		int count = 1;
		for(int i = 0; i < len ; i++) {
			if(array[i] == maxNum) {
				count++;
			}
			else {
				count--;
			}
			if(count == 0) {
				maxNum = array[i];
				count = 1;
			}
		}
		count = 0;
		for(int i = 0; i < len ; i++) {
			if(array[i] == maxNum) {
				count++;
			}
		}
		if(count > len/2) {
			return maxNum ;
		}
		else {
			return 0;
		}
	}
	
	
	/**
	 * 方法一的辅助方法
	 */
//	public static int getKey(Map<Integer,Integer> map , Integer value) {
//		int key = 0;
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			if(value.equals(entry.getValue())){
//				key = entry.getKey();
//			}
//		}
//		return key;
//	}
}
