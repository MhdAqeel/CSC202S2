class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class QueueListADT<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueListADT() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return null;
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class InterleaveQueue {

    public static <T> void interleave(QueueListADT<T> q) {
        if (q.isEmpty() || q.getSize() % 2 != 0) {
            System.out.println("Queue length must be an even number.");
            return;
        }

        QueueListADT<T> firstHalf = new QueueListADT<>();
        int halfSize = q.getSize() / 2;

        for (int i = 0; i < halfSize; i++) {
            firstHalf.enqueue(q.dequeue());
        }
        while (!firstHalf.isEmpty()) {
            q.enqueue(firstHalf.dequeue());
            q.enqueue(q.dequeue());
        }
    }

    public static void main(String[] args) {
        QueueListADT<Integer> queue = new QueueListADT<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.print("Original Queue: ");
        queue.display();

        interleave(queue);

        System.out.print("Interleaved Queue: ");
        queue.display(); // 1 4 2 5 3 6
    }
}