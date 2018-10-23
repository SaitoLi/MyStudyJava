package com.lzz.tranning;

import java.util.Scanner;

/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 * 
 * @author CunsiALIEN
 *
 */
public class MatchString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String pattern = sc.nextLine();
		boolean flag = match(str.toCharArray(), pattern.toCharArray());
		System.out.println(flag);
		sc.close();
	}

	public static boolean match(char[] str, char[] pattern) {
		if (str == null || pattern == null) {
			return false;
		}
		int indexStr = 0;
		int indexPattern = 0;
		return matchCore(str, indexStr, pattern, indexPattern);
	}

	public static boolean matchCore(char[] str, int indexStr, char[] pattern, int indexPattern) {
		if (indexStr == str.length && indexPattern == pattern.length) {
			return true;
		}
		if (indexStr != str.length && indexPattern == pattern.length) {
			return false;
		}

		if (indexStr == str.length && indexPattern != pattern.length) {
			if (indexPattern + 1 < pattern.length && pattern[indexPattern + 1] == '*') {
				return matchCore(str, indexStr, pattern, indexPattern + 2);
			}
			return false;
		}

		if (indexPattern + 1 < pattern.length && pattern[indexPattern + 1] == '*') {
			if ((pattern[indexPattern] == str[indexStr] || pattern[indexPattern] == '.') && indexStr != str.length) {
				return matchCore(str, indexStr, pattern, indexPattern + 2) // '*'匹配0个字符
						|| matchCore(str, indexStr + 1, pattern, indexPattern + 2) // '*'匹配1个字符
						|| matchCore(str, indexStr + 1, pattern, indexPattern); // '*'匹配多个字符
			} else {
				return matchCore(str, indexStr, pattern, indexPattern + 2);
			}
		}
		if (indexStr != str.length && (pattern[indexPattern] == str[indexStr] || pattern[indexPattern] == '.')) {
			return matchCore(str, indexStr + 1, pattern, indexPattern + 1);
		}
		return false;
	}
}
