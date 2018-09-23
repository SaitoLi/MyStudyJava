package com.lzz.tranning;

/**
 * ����������������֮��
 * 
 * ��������̬�滮
 * 1����״̬sum[i]��ʾ��ends[i]��Ϊĩβ���������е����ͣ�
 * 2�����ݶ���ɷ�Ϊ���������
 * 	 ��1��������͵���������ֻ��һ��Ԫ�أ����� ends[i] ��ʼ���� ends[i]��β��
 * 	 ��2��������͵����������ж��Ԫ�أ�����ǰ��ĳ�� ends[p] ��ʼ (p<i)��һֱ�� ends[i] ��β��
 * 	  �Ե�һ����������;���ends[i] ����
 *	  �Եڶ�������������� sum[i-1]+ends[i]��
 *��   ���ǵõ�״̬ת�Ʒ��̣�
 *  	 sum[i] = max{ends[i], sum[i-1]+ends[i]}
 * 3���ҳ�sum�����е����ֵ���ɡ�
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
