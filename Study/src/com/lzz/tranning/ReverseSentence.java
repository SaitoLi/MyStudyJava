package com.lzz.tranning;

import java.util.Scanner;
import java.util.Stack;

/**
 * 句子按单词翻转
 * 
 * @author CunsiALIEN
 *
 */
public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String trueSentence = reverseSentence(str);
		System.out.println(trueSentence);
		sc.close();
	}

	public static String reverseSentence(String str) {
		if(str.trim().equals("")) { //注意这里是判断是否为空或只有空格
			//如输入" ";返回也为" ",而不是"";
			return str;
		}
		String[] words = str.split(" ");
		Stack<String> stack = new Stack<String>();
		for (String word : words) {
			stack.push(word);
		}
		String trueSentence = new String();
		while (stack.size() != 0) {
			if (stack.size() != 1) {
				trueSentence += stack.pop() + " ";
			}
			else {
				trueSentence += stack.pop();
			}
		}
		return trueSentence;
	}
}
