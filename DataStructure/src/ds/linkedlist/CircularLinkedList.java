package ds.linkedlist;

public class CircularLinkedList {
	
	int data;
	Node first;
	Node last;
	
	public CircularLinkedList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;

		if(isEmpty()) {
			last=newNode;
		}
		
		newNode.next=first;
		first=newNode;
	}
	
	public void insertLast(int data) {
		Node newNode=new Node();
		newNode.data=data;
		
		if(isEmpty()) {
			first=newNode;
		}else {
			last.next=newNode; //The new value of the last node will point to the new node
			last=newNode; // We make the new node we created be the last one in the list
		}
	}
	
	public int deleteFirst() {
		int temp=first.data;
		
		if (first.next==null) {
			last=null;
		}
		
		first=first.next;
		
		return temp;
	}
	
	public void displayList() {
		System.out.println("CircularLinkedList from first --> last");
		System.out.println(" { ");
		Node current=new Node();
		current=first;
		while(current !=null) {
			current.displayNode();
			current=current.next;
		}
		System.out.println(" } ");
	}
}
