class Node {
	int data;
	Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
}

class LinkedListADT{
	Node head;
	
	public LinkedListADT(){
		this.head = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void insertAtFront(int data){
		Node newNode = new Node(data);
		if(isEmpty()){
			head = newNode;
		}
		else{
			newNode.next = head;
			head = newNode;
		}
		
	}
	
	public void deleteAtFront(){
		if(isEmpty()){
			System.out.println("Linked list is empty");
		}
		else{
			//Node current = head.next;
			//head.next=null;
			//head = current;
			
			head = head.next;
		}
	}
	
	public void insertAtEnd(int data){
		Node newNode = new Node(data);
		if(isEmpty()){
			head = newNode;
		}
		else{
			Node current = head;
			while(current.next!=null){
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	public void deleteAtEnd(){
		if(isEmpty()){
			System.out.println("Linked list is empty");
		}
		else{
			/*Node current = head;
			Node previous = null;
			while(current.next!=null){
				previous = current;
				current = current.next;
			}
			previous.next=null;*/
			
			Node current = head;
			while(current.next.next != null){
				current = current.next;
			}
			current.next=null;
		}
	}
	
	public void insertAtPossition(int index , int data){
		if(index<1 || index> getSize()+1){
			System.out.println("Invalid index");
			return;
		}
		if(index==1){
			insertAtFront(data);
			return;
		}
		Node newNode = new Node(data);
		Node current = head;
		for(int c =1; c<index-1; c++){
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
	}
	
	public void deleteAtPossition(int index){
		if(index<1 || index> getSize()){
			System.out.println("Invalid index");
			return;
		}
		if(index==1){
			deleteAtFront();
			return;
		}
		Node current = head;
		for(int i=1; i<index-1; i++){
			current = current.next;
		}
		current.next=current.next.next;
	}
	
	public int getSize(){
		if(isEmpty()){
			return 0;
		}
		else{
			int count = 1;
			Node current = head;
			while(current.next!=null){
				count++;
				current = current.next;
			}
			return count;
		}
	}
	
	public void travaersal(){
		if(isEmpty()){
			System.out.println("linkedList is empty");
		}
		else{
			Node current = head;
			while(current != null){
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println();
		}
		
	}
}

class SinglyLinkedList{
	public static void main(String [] args){
		LinkedListADT linkedList = new LinkedListADT();
		System.out.println("is the list empty? : " + linkedList.isEmpty());
		linkedList.travaersal(); // true
		System.out.println("size = " + linkedList.getSize());
		linkedList.insertAtFront(14);
		linkedList.insertAtFront(12);
		linkedList.insertAtFront(10);
		linkedList.insertAtFront(8);
		linkedList.travaersal(); // 8 10 12 14 
		System.out.println("size = " + linkedList.getSize());
		
		
		linkedList.insertAtEnd(16);
		linkedList.insertAtEnd(18);
		linkedList.insertAtEnd(19);
		linkedList.travaersal(); // 8 10 12 14 16 18 19
		System.out.println("size = " + linkedList.getSize());
		
		linkedList.insertAtPossition(4,13);
		linkedList.travaersal(); // 8 10 12 13 14 16 18 19
		
		linkedList.deleteAtFront();
		linkedList.travaersal();  //10 12 13 14 16 18 19
		
		linkedList.deleteAtEnd();
		linkedList.travaersal();//10 12 13 14 16 18

		linkedList.deleteAtPossition(2);
		linkedList.travaersal();
		
		linkedList.deleteAtPossition(4);
		linkedList.travaersal();
	}
}