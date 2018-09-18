package com.lzz.tranning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.lzz.tranning.HasSubtree.TreeNode;
/**
   *   �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * @Method printFromTopToBottom
 * @deprecated ʹ�ö��к�������ϵķ�ʽ�����
 * @author CunsiALIEN
 */
public class PrintBTreeTopToBottom {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		//�����������ÿ��Ľ��
		//�ȰѸ��ڵ���ӣ��ٰѸýڵ���ӣ�����ýڵ��������ӽڵ㣬�����ΰ����ҽڵ����
		//�ظ�ִ����һ��
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //�����������������������
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) {
        	return list;   //�����Ϊ�գ����ؿ�����
        }
        queue.offer(root); //�����ڵ����
        while(!queue.isEmpty()) {
        	TreeNode node = queue.poll();
        	list.add(node.val);
        	/*
        	 * ���ó��ӽڵ�����ҽڵ����
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
