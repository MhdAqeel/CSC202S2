class Node {
	String data;
	Node next;
	
	public Node(String data){
		this.data = data;
		next=null;
	}
}
class QueueLinkListADT{
	Node front;
	Node rear;
	
	public QueueLinkListADT(){
		front=null;
		rear=null;
	}
	
	public boolean isEmpty(){
		return rear==null;
	}
	
	public void enQueue(String data){
		Node newnode = new Node(data);
		if(isEmpty()){
			front=newnode;
			rear = newnode;
		}
		else{
			rear.next=newnode;
			rear=newnode;
		}	
	}
	
	public void deQueue(){
		if(isEmpty()){
			System.out.println("Error!!! Queue Under Flow.");
		}
		else{
			front=front.next;
			if(front == null){
				rear=null;
			}
		}
	}
	
	public void peek(){
		if(isEmpty()){
			System.out.println("Error!!! Queue Under Flow.");
		}
		else{
			System.out.println(front.data);
		}
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Error!!! Queue Under Flow.");
		}
		else{
			Node current = front;
			while(current!=null){
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	
	//add search method
	
	public static void main (String [] args){
		QueueLinkListADT queue = new QueueLinkListADT();
		System.out.println(queue.isEmpty());
		queue.enQueue("a1");
		queue.enQueue("b1");
		queue.enQueue("c1");
		System.out.println("---------------");
		queue.display();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.display();
	}
}