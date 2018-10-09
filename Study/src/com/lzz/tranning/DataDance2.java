package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 魔兽世界
 * 
 * @author CunsiALIEN
 *
 */
public class DataDance2 {

	public static ArrayList<Integer> xs = new ArrayList<Integer>();
	public static ArrayList<Integer> ys = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 金币数量
		int m = sc.nextInt();// 最多穿戴m件装备
		while (sc.hasNextInt()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			start(n, m, x, y);
		}

		sc.close();
	}

	public static void start(int n, int m, int x, int y) {
		xs.add(x);
		ys.add(y);
		int[][] xy = new int[xs.size()][2];// 装备一览
		double[][] units = new double[2][xs.size()];// 各装备单位金币可以买到的等级
		for (int i = 0; i < xs.size(); i++) {
			xy[i][0] = xs.get(i);
			xy[i][1] = ys.get(i);
			units[1][i] = i;
			units[0][i] = (double) xy[i][1] / xy[i][0];
		}
		int maxLevel = findMaxLevel(n, m, xy, units);
		System.out.println(maxLevel);
	}

	public static int findMaxLevel(int n, int m, int[][] xy, double[][] units) {
		int maxLevel = 0;
		for (int i = 0; i < units[0].length - 1; i++) {
			for (int j = i; j < units[0].length - 1; j++) {
				if (units[0][j] < units[0][j + 1]) {
					double temp = units[0][j];
					units[0][j] = units[0][j + 1];
					units[0][j + 1] = temp;
					double temp1 = units[1][j];
					units[1][j] = units[1][j + 1];
					units[1][j + 1] = temp1;
				}
			}
		}
		int index = 0;
		while (index < units[1].length) {
			if (n - xy[(int) units[1][index]][0] >= 0) {
				n -= xy[(int) units[1][index]][0];
			}
			maxLevel += xy[(int) units[1][index++]][1];
		}
		return maxLevel;
	}
}
