package com.lzz.tranning;

public class HasSubtree {

	class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;

		}

	}

	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null) {
			return false;
		}
		return isSubtree(root1, root2) || isSubtree(root1.left, root2) || isSubtree(root1.right, root2);
	}

	public boolean isSubtree(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val == root2.val) {
			return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
		} else {
			return false;
		}
	}
}
