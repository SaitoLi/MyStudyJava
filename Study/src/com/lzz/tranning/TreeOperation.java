package com.lzz.tranning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.lzz.vo.TreeNode;

public class TreeOperation {
	public static void main(String[] args) {

	}

	/**
	 * 判断二叉树是否为对称二叉树 如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
	 * 
	 * @param pRoot
	 * @return
	 */
	public boolean isSymmetrical(TreeNode pRoot) {
		if (pRoot == null) {
			return true;
		}
		return comRoot(pRoot.left, pRoot.right);
	}

	public boolean comRoot(TreeNode left, TreeNode right) {
		if (left == null) {
			return right == null;// 注意这里是比较right是否为空
		}
		if (right == null) {
			return false; // 执行到此步说明left != null
		}
		if (left.val != right.val) {
			return false;
		}
		// 根据对称的定义，只需要比较左子树的左子树是否与右子树的右子树相同
		// 以及左子树的右子树是否与右子树的左子树相同即可
		return comRoot(left.left, right.right) && comRoot(left.right, right.left);
	}

	/**
	 * 之字形打印二叉树 奇数层从左往右打印，偶数层从右往左打印
	 * 
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> printZigzag(TreeNode pRoot) {
		int layer = 1;
		// 存放奇数层节点
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		s1.push(pRoot);
		// 存放偶数层节点
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		// 结果存放在ArrayList中
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		// 开始存放数据
		// 奇数层从左往右打印，则s1.push()的顺序是先right再left
		// 偶数层从右往左打印，则s2.push()的顺序是先left再right
		while (!s1.empty() || !s2.empty()) {
			if (layer % 2 != 0) {
				// 奇数层
				ArrayList<Integer> list1 = new ArrayList<Integer>();
				while (!s1.empty()) {
					TreeNode root = s1.pop();
					if (root != null) {
						list1.add(root.val);
						s2.push(root.left);
						s2.push(root.right);
					}
				}
				if (!list1.isEmpty()) {
					list.add(list1);
					layer++;
				}
			} else {
				// 偶数层
				ArrayList<Integer> list2 = new ArrayList<Integer>();
				while (!s2.empty()) {
					TreeNode root = s2.pop();
					if (root != null) {
						list2.add(root.val);
						s1.push(root.right);
						s1.push(root.left);
					}
				}
				if (!list2.isEmpty()) {
					list.add(list2);
					layer++;
				}
			}
		}
		return list;
	}

	/**
	 * 从上到下，每一行从左往右，按行打印二叉树 
	 * 方法一：与之字形打印思想相同，分奇偶层按行打印，使用队列先进先出的思想完成从左往右输出
	 * 方法二：层序遍历基本方法，添加一个size来控制每一行数据的个数
	 */
	public ArrayList<ArrayList<Integer>> printByRow(TreeNode pRoot) {
		// 层序遍历一般做法
		// 添加一个size控制每一行的数据数量
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		if (pRoot == null) {
			return lists;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(pRoot);
		while (!queue.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int size = queue.size();
			for(int i = 1 ; i <= size; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if(node.left != null) {
					queue.offer(node.left);
				}
				if(node.right != null) {
					queue.offer(node.right);
				}
			}
			lists.add(list);
		}
		return lists;
	}
	
	/**
	 * 找到二叉搜索树中第k小的节点
	 * 由于二叉搜索树的中序遍历就是增序序列，所以直接中序遍历，添加一个标志为从1开始，第k个节点即为所求
	 */
	int indexKthNode = 0;  //添加的标志
	public TreeNode kthNode(TreeNode pRoot, int k) {
		if(pRoot != null) {
			TreeNode node = kthNode(pRoot.left , k);
			if(node != null) {
				return node;
			}
			indexKthNode++;
			if(indexKthNode == k) {
				return pRoot; 
			}
			node = kthNode(pRoot.right, k);
			if(node != null) {
				return node;
			}
		}
		return null;
	}
}
