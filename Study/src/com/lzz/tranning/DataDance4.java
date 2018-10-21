package com.lzz.tranning;

import java.util.Scanner;

public class DataDance4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String trueStr = trueString(str);
		System.out.println(trueStr);
		sc.close();
	}
	
	public static String trueString(String str) {
		if(str == null) {
			return null;
		}
		char[] chars = str.toCharArray();
		int countChar = 1;
		for(int i = 0 ; i < chars.length ; i++) {
			if(chars[i] == 'i' || chars[i] == 'o') {
				if(i - countChar >= 0) {
					chars[i] = '-';
					chars[i-countChar] = '-';	
					countChar += 2;
				}
				else {
					chars[i] = '-';
					countChar += 1;
				}
			}
		}
		String trueStr = new String();
		for(Character j : chars) {
			if(j != '-') {
				trueStr += j;
			}
		}
		return trueStr;
	}
}
