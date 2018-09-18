package com.lzz.tranning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.lzz.tranning.HasSubtree.TreeNode;
/**
   *   从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @Method printFromTopToBottom
 * @deprecated 使用队列和数组组合的方式来求解
 * @author CunsiALIEN
 */
public class PrintBTreeTopToBottom {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		//队列用来存放每层的结果
		//先把根节点入队，再把该节点出队；如果该节点有左右子节点，则依次把左右节点入队
		//重复执行上一步
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //数组对象用来存放输出的序列
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) {
        	return list;   //如果树为空，返回空数组
        }
        queue.offer(root); //将根节点入队
        while(!queue.isEmpty()) {
        	TreeNode node = queue.poll();
        	list.add(node.val);
        	/*
        	 * 将该出队节点的左右节点入队
        	 */
        	if(node.left != null) {
        		queue.offer(node.left);
        	}
        	if(node.right != null) {
        		queue.offer(node.right);
        	}
        }
        return list;
    }
}
