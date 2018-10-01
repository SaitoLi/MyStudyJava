package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 作为一个手串艺人，有金主向你订购了一条包含n个杂色串珠的手串——每个串珠要么无色，要么涂了若干种颜色。
 * 为了使手串的色彩看起来不那么单调，金主要求，手串上的任意一种颜色（不包含无色），
 * 在任意连续的m个串珠里至多出现一次（注意这里手串是一个环形）。手串上的颜色一共有c种。
 * 现在按顺时针序告诉你n个串珠的手串上，每个串珠用所包含的颜色分别有哪些。
 * 请你判断该手串上有多少种颜色不符合要求。即询问有多少种颜色在任意连续m个串珠中出现了至少两次。
 * 
 * 输入描述: 第一行输入n，m，c三个数，用空格隔开。(1 <= n <= 10000, 1 <= m <= 1000, 1 <= c <= 50)
 * 接下来n行每行的第一个数num_i(0 <= num_i <= c)表示第i颗珠子有多少种颜色。
 * 接下来依次读入num_i个数字，每个数字x表示第i颗柱子上包含第x种颜色(1 <= x <= c) 输出描述:
 * 一个非负整数，表示该手链上有多少种颜色不符需求。
 * 
 * @author CunsiALIEN
 *
 */
public class Rosary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[][] color = new int[n][];
		for (int i = 0; i < n; i++) {
			int colorCount = sc.nextInt();
			color[i] = new int[colorCount];
			for (int j = 0; j < colorCount; j++) {
				color[i][j] = sc.nextInt();
			}
		}

		int count = 0;
		for (int i = 0; i <= c; i++) {
			ArrayList<Integer> colorAt = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < color[j].length; k++) {
					if (color[j][k] == i) {
						colorAt.add(j);
					}
				}
			}

			if (!isVaild(colorAt, n, m)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	public static boolean isVaild(ArrayList<Integer> colorAt, int n, int m) {
		if(colorAt.size() == 0) {
			return true;
		}
		boolean flag = true;
		for(int i = 0 ; i < colorAt.size() - 1; i++) {
			if(colorAt.get(i+1) - colorAt.get(i) < m) {
				flag = false;
				break;
			}
		}
		int last = colorAt.get(0) - (colorAt.get(colorAt.size() - 1) - n);
		if(last < m) {
			flag = false;
		}
		return flag;
	}
}
