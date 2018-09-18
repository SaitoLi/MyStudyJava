package com.lzz.tranning;

import com.lzz.tranning.HasSubtree.TreeNode;

public class Mirror {
	public void mirror(TreeNode root) {
		if(root!=null&&(root.left!=null||root.right!=null)) {
			TreeNode tem = root.left;
			root.left = root.right;
			root.right = tem;
			mirror(root.left);
			mirror(root.right);
		}
	}
}
