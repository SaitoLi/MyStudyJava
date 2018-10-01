package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ��Ϊһ���ִ����ˣ��н������㶩����һ������n����ɫ������ִ�����ÿ������Ҫô��ɫ��ҪôͿ����������ɫ��
 * Ϊ��ʹ�ִ���ɫ�ʿ���������ô����������Ҫ���ִ��ϵ�����һ����ɫ����������ɫ����
 * ������������m���������������һ�Σ�ע�������ִ���һ�����Σ����ִ��ϵ���ɫһ����c�֡�
 * ���ڰ�˳ʱ���������n��������ִ��ϣ�ÿ������������������ɫ�ֱ�����Щ��
 * �����жϸ��ִ����ж�������ɫ������Ҫ�󡣼�ѯ���ж�������ɫ����������m�������г������������Ρ�
 * 
 * ��������: ��һ������n��m��c���������ÿո������(1 <= n <= 10000, 1 <= m <= 1000, 1 <= c <= 50)
 * ������n��ÿ�еĵ�һ����num_i(0 <= num_i <= c)��ʾ��i�������ж�������ɫ��
 * ���������ζ���num_i�����֣�ÿ������x��ʾ��i�������ϰ�����x����ɫ(1 <= x <= c) �������:
 * һ���Ǹ���������ʾ���������ж�������ɫ��������
 * 
 * @author CunsiALIEN
 *
 */
public class Rosary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[][] color = new int[n][];
		for (int i = 0; i < n; i++) {
			int colorCount = sc.nextInt();
			color[i] = new int[colorCount];
			for (int j = 0; j < colorCount; j++) {
				color[i][j] = sc.nextInt();
			}
		}

		int count = 0;
		for (int i = 0; i <= c; i++) {
			ArrayList<Integer> colorAt = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < color[j].length; k++) {
					if (color[j][k] == i) {
						colorAt.add(j);
					}
				}
			}

			if (!isVaild(colorAt, n, m)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

	public static boolean isVaild(ArrayList<Integer> colorAt, int n, int m) {
		if(colorAt.size() == 0) {
			return true;
		}
		boolean flag = true;
		for(int i = 0 ; i < colorAt.size() - 1; i++) {
			if(colorAt.get(i+1) - colorAt.get(i) < m) {
				flag = false;
				break;
			}
		}
		int last = colorAt.get(0) - (colorAt.get(colorAt.size() - 1) - n);
		if(last < m) {
			flag = false;
		}
		return flag;
	}
}
