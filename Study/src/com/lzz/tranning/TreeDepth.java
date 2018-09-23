package com.lzz.tranning;

import com.lzz.tranning.HasSubtree.TreeNode;

/**
 * ������������
 * 
 * @author CunsiALIEN
 *
 */
public class TreeDepth {
	public static int TreeDepth(TreeNode root) {
		/**
		   *   ʹ�õݹ����
		   *   ��ǰ�ڵ�û������ʱ���Ϊ1
		 */
		if (root == null) {
			return 0;
		}
		int leftDepth = TreeDepth(root.left);
		int rightDepth = TreeDepth(root.right);
		return (leftDepth > rightDepth ? leftDepth : rightDepth) + 1;
	}
}
