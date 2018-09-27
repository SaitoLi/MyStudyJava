package com.lzz.tranning;

import java.util.Scanner;

/**
 * 牛牛和羊羊都很喜欢青草。今天他们决定玩青草游戏。
最初有一个装有n份青草的箱子,牛牛和羊羊依次进行,牛牛先开始。
在每个回合中,每个玩家必须吃一些箱子中的青草,所吃的青草份数必须是4的x次幂,比如1,4,16,64等等。
不能在箱子中吃到有效份数青草的玩家落败。
假定牛牛和羊羊都是按照最佳方法进行游戏,请输出胜利者的名字。 

输入描述:
输入包括t+1行。
第一行包括一个整数t(1 ≤ t ≤ 100),表示情况数.
接下来t行每行一个n(1 ≤ n ≤ 10^9),表示青草份数
输出描述:
对于每一个n,如果牛牛胜利输出"niu",如果羊羊胜利输出"yang"。
 * @author CunsiALIEN
 *
 */
public class GrassGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] n = new int[t];
		for(int i = 0; i < t; i++) {
			n[i] = sc.nextInt();
		}
		for(int j = 0 ; j < n.length ; j++) {
			String winner = gameStart(n[j]);
			System.out.println(winner);
		}
		sc.close();
	}
	
	public static String gameStart(int n) {
		/**
		   *   从枚举得出结论，数学题
		 */
		if(n%5 == 0 || n %5 == 2) {
			return "yang";
		}
		return "niu";
	}
}
