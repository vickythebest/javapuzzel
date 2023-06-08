package ds.doublylinkedlist;

public class DoublyLinkedList {
	
	private Node first;
	private Node last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(int data) {
		
		Node newNode=new Node();
		newNode.data=data;
		
		if(isEmpty()) {
			last=newNode;
		}else {
			first.previous=newNode;	
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
			newNode.previous=last;
			last.next=newNode;
		}
		last=newNode; // The linkedlists last field should point to the new node
	}
	
	public Node deleteFirst() {
		Node current=first;
		
		if(first.next==null) {
			last=null;
		}else {
			first.next.previous=null;
		}
		first=first.next;
		
		return current;
	}
	
	public Node deleteLast() {
		Node temp=last;
		
		if(isEmpty()) {
			first=null;
		}else {
			last.previous.next=null;
		}
		last=last.previous;
		
		return temp;
	}
	
	public boolean insertAfter(int data, int pointer) {
		
		Node newNode=new Node();
		newNode.data=data;
		
		Node current=first;
		while(current.data!=pointer) {
			current=current.next;
			if(current==null) {
				return false;
			}
		}
			if(current.next==null) {
				newNode.previous=last;
				last=newNode;
			}else {
				current.next.previous=newNode;
				newNode.previous=current;
			}
		newNode.next=current.next;
		current.next=newNode;
		
//while(current!=null) {
//			
//			if(current.data==key) {
//				newnode.next=current.next;
//				current.next=newnode;
//				newnode.previous=current;
//			}
//			current=current.next;
//		}
		return true;
	}
	
	public boolean deleteKey(int key) {
		
		Node current=first;
		
		while(current.data!=key) {
			current=current.next;
			if(current==null) {
				return false;
			}
		}
		
		if(current == first) {
			first=first.next;
		}else {
			current.previous.next=current.next;
		}
		
		if (current==last) {
			last=last.previous;
		}else {
			current.next.previous=current.previous;
		}
			
//		if(current.next==null) {
//			current.previous.next=null;
//			current.previous=null;
//		}else {
//			if(current.previous==null) {
//				Node temp=first;
//				first=first.next;
//				first.next.previous=null;
//			}else {
//				current.previous.next=current.next;
//				current.next.previous=current.previous;
//			}
//		}
		
		return true;
	}
	
	public void displayList() {
		Node current = new Node();
			
		current=first;
		while(current!=null) {
			current.displayNode();
			current=current.next;
		}
	}
	
	public void displayListbackword() {
		Node current=last;
		System.out.println(" Display list backward");
		while(current!=null) {
			current.displayNode();
			current=current.previous;
		}
		
		System.out.println(" End ");
	}

}
