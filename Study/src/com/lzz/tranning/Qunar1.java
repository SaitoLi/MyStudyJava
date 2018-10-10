package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Scanner;

public class Qunar1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		String[] num = number.split(" ");
		jumpArray(num);
		sc.close();
	}
	
	public static void jumpArray(String[] num) {
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0 ;
		while(index != num.length - 1) {
			if(index + Integer.parseInt(num[index]) == num.length - 1) {
				list.add(Integer.parseInt(num[index]));
				break;
			}
			int start = index;
			int jumpIndex = Integer.parseInt(num[index]);
			int nextMax = 0;
			int nextMaxIndex = 0;
			for(int i = start + 1 ; i <= jumpIndex ; i++) {
				if(Integer.parseInt(num[i]) > nextMax) {
					nextMax = Integer.parseInt(num[i]);
					nextMaxIndex = i;
				}
			}
			index = start + nextMaxIndex;
			list.add(nextMaxIndex);
		}
		for(Integer integer: list) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}
}
