package com.lzz.tranning;
/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * 
 * 不能四则运算，所以进行位运算；
 * 对应位置0+0、1+1的结果都是0，而0+1、1+0的结果是1，与异或结果相同；
 * 再考虑进位，只有当1+1才会产生进位，所以二进制1+1=10，可以看成1和1相与后左移一位
 * 最后通过前两步的结果分别作为参数，来递归调用自己，没有进位时候结束。
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
			//用来判断递归调用时没有进位存在则计算结束
			return num1;
		}
		// 异或过程模拟1+0、0+1
		int sum = num1 ^ num2;
		// 相与再移位，模拟进位过程，只有1+1会产生进位
		int carry = (num1 & num2) << 1;
		// 递归调用自己计算最终结果
		return add_Solution(sum,carry);
	}
}
