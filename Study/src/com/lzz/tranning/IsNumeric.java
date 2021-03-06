package com.lzz.tranning;

import java.util.Scanner;

/**
   *   请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
   *   例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 3
   *   但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * @author CunsiALIEN
 *
 */
public class IsNumeric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isNumeric(str.toCharArray()));
		sc.close();
	}
	
	/**
	   *   使用正则表达式
	 * 
     *
	以下对正则进行解释:
	[\\+\\-]?            -> 正或负符号出现与否
	\\d*                 -> 整数部分是否出现，如-.34 或 +3.34均符合
	(\\.\\d+)?           -> 如果出现小数点，那么小数点后面必须有数字；否则一起不出现
	([eE][\\+\\-]?\\d+)? -> 如果存在指数部分，那么e或E肯定出现，+或-可以不出现，紧接着必须跟着整数；或者整个部分都不出现
     *
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(char[] str) {
		String string = String.valueOf(str);
		return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
	}
}
