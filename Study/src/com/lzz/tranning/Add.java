package com.lzz.tranning;
/**
 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
 * 
 * �����������㣬���Խ���λ���㣻
 * ��Ӧλ��0+0��1+1�Ľ������0����0+1��1+0�Ľ����1�����������ͬ��
 * �ٿ��ǽ�λ��ֻ�е�1+1�Ż������λ�����Զ�����1+1=10�����Կ���1��1���������һλ
 * ���ͨ��ǰ�����Ľ���ֱ���Ϊ���������ݹ�����Լ���û�н�λʱ�������
 */

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = add_Solution(num1, num2);
		System.out.println(sum);
		sc.close();
	}
	
	public static int add_Solution(int num1, int num2) {
		if(num2 == 0) {
			//�����жϵݹ����ʱû�н�λ������������
			return num1;
		}
		// ������ģ��1+0��0+1
		int sum = num1 ^ num2;
		// ��������λ��ģ���λ���̣�ֻ��1+1�������λ
		int carry = (num1 & num2) << 1;
		// �ݹ�����Լ��������ս��
		return add_Solution(sum,carry);
	}
}
