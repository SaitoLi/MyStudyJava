package com.lzz.tranning;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataDance5 {
//	public static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] line = new int[n];
		int[][] lineNum = new int[m][2];
		for(int i = 0 ; i < m ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			line[x - 1] += 1;
			line[y - 1] += 1;
			lineNum[i][0] = x;
			lineNum[i][1] = y;
//			createLine(x,y);
			
		}
		int j = 0;
		int killNum = 0 ;
		for(j = 1 ; j <= m ; j++) {
			int kill = sc.nextInt();
			killLine(line,lineNum[kill - 1]);
			if(isDivide(line,lineNum[kill - 1]) && killNum == 0) {
				killNum = j;
			}
		}
		if(killNum == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(killNum);
		}
		sc.close();
	}
	
	public static boolean isDivide(int[] line, int[] kill) {
//		if(map.containsValue(0)) {
//			return true;
//		}
		if(line[kill[0] -1] == 0 || line[kill[1] - 1] == 0) {
			return true;
		}
		return false;
	}
	
	public static void killLine(int[] line, int[] kill) {
//		if(map.containsKey(kill[0])) {
//			map.put(kill[0], map.get(kill[0]) - 1);
//			map.put(kill[1], map.get(kill[1]) - 1);
//		} 
		line[kill[0] - 1] -= 1;
		line[kill[1] - 1] -= 1;
	}
	
//	public static void createLine(int x , int y) {
//		if(!map.containsKey(x)) {
//			map.put(x, 1);
//		}
//		else {
//			map.put(x, map.get(x)+1);
//		}
//		if(!map.containsKey(y)) {
//			map.put(y, 1);
//		}
//		else {
//			map.put(y, map.get(y)+1);
//		}
//	}
}
