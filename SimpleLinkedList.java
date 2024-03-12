package LinkedList;



public class SimpleLinkedList {
	
	 static void InsertAtEnd(Node head,int val) {
		   Node temp = new Node(val);
		   Node t = head;
		   while (t.next != null) {
			t = t.next;
		}
		   t.next = temp;
	   }
	
	
	public static void displayrr(Node head) {
		if (head == null) {
			return;
		}
		displayrr(head.next);
		System.out.print(head.data+" "); // Reverse 
	}
	
	public static void displayr(Node head) {
		if (head == null) {
			return;
		}
	System.out.print(head.data+" "); // Recursion call
	displayr(head.next);
	}
	 static void Display(Node head) {        // Display Data
			
			while (head != null) {
				System.out.print(head.data+" ");
				head = head.next;
			}
	 }

	public static int countNode (Node head) {
		
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count; // Count
	} 
	
	public static class Node {
		int data; // value
		Node next; // address
		Node(int data){
			this.data = data;
		}
		
		
	}
	public static void main(String[] args) {
		
		Node a = new Node(5);
		Node b = new Node(3);
		Node c = new Node(9);
		Node d = new Node(7);
		Node e = new Node(6);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		
		
		
		Node temp = a;
		//for (int i = 1; i <= 5; i++) {
		while (temp != null) {
			
		
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		displayr(a);
		System.out.println();
		displayrr(a);
		System.out.println();
		System.out.println(countNode(a));
	
		InsertAtEnd(a, 12);
	      Display(a) ;
	      
	}

	

}
