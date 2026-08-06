class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedListADT{
    Node head;
    Node tail;

    public DoublyLinkedListADT(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insertFront(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverseAndDisplay() {
    if (isEmpty()) {
        System.out.println("List Reversed:");
        display();
        return;
    }

    Node current = head;
    while (current != null) {
        Node temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev; 
    }

    // swap head and tail
    Node oldHead = head;
    head = tail;
    tail = oldHead;

    System.out.println("List Reversed:");
    display();
    }

    public void deleteKey(int key) {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;

        while (current != null) {
            if (current.data == key) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null; 
                    }
                } 
                else if (current == tail) {
                    tail = current.prev;
                    tail.next = null;
                } 
                else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                
                System.out.println("Deleted key: " + key);
                return; 
            }
            current = current.next;
        }
        System.out.println("Key '" + key + "' not found in the list.");
    }
}

public class Assignment_05{
    public static void main(String[] args) {
        DoublyLinkedListADT doublyLinkedList = new DoublyLinkedListADT();
        doublyLinkedList.insertFront(10);
        doublyLinkedList.insertFront(20);
        doublyLinkedList.insertFront(30);
        System.out.println("Original List:");
        doublyLinkedList.display();

        // Reverse and display the list
        doublyLinkedList.reverseAndDisplay();

        // Delete a key
        doublyLinkedList.deleteKey(20);
        System.out.println("After deleting key 20:");
        doublyLinkedList.display();

        doublyLinkedList.deleteKey(100);
    }
}

