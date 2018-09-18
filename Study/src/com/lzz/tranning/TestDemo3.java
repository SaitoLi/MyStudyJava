package com.lzz.tranning;

import java.util.Scanner;

public class TestDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][3];
		for (int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
			a[i][2] = sc.nextInt();
		}
		for (int j = 0; j < n; j++) {
			System.out.println(run(a[j]));
		}

	}

	public static String run(int[] b) {
		int x = b[0];
		int k = 1;
		int temp = 0;
		int temp1 = 0;
		while (true) {
			temp1 = x % b[1];
			if(temp1 == b[0])
			{
				return "YES";
			}
			if(temp1 == temp) {
				break;
			}
			x = b[0] * ++k;
			temp = temp1;
		}
		return "NO";
	}
}
