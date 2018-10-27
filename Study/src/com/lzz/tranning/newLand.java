package com.lzz.tranning;

import java.util.Scanner;

public class newLand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] map = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int num = newLandNum(map);
		System.out.println(num);
		sc.close();
	}
	
	public static int newLandNum(int[][] map) {
		
		return 0;
	}
}
