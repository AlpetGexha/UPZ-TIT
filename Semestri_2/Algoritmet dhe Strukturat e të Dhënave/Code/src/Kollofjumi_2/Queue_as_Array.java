package Kollofjumi_2;

public class Queue_as_Array {

    int front, rear, size;
    int capacity = 8;
    int[] array;

    public Queue_as_Array() {
        front = size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    public boolean isFull() {
        return (size == capacity);
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int item) {
        if (isFull())
            return;

        rear = (rear + 1) % capacity;
        array[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    public int dequeue() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        int item = array[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }


}
