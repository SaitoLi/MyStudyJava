package com.lzz.tranning;

import java.util.Scanner;
import java.util.Stack;

/**
 * ���Ӱ����ʷ�ת
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
		if(str.trim().equals("")) { //ע���������ж��Ƿ�Ϊ�ջ�ֻ�пո�
			//������" ";����ҲΪ" ",������"";
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
