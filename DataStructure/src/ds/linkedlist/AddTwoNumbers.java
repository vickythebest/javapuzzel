package ds.linkedlist;

public class AddTwoNumbers {

	public static void main(String[] args) {

		LinkedList list1=new LinkedList();
		list1.insertFirst(2);
		list1.insertFirst(4);
		list1.insertFirst(9);
		
		LinkedList list2=new LinkedList();
		list2.insertFirst(5);
		list2.insertFirst(6);
		list2.insertFirst(4);
//		list2.insertFirst(9);
		
//		list1.displayList();
//		list2.displayList();
		
		LinkedList result = new LinkedList();
		
		result.addTwoNumber(list1, list2);
		
//		result.displayList();
	}

}
