package com.lzz.tranning;

import java.util.ArrayList;

import com.lzz.tranning.HasSubtree.TreeNode;

/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 * 
 * @author CunsiALIEN
 *
 */
public final class FindTargetPath {
	/**
	 * 首先思考节点值的和为输入的整数，每条路径都一定是从根节点到叶子节点，在数据结构中从根节点到叶子节点的遍历称之为深度优先遍历DFS。
	 * 因此整个过程可以采用先序遍历方式的DFS，即根节点》左子树》右子树。随后考虑一次遍历完成后的处理，
	 * 当一次遍历完成后，如果输入整数值恰好等于节点值之和，则输出这条路径并且回退一个节点（以便寻找其他路径）；
	 * 如果不等于则直接回退一个节点，即回退到当前节点的父节点，如果该父节点有右孩子，则继续遍历，否则继续回退。
	 * 考虑回退到根节点，此时如果它有右孩子，则继续遍历，否则整个DFS结束。
	 */
	//创建存放所有路径的数组集合
	public ArrayList<ArrayList<Integer>> pathList = new ArrayList<>();
	//存放一条路径的集合
	public ArrayList<Integer> path = new ArrayList<>();

	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if (root == null) {  //如果树为空，返回空集合
			return pathList;
		}
		boolean isLeaf = root.left == null && root.right == null; //判断节点root是否为叶子节点leaf
		path.add(root.val); //将该节点加入集合（添加到路径中）
		if(isLeaf&&target==root.val) {
			pathList.add(new ArrayList<Integer>(path));
		}
		//递归查找所有满足 路径数值和==target 的路径
		if(root.val <= target && root.left != null) {
			FindPath(root.left,target-root.val);  
		}
		if(root.val <= target && root.right != null) {
			FindPath(root.right, target-root.val);
		}
		/**
		 * 不论路径的值是否等于输入整数值，都要回退，即使用remove函数移除路径上的最后一个节点。
		 */
		path.remove(path.size() - 1); //回退到父节点
		return pathList;
	}
}
