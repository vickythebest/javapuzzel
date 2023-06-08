package ds.linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList node1=new LinkedList();
		node1.val=10;
		
		LinkedList node2=new LinkedList();
		node2.val=20;
		
		LinkedList node3=new LinkedList();
		node3.val=30;
		
		LinkedList node4=new LinkedList();
		node4.val=40;
		
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		
		System.out.println("node1 length = "+listLength(node1));
		System.out.println("node2 length = "+listLength(node2));
		System.out.println("node3 length = "+listLength(node3));
		System.out.println("node4 length = "+listLength(node4));
	}

	public static int listLength(LinkedList node) {
		int count=0;
		
		LinkedList currentNode=node;
		
		while(currentNode != null) {
			currentNode=currentNode.next;
			count++;
		}
		return count;
		
	}
}
