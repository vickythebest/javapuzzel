package ds.stack;

public class Stack {

	private int max;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.max=size;
		this.stackArray=new long[max];
		this.top=-1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			top++;
			stackArray[top]=data;	
		}
		
	}
	
	public long pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return -1;
		}else {
			int old_top=top;
			top--;
			return stackArray[old_top];	
		}
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (top==max-1);
	}
}
