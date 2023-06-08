package ds.doublelinkedlist;

public class DoubleLinkedList {
	int data;
	Node first;
	Node last;
	
	public DoubleLinkedList() {
		this.first=null;
		this.last=null;
	}
	
	
	public void insertFirst(int data) {
		Node newnode=new Node();
		newnode.data=data;
		
		if(isEmpty()) {
			last=newnode;
		}else {
			first.previous=newnode;
		}
		newnode.next=first;
		first=newnode;
//			newnode.next.previous=newnode;
		
	}

	public boolean insertAfter(int data, int key) {
		Node newnode=new Node();
		newnode.data=data;
		
		Node current=first;
		while(current.data!=key) {
			current=current.next;
			if(current==null) {
				return false;
			}
		}
		
		if(current.next==null) {
			current.next=newnode;
			last=newnode;
		}else {
			newnode.next=current.next;
			newnode.next.previous=newnode;
		}
		current.next=newnode;
		newnode.previous=current;
		
		
		return false;
	}

	public void displayNodeBackward() {
		System.out.println("result");
		Node current=last;
		while(current!=null) {
			current.displayNode();
			current=current.previous;
		}
	}
	
	public void displayNode() {
		System.out.println("result");
		Node current=new Node();
		current=first;
		while(current!=null) {
			current.displayNode();
			current=current.next;
		}
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
}
