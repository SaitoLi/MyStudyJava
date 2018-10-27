package com.lzz.tranning;
/**
 * ����һ��������������һ���ڵ㣬�ҳ������������һ���ڵ㲢�ҷ���
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
