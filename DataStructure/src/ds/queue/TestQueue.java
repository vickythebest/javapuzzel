package ds.queue;

public class TestQueue {

	public static void main(String[] args) {

		Queue queue=new Queue(3);

		queue.Insert(6);
		queue.Insert(5);
		queue.Insert(4);
		queue.Insert(3);
		queue.Insert(2);
		queue.Insert(3);
		
		System.out.println(queue.peekFront());
		
		queue.view();
		

	}
}
