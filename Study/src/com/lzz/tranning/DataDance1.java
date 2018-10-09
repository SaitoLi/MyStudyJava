package com.lzz.tranning;

import java.util.Scanner;

/**
   *   ÃÀÀöµÄÊı×Ö
 * @author CunsiALIEN
 *
 */
public class DataDance1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		int count = beautifulNumber(a, b, k);
		System.out.println(count);
		sc.close();
	}
	
	public static int beautifulNumber(int a, int b , int k) {
		int count = 0;
		int countA = 0;
		for(countA = 0 ; countA <= k ; countA++) {
			Integer sum = a * countA + b * (k - countA); 
			char[] sum1 = sum.toString().toCharArray();
			for(char num : sum1) {
				if(num != 'a' || num != 'b') {
					break;
				}
			}
			count++;
		}
		return count % 1000000007;
	}
}
