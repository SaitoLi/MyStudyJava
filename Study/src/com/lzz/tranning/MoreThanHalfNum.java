package com.lzz.tranning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ�
 * �������鳤�ȵ�һ�룬������2����������������0��
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
		 * ����һ
		 * ʹ��Mapͳ���ҳ��ظ���������Ԫ���ظ��Ĵ������������max>len/2���򷵻ؽ��
		 * ���򷵻�0
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
		 * ������
		 * ʹ��һ��������count
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
	 * ����һ�ĸ�������
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
