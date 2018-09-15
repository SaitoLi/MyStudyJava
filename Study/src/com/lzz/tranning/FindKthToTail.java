package com.lzz.tranning;

public class FindKthToTail {

	class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode FindKthTotail(ListNode head, int k) {
		if(head == null) {
			return null;
		}
		int count = 1;
		ListNode node = head;
		while(node.next != null) {
			count++;
			node = node.next;
		}
		if(k <= count) {
			for(int i = 0; i < count - k; i++) {
				node = node.next;
			}
			return node;
		}else {
			return null;
		}
	}
	
}
