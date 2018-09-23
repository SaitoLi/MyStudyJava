package com.lzz.tranning;

import com.lzz.tranning.FindKthToTail.ListNode;

/**
 * Ѱ����������ĵ�һ�������ڵ�
 * 
 * @author CunsiALIEN
 *
 */
public class FindFirstCommonNode {
	/**
	 * �ȷֱ������������ĳ���sizeA��sizeB�� �Ƚ�β�ڵ��Ƿ���ͬ�������ͬ��˵�����ڹ����ڵ㣬�粻��ͬ��û�й����ڵ�
	 * ������ڹ����ڵ㣬�ó���������������|sizeA-sizeB|���ڵ㣬Ȼ����������ͬʱ��ʼ������֪���ҵ���һ�������ڵ�
	 */
	public static ListNode FindFirstCommonNode_Solution(ListNode pHead1, ListNode pHead2) {
		if (pHead1 == null || pHead2 == null) {
			return null;
		}
		ListNode nodeA = pHead1;
		ListNode nodeB = pHead2;
		int sizeA = 0;
		int sizeB = 0;

		while (nodeA.next != null) {
			nodeA = nodeA.next;
			sizeA++;
		}
		while (nodeB.next != null) {
			nodeB = nodeB.next;
			sizeB++;
		}
		if (nodeA != nodeB) {
			return null;
		}

		nodeA = pHead1;
		nodeB = pHead2;
		if (sizeA - sizeB >= 0) {
			int i = sizeA - sizeB;
			while (i > 0) {
				nodeA = nodeA.next;
				i--;
			}
		} else {
			int j = sizeB - sizeA;
			while (j > 0) {
				nodeB = nodeB.next;
				j--;
			}
		}
		while (nodeA != null) {
			if(nodeA == nodeB) {
				return nodeA;
			}
			nodeA = nodeA.next;
			nodeB = nodeB.next;
		}
		return null;
	}
}
