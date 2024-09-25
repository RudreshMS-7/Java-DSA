package in.LinkedList.Java;

public class SinglyLinkedList {
	
	private static Listnode head ;
	
	public static class Listnode {
		private int data;
		Listnode next;
		
		
		public Listnode(int data) {
			this.data = data;
			this.next = null;
		}	
	}
	
	public void display(Listnode head) {
		Listnode current = head;
		
		while(current != null) {
			System.out.print(current.data+ "-->");
			current = current.next;
		}
		System.out.println("null");
		
	}
	// Length if the SinglyLinkedlist 
	public int length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		Listnode current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	
	// Insert the Node at the Beginning of the SinglyLinkedList 
	public void insertFirst(int value) {
		Listnode newNode = new Listnode(value);
		newNode.next = head;
		head = newNode;
	}
	// Insert node at any position in the singlylinked List
	public void insert(int position, int value) {
		Listnode node = new Listnode(value);
		
		if(position == 1) {
			node.next = head;
			head = node;
		} else {
			Listnode previous = head;
			int count = 1;
			while(count < position-1) {
				previous = previous.next;
				count++;
				
			}
			Listnode current = previous.next;
			previous.next = node;
			node.next = current;
		}
	}
	
	
	//Insert the node at the Last of thbe SinglyLinkedList
	public void insertLast(int value) {
		Listnode newNode = new Listnode(value);
		if(head == null) {
			head = newNode;
			return ;
		}
		 Listnode current = head;
		 while(null != current.next) {
			 current = current.next;
		 }
		 current.next = newNode;
		
	}
	// Delete the FirstNode from the SinglyLinkedList
	public Listnode deleteFirst() {
		if(head == null) {
			return null;
		}
		Listnode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	//Delete node at any position in the SinglyLinked List
		public void  delete(int position) {
			if(position == 1) {
				head = head.next;
			}else {
				Listnode previous = head;
				int count =1;
				while(count< position-1) {
					previous = previous.next;
					count++;
				}
				Listnode current = previous.next;
				previous.next = current.next;
			}
			
		}
	
	
	//Delete Last Node from the singlyLinked
	public Listnode deleteLast() {
		if(head == null || head.next == null) {
			return head;
		}
		
		Listnode current = head;
		Listnode previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
			
		}
		previous.next = null;
		return current;
	}
	//To search an element in a LinkedList in Java
	public boolean find(Listnode head, int searchkey) {
		if(head == null) {
			return false;
		}
		Listnode current = head;
		while(current != null) {
			if(current.data == searchkey ) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	//To Reverse a Linked List 
	public Listnode reverse(Listnode head) {
		if(head == null) {
			return head;
		}
		Listnode current = head;
		Listnode previous = null;
		Listnode next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	//getting nth node from the end of the Linked List
	public Listnode getNthNodefromEnd(int n) {
		if(head == null) {
			return null;
		}
		if(n <= 0) {
			throw new IllegalArgumentException("Invalid Value of n "+ n);
		}
		Listnode refPtr = head;
		Listnode mainPtr = head;
		int count =0;
		
		while(count < n) {
			if(refPtr == null) {
				throw new IllegalArgumentException(n +" is greater than the number of nodes");
			}
			refPtr = refPtr.next;
			count ++;
		}
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
		
	}
	
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new Listnode(10);
		Listnode second = new Listnode(1);
		Listnode third = new Listnode(8);
		Listnode fourth = new Listnode(11);
		Listnode fifth = new Listnode(13);		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
//		
////		sll.insertFirst(11);
////		sll.insertFirst(8);
////		sll.insertLast(1);
////		sll.insertLast(6);
////		sll.insertLast(5);
////		sll.insertLast(1);
//		
//		sll.insert(1, 1);
//		sll.insert(2, 10);
//		sll.insert(3, 3);
//		sll.insert(4, 4);
//		sll.insert(5, 6);
//		sll.insert(5 ,5);
//		sll.insert(2, 2);
//		sll.insert(1, 11);
//		
//	
//		
//		
//		sll.display();
//		System.out.println("Length is -> "+  sll.length() ); ;
//		
//		System.out.println(sll.deleteFirst().data);
//		sll.display();
//		
//		System.out.println(sll.deleteFirst().data);
//		sll.display();
//		
//		System.out.println(sll.deleteLast().data);
//		sll.display();
//		
//		System.out.println(sll.deleteLast().data);
		sll.display(head);
		
		//System.out.println(sll.getNthNodefromEnd(2));
		Listnode getNthnode = sll.getNthNodefromEnd(7);
		System.out.println(getNthnode.data);
		
//		Listnode reversedListhead = sll.reverse(head);
//		sll.display(reversedListhead);
//		sll.display(head);
//		
//		
//		if(sll.find(head, 12)) {
//			System.out.println("searchkey found");
//		}else {
//			System.out.println("Not found");
//		}
		
		
	}
	

}
 