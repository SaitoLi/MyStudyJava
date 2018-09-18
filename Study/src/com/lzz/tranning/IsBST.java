package com.lzz.tranning;

import java.util.Arrays;
/**
   *   ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No��
   *   �������������������������ֶ�������ͬ��
 * @author CunsiALIEN
 *
 */
public class IsBST {
	public boolean VerifySquenceOfBST(int[] sequence) {
		/**
		   *   ����һ���������ĺ������������˵��
		   *   ���һ����һ���Ǹ��ڵ㣬Ȼ��ǰ������У����ʼ����һ�����ڸ��ڵ���������������е�����
		   *   �����浽�����ڶ�����Ӧ�ö��Ǵ��ڸ��ڵ�ģ�����������
		   *   ��������������С�ڸ��ڵ�ģ���ô˵��������в��Ƕ����������ĺ����������
		 */
		if (sequence == null || sequence.length <= 0) {
			return false;
		}
		int i= 0;
		int len = sequence.length;
		int root = sequence[len - 1];
		for(i = 0 ; i < len ; i++) {  //Ѱ�����������ķֽ紦
			if(root <= sequence[i]) {
				break;
			}
		}
		int j = i;
		for(j = i ; j < len - 1 ; j++) {
			if(root > sequence[j]) {  //���������������ֵС�ڸ��ڵ�ֵ�Ľڵ���ڣ����Ǻ����������
				return false;
			}
		}
		boolean leftFlag = true;
		if(i > 0) {
			//�ݹ���֤
			leftFlag = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0 , i));
		}
		boolean rightFlag = true;
		if(i < len -1) {
			rightFlag = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, len-1));
		}
		return leftFlag && rightFlag;
	}
	
	public static void main(String[] args) {
		int[] sequence = {5,7,6,9,11,10,8};
		IsBST is = new IsBST();
		boolean flag = is.VerifySquenceOfBST(sequence);
		System.out.println(flag);
	}
}
