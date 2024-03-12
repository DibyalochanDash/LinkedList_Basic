package LinkedList;


public class NewLinkedList {
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public static class LinkedList{
		Node head = null;
		Node tail = null;
		int size = 0;
		void InsertAtrEnd(int val) {  // Insert Value At Tail
			Node temp = new Node(val);
			if (head == null) {
				head = temp;
			} else {
             tail.next = temp;
			}
			tail = temp;
			size++;
		}
		void Display() {              // Display Data
			Node temp = head;
			while (temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp .next;
			}
		}
		 int size() {                  //  Size Of Linked List
			Node temp = head;
			int count = 0;
			while (temp!=null) {
				count++;
				temp = temp .next;
			}
			return count;
		}
		void insertAthead(int val) {   // Insert value At Head
			Node temp = new Node(val);
			if (head == null) {
				head = tail = temp;
			} else {
                temp.next = head;
                head = temp;
                size++;
			}
		}
		   void InsertIndexValue(int index,int val) {   //Insert a Node At Any Given Index
			   Node t = new Node(val);
			   Node temp = head;
			   if (index == size()) {
				   InsertAtrEnd(val);
				   return;
				
			} else if(index==0) {
				insertAthead(val);
				return ;
			} else if(index < 0 ||index > size()) {
				System.out.println("Wrong Index.");
				return;
			}
			   for (int i = 1; i <= index-1; i++) {
				temp = temp.next;
			}
			   t.next = temp.next;
			   temp.next = t;
			}
		   int getAt(int index) {                // Get Value by Index
			   if(index < 0 ||index > size()) {
					System.out.println("Wrong Index.");
					return -1;
				}
			   Node temp =  head;
			   
			   for (int i = 1; i <= index; i++) {
				temp = temp.next;
			}
			   return temp.data;
		   }
		    void DeleteIndex(int index) {
			   if (index==0) {
				head = head.next;
				size++;
				return;
			}
			   Node temp = head;
			   for(int i = 1;i<= index-1;i++) {
				   temp = temp.next;
			   }
			   temp.next = temp.next.next;
			   size--;
			  tail = temp;
			  
		   }	 
		   }                   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList ll = new LinkedList();
      ll.InsertAtrEnd(7);
      ll.InsertAtrEnd(9);
      ll.InsertAtrEnd(5);
      ll.InsertAtrEnd(1);
      ll.InsertAtrEnd(3);
      ll.insertAthead(2);
      ll.Display();
      System.out.println();
      ll.insertAthead(4);
      ll.Display();
      System.out.println();
      ll.InsertIndexValue(3, 8);
      ll.Display();
      System.out.println();
      System.out.println(ll.size());
      System.out.println(ll.getAt(0));
      System.out.println();
      ll.DeleteIndex(7);
      ll.Display();
      System.out.println();
      System.out.println(ll.head.data);
      System.out.println();
      System.out.println(ll.tail.data);

	}

}
