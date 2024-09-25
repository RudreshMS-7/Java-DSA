package in.LinkedList.Java;


public class RemoveDuplicatesFromLinkedList {
	
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
	
	public void removeDuplicate() {
		if(head == null) {
			return;
		}
		
		ListNode current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
			
		}
	}
	
	

	public static void main(String[] args) {
		RemoveDuplicatesFromLinkedList removeDuplicates = new RemoveDuplicatesFromLinkedList();
		removeDuplicates.head = new ListNode(1);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(11);
		ListNode fourth = new ListNode(7);
		ListNode fifth = new  ListNode(7);
		 
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		removeDuplicates.printList();
		removeDuplicates.removeDuplicate();
		removeDuplicates.printList();
		
		
	}

}
