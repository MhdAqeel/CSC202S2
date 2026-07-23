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
}

class SinglyLinkedList{
	public static void main(String [] args){
		LinkedListADT linkedList = new LinkedListADT();
		System.out.println(linkedList.isEmpty());
	}
}