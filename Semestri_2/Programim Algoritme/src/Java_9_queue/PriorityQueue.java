package Java_9_queue;

public class PriorityQueue {

    private Node front;
    private Node rear;
    private int size;

    public PriorityQueue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueuePriority(int element) {
        Node n = new Node(element);
        if (this.isEmpty()) {
            this.front = this.rear = n;
        } else {
            if (element < this.front.data) {
                n.next = this.front;
                this.front = n;
            } else if (element > this.rear.data) {
                this.rear.next = n;
                this.rear = n;
            } else {
                Node tmp = this.front;
                while (tmp.next != null && tmp.next.data < element) {
                    tmp = tmp.next;
                }
                n.next = tmp.next;
                tmp.next = n;
            }
        }
        this.size++;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int element = this.front.data;
        if (this.front == this.rear) {
            this.front = this.rear = null;
        } else {
            this.front = this.front.next;
        }

        this.size--;
        return element;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        return this.front.data;
    }

    public class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
