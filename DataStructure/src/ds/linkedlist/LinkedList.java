package ds.linkedlist;

public class LinkedList {

	int val1;
	LinkedList next=null;
	public int val;
	
	LinkedList() {}
	LinkedList(int val) { this.val1 = val; }
	LinkedList(int val, LinkedList next) { this.val1 = val; this.next = next; }
	
//	used to insert at the begining of the list
	public void insertFirst(int data) {
		LinkedList newNode=new LinkedList();
		newNode.val1=data;
		newNode.next=next;
		next=newNode;
	}
	
	public boolean isEmpty() {
		return (next==null);
	}
	
	public void displayNode() {
		System.out.println("[ "+val1+" ]");
	}
	public void displayList() {
		System.out.println("List (first --> Last) ");
		
		LinkedList current=new LinkedList();
		current=next;
		
		while(current!=null) {
			current.displayNode();
			current=current.next;
		}
		System.out.println();
	}
	
	public void displayBackword() {
		System.out.println("List (Last --> First) ");
		LinkedList current=new LinkedList();
		current=next;
		
	}
	public LinkedList addTwoNumber(LinkedList l1,LinkedList l2) {
		LinkedList dummy=new LinkedList();
		LinkedList curr=dummy;
		curr.val1=0;
		
		System.out.println("Add Two Number");
		LinkedList la=l1;
		LinkedList lb=l2;
		
		while(la!=null || lb !=null) {
			int x=la.val1;
			int y = 0;
			if(lb!=null) {
				 y=lb.val1;	
			}
			
			int total=(x+y+curr.val1);
			if(total >=10) {
				curr.val1=1;
			}else {
				curr.val1=1;
			}
			curr.next=new LinkedList(total%10);
			curr=curr.next;
			if(la!=null) la=la.next;
			if(lb!=null) lb=lb.next;
			curr.next=new LinkedList(curr.val1,curr);

		}
		return dummy.next;
	}
}
