package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ��һ����Ȥ���ַ�����ֵ���㷽ʽ:ͳ���ַ�����ÿ���ַ����ֵĴ���,Ȼ���������ַ�������ƽ������Ϊ�ַ����ļ�ֵ
����: �ַ���"abacaba",�������4��'a',2��'b',1��'c',��������ַ����ļ�ֵΪ4 * 4 + 2 * 2 + 1 * 1 = 21
ţţ��һ���ַ���s,�����������s���Ƴ����k���ַ�,���Ŀ�����õõ����ַ����ļ�ֵ��С�� 

��������:
�����������,��һ��һ���ַ���s,�ַ���s�ĳ���length(1 �� length �� 50),����ֻ����Сд��ĸ('a'-'z')��
�ڶ��а���һ������k(0 �� k �� length),�������Ƴ����ַ�������
�������:
���һ������,��ʾ�õ�����С��ֵ
 * @author CunsiALIEN
 *
 */
public class MinStringPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int k = sc.nextInt();
		int minPrice = 0;
		if(k <= str.length()) {
			minPrice = calMinPrice(str,k);
		}
		System.out.println(minPrice);
		sc.close();
	}
	
	public static int calMinPrice(String str , int k) {
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		int minPrice = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			}
			else {
				map.put(ch, 1);
			}
		}
		//�������ַ����ֵĴ����Ž�һ������������
		int[] counts = new int[map.size()];
		int index = 0;
		for(Character key: map.keySet()) {
			counts[index++] = map.get(key);
		}
		
		//ÿ�ζ��������ظ�������1
		//�������õ���price������С��
		for(int i = 0 ; i < k ; i++) {
			Arrays.sort(counts);
			if(counts[counts.length - 1] > 0) {
				counts[counts.length - 1]--;
			}
		}
		//������С��ֵ
		for(int j = 0; j < counts.length ; j++) {
			minPrice += counts[j] * counts[j];
		}
		
		return minPrice;
	}
}
