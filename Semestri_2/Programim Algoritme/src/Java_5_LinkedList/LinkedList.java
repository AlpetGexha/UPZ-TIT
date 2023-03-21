package Java_5_LinkedList;

public class LinkedList {

    Node head, tail;
    int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public Object get(int index) {

        if (index < 0 || index >= size) {
            return null;
        }

        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        return tmp.data;
    }

    public void addFirst(Object element) {
        Node n = new Node(element);
        if (size == 0) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
        size++;
    }

    public void addLast(Object element) {
        Node n = new Node(element);
        if (size == 0) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public void display() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public class Node {
        Object data;
        Node next;

        public Node(Object data) {
            data = data;
            next = null;
        }
    }


}
