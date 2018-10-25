package com.lzz.vo;

public class ListNode {
	public int val;
	public ListNode next = null;
	
	public ListNode(int val){
		this.val = val;
	}
	
	public void addNode(int val) {
		ListNode node = new ListNode(val);
		if(this.next == null) {
			this.next = node;
		}
		else {
			this.next.addNode(val);
		}
	}
	
}
