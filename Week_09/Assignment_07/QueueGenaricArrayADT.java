public class QueueGenaricArrayADT {
    Object[] queueArray;
    int maxsize;
    int front;
    int rear;

    public QueueGenaricArrayADT(int maxsize){
        queueArray = new Object[maxsize];
        this.maxsize = maxsize;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty(){
        return front>rear;
    }

    public void enQueue(Object data){
        if(rear == maxsize-1){
            System.out.println("Error!!! Queue Over Flow.");
        }
        else{
            queueArray[++rear] = data;
        }
    }

    public Object deQueue(){
        if(isEmpty()){
            System.out.println("Error!!! Queue Under Flow.");
            return null;
        }
        else{
            Object data = queueArray[front];
            front++;
            if(front>rear){
                front=0;
                rear=-1;
            }
            return data;
        }
    }

    public Object peek(){
        if(isEmpty()){
            System.out.println("Error!!! Queue Under Flow.");
            return null;
        }
        else{
            return queueArray[front];
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Error!!! Queue Under Flow.");
        }
        else{
            for(int i=front; i<=rear; i++){
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueGenaricArrayADT queue = new QueueGenaricArrayADT(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue("A");
        queue.enQueue(40);
        queue.enQueue("B");

        queue.display();

        System.out.println("Peek: " + queue.peek());

        System.out.println("Dequeue: " + queue.deQueue());
        System.out.println("Dequeue: " + queue.deQueue());

        System.out.println("Peek after dequeue: " + queue.peek());
    }    
}
