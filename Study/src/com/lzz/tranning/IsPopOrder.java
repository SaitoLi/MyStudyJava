package com.lzz.tranning;

import java.util.Stack;
/**
 *    ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 *    ����ѹ��ջ���������־�����ȡ�
 *    ��������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 *    ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 * @author CunsiALIEN
 *
 */
public class IsPopOrder {
	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,5,3,2,1};
		System.out.println(isPopOrder(pushA,popA));
	}
	
	
	/**
	   *   ����һ������ջs,������1,2,3,4,5����ѹ�븨��ջs�������յڶ�������4,5,3,2,1��˳��Ӹ���ջs�е������֡�
���� 	   *   �Ƚ�����1,2,3,4,5����ѹ��ջs��ÿ��ѹջʱ���ж�ջs�ĵ�ǰջ��Ԫ�ظ�����4,5,3,2,1�ĵ�һ��Ԫ���Ƿ���ȡ�
	   *   ��ѹ��4֮�󣬷���ջ��Ԫ�ظ�����4,5,3,2,1�ĵ�һ��Ԫ����ȡ�
   	   *   ����ջs��ջ��Ԫ��4��Ȼ������4,5,3,2,1�е�һ��Ԫ��ȥ��������4,5,3,2,1�������5,3,2,1����ִ���������̡�
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public static boolean isPopOrder(int[] pushA, int[] popA) {
		if(pushA.length <= 0 || popA.length <= 0) {
			return false;
		}
		int j = 0;
		Stack<Integer> temp = new Stack<Integer>();
		for(int i = 0 ; i < pushA.length ; i++) {
			temp.push(pushA[i]);
			if(pushA[i] == popA[j]) {
				if(j++ == popA.length - 1) {  //���ѹ������û��ֵ�ˣ��򷵻�true
					return true;
				}
				temp.pop();  
			}
		}
		
		while(!temp.isEmpty()) {
			if(temp.pop() != popA[j++]) {
				return false;
			}
		}
		return true;
	}
}
