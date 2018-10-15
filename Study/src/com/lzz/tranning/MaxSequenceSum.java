package com.lzz.tranning;

import java.util.Scanner;

public class MaxSequenceSum {
	/*
	 *  ��̬�滮�������⣺��������������������к�
	 */
	
	// ������������к�ֻ��������λ��0��n-1��ĳ��λ�ý�β������������i��Ԫ��ʱ���ж�����ǰ������������к��Ƿ����0��
	// �������0������λ��i��β��������������к�ΪԪ��i��ǰ�ŵ����������к���ӣ���������λ��i��β��������������к�ΪԪ��i��
	// ״̬ת�Ʒ���:
	// sum[i]=max(sum[i-1]+a[i],a[i])

	public static int maxSequenceSum(int[] a, int len) {
		int maxsum, maxpre;
		if (len == 0) {
			return 0;
		}
		maxsum = maxpre = a[0];
		for (int i = 1; i < len; i++) {
			if (maxpre <= 0) {
				maxpre = a[i];
			} else {
				maxpre += a[i];
			}
			if (maxpre > maxsum) {
				maxsum = maxpre;
			}
		}
		return maxsum;
	}

	public static void main(String[] args) {
		int[] a1 = {};
		int[] a2 = { 2, -3, 4, 1, 5, -2, 7 };
		int maxsum1 = MaxSequenceSum.maxSequenceSum(a1, a1.length);
		int maxsum2 = MaxSequenceSum.maxSequenceSum(a2, a2.length);
		System.out.println("MaxSum of a1 is " + maxsum1);
		System.out.println("MaxSum of a2 is " + maxsum2);
		
//		Scanner sc = new Scanner(System.in);
//		int len = 10;
//		int[] nums = new int[len];
//		for(int i = 0 ; i < len ; i++) {
//			nums[i] = sc.nextInt();
//		}
//		int maxsum = maxSequenceSum(nums, nums.length);
//		System.out.println(maxsum);
//		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		String[] nums = str.split(",");
//		nums[0] = nums[0].substring(1);
//		nums[nums.length - 1] = nums[nums.length - 1].substring(0,nums[nums.length - 1].length() - 2);
//		int[] array = new int[nums.length];
//		for(int i =0  ; i < nums.length ; i++) {
//			array[i] = Integer.parseInt(nums[i]);
//		}
//		System.out.println(maxSequenceSum(array, array.length));
//		sc.close();
	}
}
