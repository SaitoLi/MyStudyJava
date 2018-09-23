package com.lzz.tranning;
/**
 * 求正整数1-N区间中数字1出现的次数
 * @author CunsiALIEN
 *
 */
public class NumberOf1Between1AndN {
	public static int NumberOf1Between1AndN_Solution(int n) {
		String strN = "";
		int count = 0 ;
		for(int i = 1 ; i <= n ; i++) {
			strN = Integer.toString(i);
			if(strN.contains("1")) {
				char[] charNum = strN.toCharArray();
				for(int j = 0 ; j < charNum.length; j++) {
					if(charNum[j] == '1') {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(NumberOf1Between1AndN_Solution(n));
	}
}
