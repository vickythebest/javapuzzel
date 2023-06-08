package ds.doublylinkedlist;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		
		DoublyLinkedList doubly=new DoublyLinkedList();
		doubly.insertFirst(1000);
		doubly.insertFirst(2000);
		doubly.insertLast(9000);
		
		doubly.displayList();
		doubly.displayListbackword();
		
//		doubly.deleteFirst();

		System.out.println("After deleteFirst");
		doubly.displayList();
		
		System.out.println("After deleteLast");
//		doubly.deleteLast();
		doubly.displayList();
		
		System.out.println("Insert 3000 after 1000");
		doubly.insertAfter(3000, 1000);
		doubly.displayList();
		
		int key=2000;
		System.out.println("Delete key "+key);
		
		doubly.deleteKey(key);
		doubly.displayList();
	}

}
