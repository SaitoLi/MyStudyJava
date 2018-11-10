package com.lzz.tranning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.lzz.vo.TreeNode;

public class TreeOperation {
	private TreeNode root;
	
	public TreeOperation() {
		
	}
	
	public TreeOperation(TreeNode root) {
		this.root = root;
	}
	
	
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	/**
	   *   Ѱ��ֵΪtarget�Ľڵ�
	 * @param target ��Ѱ�ҵ�Ŀ��ֵ
	 * @return Ŀ��ڵ�
	 */
	public TreeNode find(int target) {
		if(root == null) {
			return null;
		}
		TreeNode cur = root;
		while(cur.val != target) {
			if(cur.val < target) {
				cur = cur.left;
			}
			else {
				cur = cur.right;
			}
			if(cur == null) {
				return null;
			}
		}
		return cur;
	}
	/**
	   *   ����ڵ�
	 * @param val ������ڵ��valֵ
	 */
 	public void insert(int val) {
		TreeNode node = new TreeNode(val);
		if(root == null) { //�����Ϊ�գ���nodeΪ���ڵ�
			root = node;
		}
		else {
			TreeNode cur = root; 
			TreeNode par;
			while(true) {
				par = cur;  //��¼��ǰλ��
				if(val < cur.val) {  //valС�ڵ�ǰֵ������ڵ�Ƚ�
					cur = cur.left;
					if(cur == null) {
						par.left = node;
						return;
					}
				}
				else {
					cur = cur.right; //val���ڵ�ǰֵ�����ҽڵ�Ƚ�
					if(cur == null) { 
						par.right = node;
						return;
					}
				}
			}
		}
	}
	
	/**
	   *  Ѱ��ֵ��С�Ľڵ�
 	 * @return last
 	   *  �����������У������һ��Ҷ�ӽڵ㼴Ϊֵ��С�Ľڵ�
 	   *  ͬ�����ұߵ�Ҷ�ӽڵ㼴Ϊֵ���Ľڵ� 
	 */
	public TreeNode minNum() {
		TreeNode cur = root;  //��¼��ǰλ��
		TreeNode last = cur;  //��¼������Сֵ
		while(cur != null) {
			last = cur;
			cur = cur.left;
		}
		return last;
	}
	
	public void delete(int target) {
		
	}
	
	/**
	   *   �������
	 * @param pRoot �������������ĸ��ڵ�
 	 */
	public void inOrder(TreeNode pRoot) {
		 if(pRoot == null) {
			 return;
		 }
		 inOrder(pRoot.left);
		 System.out.print(pRoot.val + " ");
		 inOrder(pRoot.right);
	}
	
	/**
	   *   ǰ�����
	 * @param pRoot
	 */
	public void preOrder(TreeNode pRoot) {
		if(pRoot == null) {
			return;
		}
		System.out.print(pRoot.val + " ");
		preOrder(pRoot.left);
		preOrder(pRoot.right);
	}
	
	/**
	   *   �������
	 * @param pRoot
	 */
	public void postOrder(TreeNode pRoot) {
		if(pRoot == null) {
			return;
		}
		postOrder(pRoot.left);
		postOrder(pRoot.right);
		System.out.print(pRoot.val + " ");
	}
	
	/**
	 * �ж϶������Ƿ�Ϊ�Գƶ����� ���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
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
			return right == null;// ע�������ǱȽ�right�Ƿ�Ϊ��
		}
		if (right == null) {
			return false; // ִ�е��˲�˵��left != null
		}
		if (left.val != right.val) {
			return false;
		}
		// ���ݶԳƵĶ��壬ֻ��Ҫ�Ƚ����������������Ƿ�������������������ͬ
		// �Լ����������������Ƿ�������������������ͬ����
		return comRoot(left.left, right.right) && comRoot(left.right, right.left);
	}

	/**
	 * ֮���δ�ӡ������ ������������Ҵ�ӡ��ż������������ӡ
	 * 
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> printZigzag(TreeNode pRoot) {
		int layer = 1;
		// ���������ڵ�
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		s1.push(pRoot);
		// ���ż����ڵ�
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		// ��������ArrayList��
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		// ��ʼ�������
		// ������������Ҵ�ӡ����s1.push()��˳������right��left
		// ż������������ӡ����s2.push()��˳������left��right
		while (!s1.empty() || !s2.empty()) {
			if (layer % 2 != 0) {
				// ������
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
				// ż����
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
	 * ���ϵ��£�ÿһ�д������ң����д�ӡ������ 
	 * ����һ����֮���δ�ӡ˼����ͬ������ż�㰴�д�ӡ��ʹ�ö����Ƚ��ȳ���˼����ɴ����������
	 * ����������������������������һ��size������ÿһ�����ݵĸ���
	 */
	public ArrayList<ArrayList<Integer>> printByRow(TreeNode pRoot) {
		// �������һ������
		// ���һ��size����ÿһ�е���������
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
	 * �ҵ������������е�kС�Ľڵ�
	 * ���ڶ�����������������������������У�����ֱ��������������һ����־Ϊ��1��ʼ����k���ڵ㼴Ϊ����
	 */
	int indexKthNode = 0;  //��ӵı�־
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
