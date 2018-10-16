package com.lzz.tranning;

import java.util.Scanner;

/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 * 
 * @author CunsiALIEN
 */
public class StrToInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int result = strToInt(str);
		System.out.println(result);
		sc.close();
	}

	public static int strToInt(String str) {
		/**
		 * res = (res << 1) + (res << 3) + (str[i] & 0xf);

对这句话的解释： (res << 1) + (res << 3)，左移一位是乘以2，左移3位是乘以8，加起来相当于res*10；

(str[i] & 0xf) 相当于 str[i] - '0'，为什么呢？因为 字符'0' ~ '9' 的SACII码值的低四个二进制位就是 0 ~ 9， 0xf 是数字15，
二进制位1111，这样操作之后就可以将 ‘0’ 转化为0，...，将‘9’转化为‘9’。

整体看这句话：res = res * 10 + str[i] - ‘0’。例如字符串为‘123’；

那么单步运行：res = 1； res = 1 * 10 + 2 = 12； res = 12 * 10 + 3 = 12

		 */
		int len = str.length();
		if (len <= 0)
		{
			return 0;
		}
		int symbol = 1;
		long res = 0;
		if (str.charAt(0) == '-')
		{
		    symbol = -1;
		}
		for (int i = (str.charAt(0) == '+' || str.charAt(0) == '-') ? 1 : 0; i < len; ++i) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				res = (res << 1) + (res << 3) + (str.charAt(i) & 0xf);
			}
			else 
			{
				return 0;	
			}
		}
		return (int) (res * symbol);
	}
}
