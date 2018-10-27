package com.lzz.tranning;
/**
 * 给定一个二叉树和其中一个节点，找出中序遍历的下一个节点并且返回
 */
import com.lzz.vo.TreeLinkNode;

public class GetNextTreeLinkNode {
	public static void main(String[] args) {
		
	}
	
	public static TreeLinkNode getNext(TreeLinkNode pNode) {
		if(pNode == null) {
			return null;
		}
		if(pNode.right != null) {
			pNode = pNode.right;
			while(pNode.left != null) {
				pNode = pNode.left;
			}
			return pNode;
		}
		else {
			while(pNode.next != null) {
				TreeLinkNode pRoot = pNode.next;
				if(pRoot.left == pNode) {
					return pRoot;
				}
				else {
					pNode = pNode.next;
				}
			}
		}
		return null;
	}
}
