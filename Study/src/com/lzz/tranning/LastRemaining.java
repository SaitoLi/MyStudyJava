package com.lzz.tranning;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Լɪ��
 * ѧ����0--n���б�ţ�����0�ſ�ʼ������ÿ�α�����m - 1��ѧ�����У�ֱ�����һ��ѧ����
 * @author CunsiALIEN
 *
 */
public class LastRemaining {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int konan = LastRemaining_Solution(n, m);
		System.out.println(konan);
		sc.close();
	}

	public static int LastRemaining_Solution(int n, int m) {
		if(n <= 0) {
			return -1;
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			list.add(i);
		}
		int start = 0;
		while(list.size() > 1) {
			start = (start + m) % list.size() - 1;
			if(start >= 0) {
				list.remove(start);
			}
			else {
				//start < 0˵����ѧ���ڶ�β
				list.remove(list.size() - 1);
				start = 0;
			}
		}
		return list.get(0);//����ֻʣ��һ��ѧ��
	}
}
