package com.lzz.tranning;

import java.util.Scanner;

/**
 * 一个合法的括号匹配序列有以下定义: 1、空串""是一个合法的括号匹配序列 2、如果"X"和"Y"都是合法的括号匹配序列,"XY"也是一个合法的括号匹配序列
 * 3、如果"X"是一个合法的括号匹配序列,那么"(X)"也是一个合法的括号匹配序列 4、每个合法的括号序列都可以由以上规则生成。
 * 例如:"","()","()()","((()))"都是合法的括号序列 对于一个合法的括号序列我们又有以下定义它的深度: 1、空串""的深度是0
 * 2、如果字符串"X"的深度是x,字符串"Y"的深度是y,那么字符串"XY"的深度为max(x,y)
 * 3、如果"X"的深度是x,那么字符串"(X)"的深度是x+1
 * 例如:"()()()"的深度是1,"((()))"的深度是3。牛牛现在给你一个合法的括号序列,需要你计算出其深度。
 * 
 * @author CunsiALIEN
 * 
 * 输入描述: 
 * 输入包括一个合法的括号序列s,s长度length(2 ≤ length ≤ 50),序列中只包含'('和')'。 输出描述:
 * 输出一个正整数,即这个序列的深度。
 */
public class BracketsMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String brackets = sc.nextLine();
		int depth = bracketsMatch(brackets);
		System.out.println(depth);
		sc.close();
	}

	public static int bracketsMatch(String brackets) {
		int count = 0;
		int maxCount = 0;
		if (brackets == null) {
			return 0;
		} else {
			char[] chBrackets = brackets.toCharArray();
			for (char bracket : chBrackets) {
				if (bracket == '(') {
					count += 1;
					if (count >= maxCount) {
						maxCount = count;
					}
				} else if (bracket == ')') {
					count -= 1;
				}
			}
		}
		return maxCount;
	}
}
