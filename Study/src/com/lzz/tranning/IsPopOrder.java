package com.lzz.tranning;

import java.util.Stack;
/**
 *    输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 *    假设压入栈的所有数字均不相等。
 *    例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 *    但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
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
	   *   建立一个辅助栈s,把序列1,2,3,4,5依次压入辅助栈s，并按照第二个序列4,5,3,2,1的顺序从辅助栈s中弹出数字。
　　 	   *   先将序列1,2,3,4,5依次压入栈s，每次压栈时都判断栈s的当前栈顶元素跟序列4,5,3,2,1的第一个元素是否相等。
	   *   当压入4之后，发现栈顶元素跟序列4,5,3,2,1的第一个元素相等。
   	   *   弹出栈s的栈顶元素4，然后将序列4,5,3,2,1中第一个元素去掉，序列4,5,3,2,1变成序列5,3,2,1。在执行上述过程。
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
				if(j++ == popA.length - 1) {  //如果压入序列没有值了，则返回true
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
