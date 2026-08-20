public class QueueArrayADT {
	String [] queueArray;
	int maxsize;
	int front;
	int rear;
	
	public QueueArrayADT(int maxsize){
		queueArray = new String[maxsize];
		this.maxsize = maxsize;
		front = 0;
		rear = -1;
	}
	
	public boolean isEmpty(){
		return front>rear;
	}
	
	public boolean isFull(){
		return rear == maxsize-1;
	}
	
	public void enQueue(String data){
		if(isFull()){
			System.out.println("Error!!! Queue Over Flow.");
		}
		else{
			queueArray[++rear] = data;
		}
	}
	
	public String deQueue(){
		if(isEmpty()){
			System.out.println("Error!!! Queue Under Flow.");
			return null;
		}
		else{
			String data = queueArray[front];
			//method 01
			front++;
			if(front>rear){
				front=0;
				rear=-1;
			}
			return data;
			/*
			//method 02
			for(int i=0; i<rear ; i++){
				queueArray[i] = queueArray[i+1];
			}
			queueArray[rear--] = ""
			return data;
			*/
		}
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Error!!! Queue Under Flow.");
		}
		else{
			for(int i=front; i<=rear; i++){
				System.out.println(queueArray[i]);
			}
		}
	}
	
	public static void main (String [] args){
		QueueArrayADT queue = new QueueArrayADT(5);
		System.out.println(queue.isEmpty());
		System.out.println(queue.isFull());
		queue.enQueue("a1");
		queue.enQueue("b2");
		queue.enQueue("c3");
		queue.display();
		System.out.println("--------------------");
		queue.deQueue();
		queue.deQueue();
		queue.display();
		System.out.println("--------------------");
		queue.deQueue();
		queue.display();
		System.out.println("--------------------");
		queue.enQueue("d1");
		queue.enQueue("e2");
		queue.enQueue("f3");
		queue.enQueue("a2");
		queue.enQueue("b3");
		queue.enQueue("c4");
		queue.display();
		System.out.println("--------------------");
	}
}
