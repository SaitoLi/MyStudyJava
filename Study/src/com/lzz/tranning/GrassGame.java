package com.lzz.tranning;

import java.util.Scanner;

/**
 * ţţ�����򶼺�ϲ����ݡ��������Ǿ����������Ϸ��
�����һ��װ��n����ݵ�����,ţţ���������ν���,ţţ�ȿ�ʼ��
��ÿ���غ���,ÿ����ұ����һЩ�����е����,���Ե���ݷ���������4��x����,����1,4,16,64�ȵȡ�
�����������гԵ���Ч������ݵ������ܡ�
�ٶ�ţţ�������ǰ�����ѷ���������Ϸ,�����ʤ���ߵ����֡� 

��������:
�������t+1�С�
��һ�а���һ������t(1 �� t �� 100),��ʾ�����.
������t��ÿ��һ��n(1 �� n �� 10^9),��ʾ��ݷ���
�������:
����ÿһ��n,���ţţʤ�����"niu",�������ʤ�����"yang"��
 * @author CunsiALIEN
 *
 */
public class GrassGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] n = new int[t];
		for(int i = 0; i < t; i++) {
			n[i] = sc.nextInt();
		}
		for(int j = 0 ; j < n.length ; j++) {
			String winner = gameStart(n[j]);
			System.out.println(winner);
		}
		sc.close();
	}
	
	public static String gameStart(int n) {
		/**
		   *   ��ö�ٵó����ۣ���ѧ��
		 */
		if(n%5 == 0 || n %5 == 2) {
			return "yang";
		}
		return "niu";
	}
}
