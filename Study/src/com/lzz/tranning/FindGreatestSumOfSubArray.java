package com.lzz.tranning;

/**
 * 求数组的最大子序列之和
 * 
 * 方法：动态规划
 * 1、令状态sum[i]表示以ends[i]作为末尾的连续序列的最大和；
 * 2、根据定义可分为两种情况：
 * 	 （1）这个最大和的连续序列只有一个元素，即以 ends[i] 开始，以 ends[i]结尾；
 * 	 （2）这个最大和的连续序列有多个元素，即从前面某处 ends[p] 开始 (p<i)，一直到 ends[i] 结尾；
 * 	  对第一种情况，最大和就是ends[i] 本身。
 *	  对第二种情况，最大和是 sum[i-1]+ends[i]。
 *　   于是得到状态转移方程：
 *  	 sum[i] = max{ends[i], sum[i-1]+ends[i]}
 * 3、找出sum数组中的最大值即可。
 *  
 * @author CunsiALIEN
 */
public class FindGreatestSumOfSubArray {
	public static int FindGreatestSumOfSubArray_Solution(int[] array) {
		int len = array.length;
		int[] sum = new int[len];
		int[] ends = array;
		sum[0] = ends[0];

		for (int i = 1; i < len; i++) {
			sum[i] = max(sum[i - 1] + ends[i], ends[i]);
		}

		int greatestSum = sum[0];
		for (int j = 1; j < len; j++) {
			if(sum[j] > greatestSum) {
				greatestSum = sum[j];
			}
		}
		return greatestSum;
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}
}
