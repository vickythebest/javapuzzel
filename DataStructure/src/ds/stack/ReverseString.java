package ds.stack;

public class ReverseString {

	private int max;
	private char[] stackArray;
	private int top;
	
	public ReverseString(int size) {
		this.max=size;
		this.stackArray=new char[max];
		this.top=-1;
	}
	
	public void push(char data) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			top++;
			stackArray[top]=data;	
		}
		
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 'o';
		}else {
			int old_top=top;
			top--;
			return stackArray[old_top];	
		}
		
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (top==max-1);
	}
}
