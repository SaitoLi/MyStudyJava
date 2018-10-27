package com.lzz.tranning;
/**
 * 10进制数转换成26进制，用字母表示
 */
import java.util.Scanner;
import java.util.Stack;

public class ExcelCol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String numCol = excelColNum(n);
		System.out.println(numCol);
		sc.close();
	}
	
	public static String excelColNum(int n) {
		if(n == 0) {
			return "";
		}
		Stack<Character> stack = new Stack<Character>();
		while(n / 26 > 0) {
			stack.push((char) (n%26+64));
			n = n / 26;
		}
		stack.push((char) (n%26+64));
		String str = new String();
		while(!stack.isEmpty()) {
			str += stack.pop();
		}
		return str;
	}
}
