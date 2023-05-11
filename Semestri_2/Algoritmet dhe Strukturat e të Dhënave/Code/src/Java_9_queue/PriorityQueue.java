package Java_9_queue;

public class PriorityQueue {
    private Node front; // nyja ne pjesen e perparme

    private Node rear; // nyja ne pjesen e prapme
    private int size;
    public PriorityQueue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(int element) { // shtimi ne fund (addLast)
        Node n = new Node(element);

        if (this.isEmpty())
            this.front = this.rear = n;

        else {
            this.rear.next = n;
            this.rear = n;
        }

        this.size++;
    }

    public void enqueuePriority(int element) {
        Node n = new Node(element);

        if (this.isEmpty())
            this.front = this.rear = n;

        else {
            //kontrollojme nese nyja e re ka vleren me te vogel se front-i
            if (element < this.front.data) {
                n.next = this.front;
                this.front = n;

            //perndryshe nyja e re do te shtohet diku pas front-it, varesisht nga vlera e saj dhe permbajtja aktuale e queue

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

    public int dequeue() { //remove first
        if (this.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int element = this.front.data;

        if (this.front == this.rear)
            this.front = this.rear = null;

        else
            this.front = this.front.next;

        this.size--;

        return element;
    }

    // Shiko elementin e pare te queue
    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        return this.front.data;
    }

    public void display() {
        Node tmp = this.front;

        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }

        System.out.println();
    }

    public class Node {
        private final int data; // final sepse nuk deshirojme te ndryshojme vleren e elementit
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

}
