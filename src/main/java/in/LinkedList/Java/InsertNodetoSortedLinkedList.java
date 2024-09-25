package in.LinkedList.Java;

import in.LinkedList.Java.SinglyLinkedList.Listnode;

public class InsertNodetoSortedLinkedList {
	
private static ListNode head ;
	
	public static class ListNode {
		private int data;
		private ListNode next;
		
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}	
	}
		
	public void printList() {
		ListNode current = head;
		
		while(current != null) {
			System.out.print(current.data+ "-->");
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public ListNode insertInsortedList(int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			return newNode;
		}
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
			
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	

	public static void main(String[] args) {
		
		InsertNodetoSortedLinkedList insertNewNode = new InsertNodetoSortedLinkedList();
		insertNewNode.insertFirst(16);
		insertNewNode.insertFirst(14);
		insertNewNode.insertFirst(12);
		insertNewNode.insertFirst(10);
		insertNewNode.insertFirst(8);
		insertNewNode.insertFirst(6);
		
		
		
		insertNewNode.printList();
		
		insertNewNode.insertInsortedList(18);
		insertNewNode.insertInsortedList(20);
		insertNewNode.insertInsortedList(20);
	
		insertNewNode.printList();
		
	}

}
