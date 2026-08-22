class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T data){
		this.data = data;
		this.next = null;
	}
}

class StackGenaricListADT<T>{
    Node<T> top;

    public StackGenaricListADT(){
        top = null;
    }

    public boolean isEmpty(){
        return top ==null;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        if(isEmpty()){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }

    public T pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            T data = top.data;
            top = top.next;
            return data;
        }
    }

    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return top.data;
    }

    public void display() {
        Node<T> current = top;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String [] args){
        StackGenaricListADT<Integer> stack1 = new StackGenaricListADT<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.display();
        System.out.println("Popped: " + stack1.pop());
        System.out.println("Peek: " + stack1.peek());

        StackGenaricListADT<String> stack2 = new StackGenaricListADT<>();
        stack2.push("Hello");
        stack2.push("World");
        stack2.display();
        System.out.println("Popped: " + stack2.pop());
        System.out.println("Peek: " + stack2.peek());

    }
}
