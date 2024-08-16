public class QueueUsingLinkedList {
    private Node front;
    private Node rear;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    // Add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Remove and return the front element of the queue
    public int dequeue() throws Exception {
        if (front == null) {
            throw new Exception("Queue is empty");
        }

        int data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return data;
    }

    public static void main(String[] args) throws Exception {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.enqueue(40);

        System.out.println("Dequeued: " + queue.dequeue());
    }
}