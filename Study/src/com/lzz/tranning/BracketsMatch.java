package com.lzz.tranning;

import java.util.Scanner;

/**
 * һ���Ϸ�������ƥ�����������¶���: 1���մ�""��һ���Ϸ�������ƥ������ 2�����"X"��"Y"���ǺϷ�������ƥ������,"XY"Ҳ��һ���Ϸ�������ƥ������
 * 3�����"X"��һ���Ϸ�������ƥ������,��ô"(X)"Ҳ��һ���Ϸ�������ƥ������ 4��ÿ���Ϸ����������ж����������Ϲ������ɡ�
 * ����:"","()","()()","((()))"���ǺϷ����������� ����һ���Ϸ����������������������¶����������: 1���մ�""�������0
 * 2������ַ���"X"�������x,�ַ���"Y"�������y,��ô�ַ���"XY"�����Ϊmax(x,y)
 * 3�����"X"�������x,��ô�ַ���"(X)"�������x+1
 * ����:"()()()"�������1,"((()))"�������3��ţţ���ڸ���һ���Ϸ�����������,��Ҫ����������ȡ�
 * 
 * @author CunsiALIEN
 * 
 * ��������: 
 * �������һ���Ϸ�����������s,s����length(2 �� length �� 50),������ֻ����'('��')'�� �������:
 * ���һ��������,��������е���ȡ�
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
