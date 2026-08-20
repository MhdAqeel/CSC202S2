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
		return rear == -1;
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
			
		}
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Error!!! Queue Under Over Flow.");
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
		
	}
}
