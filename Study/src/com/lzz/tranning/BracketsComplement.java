package com.lzz.tranning;

import java.util.Scanner;

/**
 * һ�������������ַ��������������: 
 * 1�����ַ����������ġ�
 * 2�����s���������ַ�������ô(s)Ҳ�������ġ�
 * 3�����s��t���������ַ��������������������γɵ�stҲ�������ġ�
   *    ���磬"(()())", ""��"(())()"�������������ַ�����"())(",
 * "()(" �� ")"�ǲ������������ַ�����
 * ţţ��һ�������ַ���s,������Ҫ����������λ�þ����ٵ��������,����ת��Ϊһ�������������ַ���������ţţ������Ҫ��Ӷ��ٸ����š�
 *  ��������:
 * �������һ��,һ����������s,���г���length(1 �� length �� 50). s��ÿ���ַ����������Ż���������,��'('����')'.
 * �������: 
 * ���һ������,��ʾ������Ҫ��ӵ�������
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
		 * �����������������һЩ����
		 * ��ÿһ�εĿ�ʼ�ַ�Ϊ������ʱ��Ҫ������������Ϊ����������������֮ƥ�䣬����һ��Ҫ�����Ӧ��������
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
