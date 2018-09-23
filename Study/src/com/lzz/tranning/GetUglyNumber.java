package com.lzz.tranning;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * @author CunsiALIEN
 */
public class GetUglyNumber {
	/**
	 * 某个丑数肯定是前面丑数的2,3,5倍数;
	 * 只需要从前往后生成即可。1,2,3,4,5,6,8,9,10,12,15......
	 * @param index 第index个丑数
	 * @return
	 */
	public static int GetUglyNumber_Solution(int index) {
		if(index == 0) {
			return 0 ; 
		}
		int[] uglyNums = new int[index];
		uglyNums[0] = 1; //1是第一个丑数
		
		/*
		 * 丑数的定义是1或者因子只有2 3 5,可推出丑数=丑数*丑数,假定丑数有序序列为:a1,a2,a3.......an 
		 * 所以可以将以上序列(a1除外)可以分成3类,必定满足: 
		 * 包含2的有序丑数序列:2*a1, 2*a2, 2*a3 ..... 
		 * 包含3的有序丑数序列:3*a1, 3*a2, 3*a3 ..... 
		 * 包含5的有序丑数序列:5*a1, 5*a2, 5*a3 ..... 
		 * 以上3个序列的个数总数和为n个,而且已知a1 = 1了,将以上三个序列合并成一个有序序列即可 
		 * 程序中multi2,multi3,multi5实际就是合并过程中三个序列中带排序的字段索引  
		 * 根据已知求到结果,再把这个结果当成已知,求下一个结果......直到目标结果出现
		 */
		int multi2 = 0;   
		int multi3 = 0;
		int multi5 = 0;
		
		for(int i = 1 ; i < uglyNums.length; i++) {
			int min = min(uglyNums[multi2]*2,uglyNums[multi3]*3,uglyNums[multi5]*5);
			uglyNums[i] = min;

			if(uglyNums[multi2]*2 == uglyNums[i]) {
				multi2++;
			}
			if(uglyNums[multi3]*3 == uglyNums[i]) {
				multi3++;
			}
			if(uglyNums[multi5]*5 == uglyNums[i]) {
				multi5++;
			}
		}
		return uglyNums[uglyNums.length - 1];
	}
	
	public static int min(int a, int b, int c) {
		int min = a < b ? a :b;
		return min < c ? min : c;
	}
	
	public static void main(String[] args) {
		int index = 20;
		System.out.println(GetUglyNumber_Solution(index));
	}
}
