package com.lzz.tranning;

import java.util.Scanner;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。 不能使用除法。
 * 
 * @author CunsiALIEN
 *
 */
public class Multiply {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (!str.equals("")) {
			String[] nums = str.split(" ");
			int len = nums.length;
			int[] arrayA = new int[len];
			for (int i = 0; i < len; i++) {
				arrayA[i] = Integer.valueOf(nums[i]);
			}
			int arrayB[] = multiply(arrayA);
			for (int j = 0; j < arrayA.length; j++) {
				System.out.print(arrayB[j] + " ");
			}
		} else {
			System.out.println("");
		}
		sc.close();
	}

	public static int[] multiply(int[] A) {
		if (A.length == 0) {
			return A;
		}
		int[] B = new int[A.length];
		B[0] = 1;
		for (int i = 1; i < A.length; i++) {
			B[i] = B[i - 1] * A[i - 1];
		}
		int temp = 1;
		for (int j = A.length - 2; j >= 0; j--) {
			temp *= A[j + 1];
			B[j] *= temp;
		}
		return B;
	}
}
