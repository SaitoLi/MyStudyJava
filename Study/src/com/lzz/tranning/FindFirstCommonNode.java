package com.lzz.tranning;

import com.lzz.tranning.FindKthToTail.ListNode;

/**
 * 寻找两个链表的第一个公共节点
 * 
 * @author CunsiALIEN
 *
 */
public class FindFirstCommonNode {
	/**
	 * 先分别求出两个链表的长度sizeA、sizeB， 比较尾节点是否相同，如果相同则说明存在公共节点，如不相同则没有公共节点
	 * 如果存在公共节点，让长的链表先向后查找|sizeA-sizeB|个节点，然后两链表再同时开始遍历，知道找到第一个公共节点
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
