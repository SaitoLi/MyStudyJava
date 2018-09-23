package com.lzz.tranning;

import com.lzz.tranning.HasSubtree.TreeNode;

/**
 * 求二叉树的深度
 * 
 * @author CunsiALIEN
 *
 */
public class TreeDepth {
	public static int TreeDepth(TreeNode root) {
		/**
		   *   使用递归求解
		   *   当前节点没有子树时深度为1
		 */
		if (root == null) {
			return 0;
		}
		int leftDepth = TreeDepth(root.left);
		int rightDepth = TreeDepth(root.right);
		return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
	}
}
