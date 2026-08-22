public class QueueGenariclistADT<T> {
    class Node<T>{
        T data;
        Node<T> next;
        public Node(T data){
            this.data = data;
            next=null;
        }
    }

    Node<T> front;
    Node<T> rear;

    public QueueGenariclistADT(){
        front=null;
        rear=null;
    }

    public boolean isEmpty(){
        return rear==null;
    }

    public void enQueue(T data){
        Node<T> newnode = new Node<>(data);
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
            Node<T> current = front;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main (String [] args){
        //Int Queue
        QueueGenariclistADT<Integer> queue = new QueueGenariclistADT<>();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.display();
        queue.deQueue();
        queue.peek();

        //String Queue
        QueueGenariclistADT<String> queue1 = new QueueGenariclistADT<>();
        queue1.enQueue("A");
        queue1.enQueue("B");
        queue1.enQueue("C");
        queue1.display();
        queue1.deQueue();
        queue1.peek();
    }


}
