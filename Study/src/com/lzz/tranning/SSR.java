package com.lzz.tranning;

import java.util.Scanner;

/**
 * ���Ƕ��������������ϵĺ���SSR(ƽ����֮�͵�ƽ��):
 * SSR(A, B) = (sqrt(A) + sqrt(B))^2��
 * ţţ�Ժ���ֵΪ����������ܸ���Ȥ��
 * ���ڸ�������n��m,�����ţţ���������(A, B)������, ����1 �� A �� n, 1 �� B �� m ����SSR(A, B)��һ��������
 * 
 * @author CunsiALIEN 
 * ��������: ���������������n��m(1 �� n �� 10^5, 1 �� m �� 10^5)
 * �������: ���һ������,��ʾ��������������Զ�����
 */
public class SSR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = ssrIntegerCount(n,m);
		System.out.println(count);
		sc.close();
	}
	
	public static int ssrIntegerCount(int n , int m) {
		int count = 0;
		
		
		return count;
	}
}
