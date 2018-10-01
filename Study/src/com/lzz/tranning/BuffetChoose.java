package com.lzz.tranning;

import java.util.Scanner;
import java.util.Stack;

/**
 * �������ڳ��������ˡ� ����������ǰ����N��ʳ��ų�һ�ţ��������ѡ�����е�������ʳ����ǲ�������ѡ�����ڵ�ʳ�
 * ��Ϊ�������ʳ��������ʳ�ﶼ���Ͽ�ζʱ��������һ�ֶ���ѡ����һ������ѡҲ��Ϊһ�ַ����� �������ж�����ѡ��ʳ��ķ����أ�
 * 
 * @author CunsiALIEN
 *
 */
public class BuffetChoose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// ʳ�������
		int choicesCount = chooseFoods(n);// ��ѡ�����ĸ���
		System.out.println(choicesCount);
	}

	public static int chooseFoods(int n) {
		if(n == 0) {
			return 1;
		}
		int choiceCount = 0;
		for (int species = 1; species <= (n + 1) / 2; species++) {
			if (species == 1) {
				choiceCount += n;
			} else {
				if (n > (species-1) * 2) {
					for (int j = n - (species-1) * 2; j > 0; j--) {
						choiceCount += j;
					}
				}
				else {
					break;
				}
			}
		}
		return choiceCount + 1;
	}
}
