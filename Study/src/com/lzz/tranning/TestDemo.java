package com.lzz.tranning;

import java.util.Scanner;

public class TestDemo {
	public static int result(int n) {
		int m = run(n);
		return m;
	}

	public static int run(int n) {
		if (n > 1) {
			return n * (n - 1);
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = result(n);
		System.out.println(m);
	}
}
