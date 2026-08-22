public class StackArrayADT{
	int[] stackArray;
	int top;
	int maxSize;
	
	public StackArrayADT(int maxSize){
		stackArray = new int [maxSize];
		this.maxSize = maxSize;
		top = -1;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}

	public boolean isFull(){
		return top == maxSize-1;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("ERROR : Stack Is Empty!");
		}
		else{
			for(int i=top ; i>=0 ; i--){
				System.out.print(stackArray[i] + " ");
			}
			System.out.println();
		}
	}
	
	public void push(int value){
		if(isFull()){
			System.out.println("ERROR : Stack Over Flaw!");
		}
		stackArray[++top] = value;
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("ERROR : Stack Is Empty");
		}
		return stackArray[top--];
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("ERROR : Stack Is Empty");
			return -1;
		}
		return stackArray[top];
	}
	
	public static void main (String [] args){
		StackArrayADT stack1 = new StackArrayADT(5);
		System.out.println(stack1.isEmpty());
		System.out.println(stack1.isFull());	
		
		//insert elements
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		
		//dispaly elements
		stack1.display();
		
		//peek an element
		System.out.println(stack1.peek());
		//pop and then peek
		System.out.println(stack1.pop());
		System.out.println(stack1.peek());
		
		
		
	}
}