package ds.queue;

public class Queue {

	int front;
	int rear;
	long[] queueArray;
	int qElements;
	int maxSize;
	
	public Queue(int size) {
		this.maxSize=size;
		this.front=0;
		this.rear=-1;
		this.qElements=0;
		this.queueArray=new long[maxSize];
	}
	
	public void Insert(int data) {
		if(isFull()) {
			System.out.println("Queue is full");
			rear=-1;
		}
			qElements++;
			rear++;
			queueArray[rear]=data;
	}
	
	public void view() {
		System.out.print("[ ");
		while(!isEmpty()) {
			System.out.print( queueArray[front] );
			front++;
		}
			System.out.print(" ]");
	}
	
	public long peekFront() {
		return queueArray[front];
	}
	
	public void remove() {
		
	}
	
	public boolean isEmpty() {
		return (front==maxSize);
	}
	
	public boolean isFull() {
		return (rear==maxSize-1);
	}
}
