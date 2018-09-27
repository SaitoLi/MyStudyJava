package com.lzz.tranning;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ţţ�ٰ���һ��������Ϸ,��n����Ҳμ������Ϸ,��Ϸ��ʼÿ�����ѡ��һ����,Ȼ�������д��ֽ��(ʮ������,��ǰ׺��),
 * Ȼ�����������ÿһ�����ֽ�����λ���շǵݼ�˳������,�õ��µ���,������ǰ׺�㽫�����ԡ�
 * �õ�������ֵ����Ӯ�������Ϸ��
 * 
 * ��������: 
 * �����������,
 * ��һ�а���һ������n(1 �� n �� 50),����ҵ����� 
 * �ڶ���n������x[i](0 �� x[i] �� 100000),��ÿ�����д�µ�������
 * �������: 
 * ���һ������,��ʾӮ����Ϸ���Ǹ���һ�õ���������Ƕ��١�
 * 
 * @author CunsiALIEN
 */
public class NumGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] newX = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			newX[i] = newNumBySort(x[i]);
//			System.out.println(newX[i]);
		}
		int max = 0;
		for (int j = 0; j < newX.length; j++) {
			if (newX[j] >= max) {
				max = newX[j];
			}
		}
		System.out.println(max);
		sc.close();
	}

	public static int newNumBySort(int x) {
		String num = Integer.toString(x);
		char[] chNum = num.toCharArray();
		Arrays.sort(chNum);
		return Integer.parseInt(String.valueOf(chNum));
	}
}
