package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 有一种有趣的字符串价值计算方式:统计字符串中每种字符出现的次数,然后求所有字符次数的平方和作为字符串的价值
例如: 字符串"abacaba",里面包括4个'a',2个'b',1个'c',于是这个字符串的价值为4 * 4 + 2 * 2 + 1 * 1 = 21
牛牛有一个字符串s,并且允许你从s中移除最多k个字符,你的目标是让得到的字符串的价值最小。 

输入描述:
输入包括两行,第一行一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),其中只包含小写字母('a'-'z')。
第二行包含一个整数k(0 ≤ k ≤ length),即允许移除的字符个数。
输出描述:
输出一个整数,表示得到的最小价值
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
		//将所有字符出现的次数放进一个整形数组中
		int[] counts = new int[map.size()];
		int index = 0;
		for(Character key: map.keySet()) {
			counts[index++] = map.get(key);
		}
		
		//每次都将最大的重复次数减1
		//这样最后得到的price就是最小的
		for(int i = 0 ; i < k ; i++) {
			Arrays.sort(counts);
			if(counts[counts.length - 1] > 0) {
				counts[counts.length - 1]--;
			}
		}
		//计算最小价值
		for(int j = 0; j < counts.length ; j++) {
			minPrice += counts[j] * counts[j];
		}
		
		return minPrice;
	}
}
