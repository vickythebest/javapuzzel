package ds.doublelinkedlist;

public class App {

	public static void main(String[] args) {

		DoubleLinkedList dlist=new DoubleLinkedList();
		dlist.insertFirst(10);
		dlist.insertFirst(20);
		dlist.insertFirst(40);
		
		
		
//		dlist.insertAfter(30, 40);
		
		dlist.displayNode();
		dlist.displayNodeBackward();
	}

}
