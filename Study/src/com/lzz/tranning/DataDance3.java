package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Scanner;

public class DataDance3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> strs = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			String str = sc.nextLine();
			strs.add(change(str));
		}
//		for (int j = 0; j < strs.size(); j++) {
//			System.out.println(strs.get(j));
//		}
		for(String str : strs) {
			if(!str.equals("")) {
				System.out.println(str);
			}
		}
		sc.close();
	}

	public static String change(String str) {
		if (str == null) {
			return null;
		}
		StringBuilder str1 = new StringBuilder(str);
		int temp = 0;
		int i;
		for (i = 0; i < str.length(); i++) {
			if (i == 0) {
				continue;
			} else if (i == str.length() - 1) {
				if (Character.isUpperCase(str.charAt(i))
						&&Character.isLowerCase(str.charAt(i - 1))) {
					str1.insert(i + temp, "_");
					temp += 1;
				}
			} else if (Character.isUpperCase(str.charAt(i))
					&& (Character.isLowerCase(str.charAt(i + 1)) || Character.isLowerCase(str.charAt(i - 1)))) {
				str1.insert(i + temp, "_");
				temp += 1;
			}
		}
		return str1.toString().toLowerCase();
	}
}
