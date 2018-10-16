package com.lzz.tranning;

import java.util.Scanner;

/**
 * ÅÐ¶Ï»ØÎÄ×Ö·û´®
 * @author CunsiALIEN
 *
 */
public class Niuke1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isPalindrome(str));
		sc.close();
	}
	
	public static boolean isPalindrome(String s) {
		if(s == null) {
			return true;
		}
		s = s.toLowerCase();
		char[] charArrayS = s.toCharArray();
		for(int i =0 , j = charArrayS.length - 1; i <= j ; i++ , j--) {
			if(charArrayS[i] < 'a' || charArrayS[i] > 'z') {
				i++;
				continue;
			}
			if(charArrayS[j] < 'a' || charArrayS[j] > 'z') {
				j--;
			}
			if(charArrayS[i] == charArrayS[j]) {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
