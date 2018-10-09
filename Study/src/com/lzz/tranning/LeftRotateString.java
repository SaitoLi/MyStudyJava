package com.lzz.tranning;

import java.util.Scanner;

/**
 * ×óÑ­»·×Ö·û´®
 * @author CunsiALIEN
 *
 */
public class LeftRotateString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		String result = leftRotateString(str,n);
		System.out.println(result);
		sc.close();
	}
	
	public static String leftRotateString(String str, int n) {
		if(n > str.length()) {
			return "";
		}
		String rotated = str.substring(0, n);
		String noRotated = str.substring(n);
		String newString = noRotated + rotated;
		return newString;
	}
}
