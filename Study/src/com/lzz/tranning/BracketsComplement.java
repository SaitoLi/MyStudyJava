package com.lzz.tranning;

import java.util.Scanner;

/**
 * 一个完整的括号字符串定义规则如下: 
 * 1、空字符串是完整的。
 * 2、如果s是完整的字符串，那么(s)也是完整的。
 * 3、如果s和t是完整的字符串，将它们连接起来形成的st也是完整的。
   *    例如，"(()())", ""和"(())()"是完整的括号字符串，"())(",
 * "()(" 和 ")"是不完整的括号字符串。
 * 牛牛有一个括号字符串s,现在需要在其中任意位置尽量少地添加括号,将其转化为一个完整的括号字符串。请问牛牛至少需要添加多少个括号。
 *  输入描述:
 * 输入包括一行,一个括号序列s,序列长度length(1 ≤ length ≤ 50). s中每个字符都是左括号或者右括号,即'('或者')'.
 * 输出描述: 
 * 输出一个整数,表示最少需要添加的括号数
 * 
 * @author CunsiALIEN
 *
 */
public class BracketsComplement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String brackets = sc.nextLine();
		int complementCount = bracketsComplement(brackets);
		System.out.println(complementCount);
		sc.close();
	}

	public static int bracketsComplement(String brackets) {
		/*
		 * 此题与求括号深度有一些区别：
		 * 当每一段的开始字符为有括号时需要单独计数，因为不会再有左括号与之匹配，所以一定要添加相应的左括号
		 */
		int count = 0;
		int rightBrackets = 0;
		if (brackets == null) {
			return 0;
		} else {
			char[] chBrackets = brackets.toCharArray();
			for (char bracket : chBrackets) {
				if (bracket == '(') {
					count += 1;
				} else if (bracket == ')') {
					if(count > 0) {
						count -= 1;
					}
					else {
						rightBrackets++;
					}
				}
			}
		}
		return count + rightBrackets;
	}
}
