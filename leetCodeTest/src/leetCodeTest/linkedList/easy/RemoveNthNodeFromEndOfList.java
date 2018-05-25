package leetCodeTest.linkedList.easy;

import leetCodeTest.ListNode;

/**
 * Given a linked list, remove the n-th node from the end of list and return its
 * head. Example: Given linked list: 1->2->3->4->5, and n = 2. After removing
 * the second node from the end, the linked list becomes 1->2->3->5.
 */

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
//		head.next.next = new ListNode(3);
//		head.next.next.next = new ListNode(4);
//		head.next.next.next.next = new ListNode(5);
		
		ListNode n = removeNthFromEnd(head,2);
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = head.next;
//		if(temp == null && n ==1){
//			return null;
//		}
		for(int i = 1; i < n ; i++){
			temp = temp.next;
		}
		if(temp == null){
			return head.next;
		}
		ListNode node = head;
		while(temp.next != null){
			temp = temp.next;
			node = node.next;
		}
		node.next = node.next.next;
		return head;
	}

	
}
