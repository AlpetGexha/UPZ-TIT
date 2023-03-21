package Java_5_LinkedList;

public class LinkedList2 {

    Node head, tail;
    private int size;

    public LinkedList2() {
        head = tail = null;
        size = 0;
    }

    public void addFirst(Object element) {
        Node n = new Node(element);

        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
        size++;
    }

    public void addLast(Object element) {
        Node n = new Node(element);

        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public void add(Object element) {
        addLast(element);
    }

    public void addAt(Object element, int index) {
        Node n = new Node(element);

        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        } else {
            Node tmp = head;

            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }

            n.next = tmp.next;
            tmp.next = n;
            size++;
        }

    }

    public Object get(int index) {

        if (index < 0 || index > size) {
            return null;
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        return tmp.data;
    }

    public void removeIndexOf(int index) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            head = head.next;
        } else if (index == size) {
            Node tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tail = tmp;
            tail.next = null;
        } else {
            Node tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
        }
        size--;
    }

    public void remove(Object element) {
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data.equals(element)) {
                removeIndexOf(i);
                return;
            }
            tmp = tmp.next;
        }
    }

    public void removeAll(Object element) {
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data.equals(element)) {
                removeIndexOf(i);
            }
            tmp = tmp.next;
        }
    }

    public void getMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle: " + slow.data);
    }


    public void reverse() {

        Node previus_node = null;
        Node next_node = null;
        Node current_node = head;

        while (current_node != null) {
            next_node = current_node.next;
            current_node.next = previus_node;
            previus_node = current_node;
            current_node = next_node;
        }

        head = previus_node;
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

        public Node(Object element) {
            data = element;
            next = null;
        }
    }

}
