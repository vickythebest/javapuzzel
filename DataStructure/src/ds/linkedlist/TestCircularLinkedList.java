package ds.linkedlist;

public class TestCircularLinkedList {

	public static void main(String[] args) {

		CircularLinkedList circular=new CircularLinkedList();
		circular.insertFirst(100);
		circular.insertFirst(200);
		circular.insertFirst(300);
		circular.insertLast(1000);
		
		circular.displayList();
		
//		System.out.println(circular.deleteFirst());
		System.out.println("after delete first node data "+circular.deleteFirst());
		circular.displayList();
		
	}

}
