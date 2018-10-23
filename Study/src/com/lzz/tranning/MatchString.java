package com.lzz.tranning;

import java.util.Scanner;

/**
 * ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ�����'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ���
 * �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ��
 * ���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
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
				return matchCore(str, indexStr, pattern, indexPattern + 2) // '*'ƥ��0���ַ�
						|| matchCore(str, indexStr + 1, pattern, indexPattern + 2) // '*'ƥ��1���ַ�
						|| matchCore(str, indexStr + 1, pattern, indexPattern); // '*'ƥ�����ַ�
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
