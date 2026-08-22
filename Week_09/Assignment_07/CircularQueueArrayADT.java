public class CircularQueueArrayADT<T> {
    T[] queueArray;
    int maxsize;
    int front;
    int rear;

    @SuppressWarnings("unchecked")
    public CircularQueueArrayADT(int maxsize){
        queueArray = (T[]) new Object[maxsize];
        this.maxsize = maxsize;
        front = -1;
        rear = -1;
    }
    
    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return (rear + 1) % maxsize == front;
    }

    public void enQueue(T data){
        if(isFull()){
            System.out.println("Error!!! Queue Over Flow.");
        }
        else{
            if(isEmpty()){
                front = 0;
            }
            rear = (rear + 1) % maxsize;
            queueArray[rear] = data;
        }
    }

    public T deQueue(){
        if(isEmpty()){
            System.out.println("Error!!! Queue Under Flow.");
            return null;
        }
        else{
            T data = queueArray[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front = (front + 1) % maxsize;
            }
            return data;
        }
    }

    public T peek(){
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
            int i = front;
            while(true){
                System.out.print(queueArray[i] + " ");
                if(i == rear){
                    break;
                }
                i = (i + 1) % maxsize;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueueArrayADT<Integer> queue = new CircularQueueArrayADT<>(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.display();
        
        queue.enQueue(60); // overflow
        
        queue.deQueue();
        queue.deQueue();
        queue.display();

        queue.enQueue(60);
        queue.enQueue(70);
        queue.display();

    }
}
