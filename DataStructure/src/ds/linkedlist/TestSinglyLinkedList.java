package ds.linkedlist;

public class TestSinglyLinkedList {

	public static void main(String[] args) {

		SinglyLinkedList mylist=new SinglyLinkedList();
		mylist.insertFirst(3);
		mylist.insertFirst(4);
		mylist.insertFirst(2);
		mylist.insertLast(100);
		
//		mylist.deleteFirst();
		mylist.displayList();
		
	}
}
