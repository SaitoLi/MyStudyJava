package com.lzz.tranning;

import java.util.Arrays;
/**
   *   输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
   *   假设输入的数组的任意两个数字都互不相同。
 * @author CunsiALIEN
 *
 */
public class IsBST {
	public boolean VerifySquenceOfBST(int[] sequence) {
		/**
		   *   对于一个二叉树的后序遍历序列来说，
		   *   最后一个数一定是根节点，然后前面的数中，从最开始到第一个大于根节点的数都是左子树中的数，
		   *   而后面到倒数第二个数应该都是大于根节点的，是右子树，
		   *   如果后面的数中有小于根节点的，那么说明这个序列不是二叉搜索树的后序遍历序列
		 */
		if (sequence == null || sequence.length <= 0) {
			return false;
		}
		int i= 0;
		int len = sequence.length;
		int root = sequence[len - 1];
		for(i = 0 ; i < len ; i++) {  //寻找左右子树的分界处
			if(root <= sequence[i]) {
				break;
			}
		}
		int j = i;
		for(j = i ; j < len - 1 ; j++) {
			if(root > sequence[j]) {  //如果在右子树中有值小于根节点值的节点存在，则不是后序遍历序列
				return false;
			}
		}
		boolean leftFlag = true;
		if(i > 0) {
			//递归验证
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
