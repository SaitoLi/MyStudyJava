package com.lzz.tranning;

import java.util.Scanner;
import java.util.Stack;

/**
 * 清雨又在吃自助餐了。 排在清雨面前的有N种食物，排成一排，清雨可以选择其中的若干种食物，但是不能连续选择相邻的食物。
 * 因为清雨很挑食，当所有食物都不合口味时，他可以一种都不选，即一个都不选也算为一种方法。 请问他有多少种选择食物的方法呢？
 * 
 * @author CunsiALIEN
 *
 */
public class BuffetChoose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 食物的种类
		int choicesCount = chooseFoods(n);// 挑选方法的个数
		System.out.println(choicesCount);
	}

	public static int chooseFoods(int n) {
		if(n == 0) {
			return 1;
		}
		int choiceCount = 0;
		for (int species = 1; species <= (n + 1) / 2; species++) {
			if (species == 1) {
				choiceCount += n;
			} else {
				if (n > (species-1) * 2) {
					for (int j = n - (species-1) * 2; j > 0; j--) {
						choiceCount += j;
					}
				}
				else {
					break;
				}
			}
		}
		return choiceCount + 1;
	}
}
