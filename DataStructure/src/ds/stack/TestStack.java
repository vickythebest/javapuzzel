package ds.stack;

public class TestStack {

	public static void main(String[] args) {

		Stack stack=new Stack(3);
		stack.push(30);
		stack.push(20);
		stack.push(10);
		
//		System.out.println(stack.peek());
		
		while(!stack.isEmpty()) {
			System.out.println("Peek = "+stack.peek());
			System.out.println(stack.pop());	
		}
		
		
		
	}
	

}
