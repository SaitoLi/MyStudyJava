package com.lzz.tranning;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 牛牛举办了一场数字游戏,有n个玩家参加这个游戏,游戏开始每个玩家选定一个数,然后将这个数写在纸上(十进制数,无前缀零),
 * 然后接下来对于每一个数字将其数位按照非递减顺序排列,得到新的数,新数的前缀零将被忽略。
 * 得到最大数字的玩家赢得这个游戏。
 * 
 * 输入描述: 
 * 输入包括两行,
 * 第一行包括一个整数n(1 ≤ n ≤ 50),即玩家的人数 
 * 第二行n个整数x[i](0 ≤ x[i] ≤ 100000),即每个玩家写下的整数。
 * 输出描述: 
 * 输出一个整数,表示赢得游戏的那个玩家获得的最大数字是多少。
 * 
 * @author CunsiALIEN
 */
public class NumGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] newX = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			newX[i] = newNumBySort(x[i]);
//			System.out.println(newX[i]);
		}
		int max = 0;
		for (int j = 0; j < newX.length; j++) {
			if (newX[j] >= max) {
				max = newX[j];
			}
		}
		System.out.println(max);
		sc.close();
	}

	public static int newNumBySort(int x) {
		String num = Integer.toString(x);
		char[] chNum = num.toCharArray();
		Arrays.sort(chNum);
		return Integer.parseInt(String.valueOf(chNum));
	}
}
