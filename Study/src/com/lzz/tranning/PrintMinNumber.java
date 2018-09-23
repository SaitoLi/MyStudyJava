package com.lzz.tranning;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数， 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 
 * @author CunsiALIEN
 */
public class PrintMinNumber {
	/**
	 * 采用冒泡排序的思想 
	 * 比较连续两个数组元素组成字符串的不同排列方式的大小，
	 * 从小到大排列 并依次将数组元素拼接
	 * @param numbers
	 * @return
	 */
	public static String PrintMinNumber_Solution(int[] numbers) {
		if (numbers == null) {
			return null;
		}
		StringBuilder minNum = new StringBuilder();
		String pre;
		String last;
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				pre = numbers[i] + "" + numbers[j];
				last = numbers[j] + "" + numbers[i];
				if (pre.compareTo(last) > 0) {
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
			minNum.append(numbers[i]);
		}
		return minNum.toString();
	}

	public static void main(String[] args) {
		int[] numbers = { 3, 32, 321 };
		System.out.println(PrintMinNumber_Solution(numbers));
	}
}
