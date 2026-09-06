// Array based StackADT
class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }
}

// Arraybased Circular QueueADT
class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = val;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = queue[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int current = front;
        for (int i = 0; i < size; i++) {
            System.out.print(queue[current] + " ");
            current = (current + 1) % capacity;
        }
        System.out.println();
    }
}

// Reversal Program
public class ReverseFirstKElements {

    public static void reverseFirstK(ArrayQueue queue, int k) {
        if (queue.isEmpty() || k <= 0 || k > queue.getSize()) {
            System.out.println("Invalid value of k.");
            return;
        }

        ArrayStack stack = new ArrayStack(k);

        // To do : Step 1: Dequeue first k elements and push them onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }

        // To do : Step 2: Pop all elements from stack and enqueue them back to queue
        while (!stack.isEmpty()) {
            queue.enqueue(stack.pop());
        }

        // To do : Step 3: Move the remaining (size - k) elements to the back of the queue
        int remainingElements = queue.getSize() - k;
        for (int i = 0; i < remainingElements; i++) {
            queue.enqueue(queue.dequeue());
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        System.out.print("Original Queue: ");
        queue.display();

        int k = 4;
        reverseFirstK(queue, k);

        System.out.print("Queue after reversing first " + k + " elements: ");
        queue.display();
    }
}