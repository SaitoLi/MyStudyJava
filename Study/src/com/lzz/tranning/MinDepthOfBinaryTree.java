package com.lzz.tranning;

import java.util.LinkedList;
import java.util.Queue;

import com.lzz.vo.TreeNode;

public class MinDepthOfBinaryTree {
	
	/**
	 * �ݹ鷽����������ȱ���
	 * Ч�ʵ�
	 */
//	public int run(TreeNode root) {
//		if(null == root) {
//			return 0;
//		}
//		int leftDepth = run(root.left);
//		int rightDepth = run(root.right);
//		if(leftDepth == 0 || rightDepth == 0) {
//			return leftDepth + rightDepth + 1;
//		}
//		return (leftDepth < rightDepth) ? leftDepth + 1 : rightDepth + 1;
//    }
	
	/**
	 * �������������������ȱ���
	 * Ч�ʸ�
	 */
	public int run(TreeNode root) {
		if(null == root) {
			return 0;
		}
		Queue<TreeNode> qu = new LinkedList<>();
		int minDepth = 0;
		qu.add(root);
		while(!qu.isEmpty()) {
			int size = qu.size();
			minDepth++;
			for(int i = 0 ; i < size ; i++) {
				TreeNode node = qu.poll();
				if(node.left == null && node.right == null) {
					return minDepth;
				}
				if(node.left != null) qu.add(node.left);
				if(node.right != null) qu.add(node.right);
			}
		}
		return 0;
	}
	
}
