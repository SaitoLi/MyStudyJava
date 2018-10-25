package com.lzz.tranning;

import com.lzz.vo.ListNode;

public class LinkedListOperation {
	public static void main(String[] args) {
		LinkedListOperation list = new LinkedListOperation();
		ListNode head = new ListNode(1);
		head.addNode(1);
		head.addNode(1);
		head.addNode(1);
		head.addNode(1);
		head.addNode(1);
//		head.addNode(1);
//		head.addNode(1);
//		head.addNode(1);
		list.printList(head);
		head = list.deleteDuplication(head);
		list.printList(head);
	}

	public ListNode entryNodeOfLoop(ListNode pHead){
        if(pHead == null) {
        	return null;
        }
        if(pHead.next == null) {
        	return null;
        }
        ListNode nodeA = pHead;
        ListNode nodeB = pHead;
        while(nodeB != null && nodeB.next != null) {
        	nodeA = nodeA.next;
        	nodeB = nodeB.next.next;
        	if(nodeA == nodeB) {
        		nodeB = pHead;
        		while(nodeA != nodeB) {
        			nodeA = nodeA.next;
        			nodeB = nodeB.next;
        		}
        		if(nodeA == nodeB) {
        			return nodeA;
        		}
        	}
        }
        return null;
    }

	public ListNode deleteDuplication(ListNode pHead) {
		if(pHead == null) {
			return null;
		}
		if(pHead.next == null) {
			return pHead;
		}
		ListNode curNode;
		if(pHead.next.val == pHead.val) {
			curNode = pHead.next.next;
			while(curNode != null && curNode.val == pHead.val) {
				curNode = curNode.next;
			}
			return deleteDuplication(curNode);
		}
		else {
			curNode = pHead.next;
			pHead.next = deleteDuplication(curNode);
			return pHead;
		}
	}
	
	public void printList(ListNode pHead) {
		if(pHead == null) {
			System.out.println("empty linkedlist");
			return;
		}
		while(pHead.next != null) {
			System.out.print(pHead.val + "->");
			pHead = pHead.next;
		}
		System.out.println(pHead.val);
	}
}
