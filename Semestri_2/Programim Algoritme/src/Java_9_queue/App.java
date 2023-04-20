package Java_9_queue;

public class App {
    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue();


        queue.enqueuePriority(7);
        queue.enqueuePriority(9);
        queue.enqueuePriority(1);
        queue.enqueuePriority(0);
        queue.enqueuePriority(8);

        System.out.println("Peek: " + queue.peek()); // 0
        System.out.println("Dequeue: " + queue.dequeue()); // 0
        System.out.println("Peek: " + queue.peek()); // 1

        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue()); // 1, 7, 8, 9
        }

        System.out.println("\nPeek " + queue.peek()); // -1
        System.out.println("isEmpty: " + queue.isEmpty()); // true

    }
}
