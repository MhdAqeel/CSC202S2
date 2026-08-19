class Node {
	String data;
	Node next;
	
	public Node(String data){
		this.data = data;
		this.next = null;
	}
}

class StackListADT {
    Node top;
	
	public StackListADT(){
		top = null;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public void push(String data){
		Node node = new Node(data);
		if(isEmpty()){
			top = node;
		}
		else{
			node.next=top;
			top=node;
		}
	}
	
	public String pop(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return null;
		}
		else{
			String data = top.data;
			top = top.next;
			return data;
		}
		
	}
	
	public String peek(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return null;
		}
		return top.data;
	}
	
	public void display() {
		Node current = top;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	
	public static void main(String [] args){
		StackListADT stack = new StackListADT();
		System.out.println(stack.isEmpty());
		stack.push("aa");
		stack.push("bb");
		stack.push("cc");
		stack.push("dd");
		stack.display();
		
		
		
	}
}
