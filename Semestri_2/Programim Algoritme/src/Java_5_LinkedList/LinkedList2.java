// Made in home
package Java_5_LinkedList;


/**
 * Presantimi i listes se lidhur (Single Linked List)
 */
public class LinkedList2 {
    private Node head; // referenca e pare e listes
    private Node tail; // referenca e fundit e listes
    private int size; // numri i elementeve te listes

    public LinkedList2() {
        // ne fillim lista e lidhur eshte e zbrazte
        head = tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    /**
     * Shtimi i nje elementi ne fillim te listes
     *
     * @param element - elementi qe do te shtohet
     */
    public void addFirst(Object element) {

        // Kompleksiteti: O(1) - konstant

        Node n = new Node(element); // krijimi i nje nyjeje te re

        // kontrollo nese lista eshte e zbrazte
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
        size++;
    }

    /**
     * Shtimi i nje elementi ne fund te listes
     *
     * @param element - elementi qe do te shtohet
     */
    public void addLast(Object element) {
        //kompleksiteti: O(1) - konstant

        Node n = new Node(element);

        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    /**
     * Shtimi i nje elementi
     */
    public void add(Object element) {
        addLast(element);
    }

    /**
     * Shtimi i nje elementi ne poziten e caktuar
     *
     * @param element - elementi qe do te shtohet
     * @param index   - pozita ku do te shtohet elementi
     */
    public void addAt(Object element, int index) {
        //kompleksiteti: best case: O(n) - linar
        Node n = new Node(element);

        checkIndex(index);

//        shtimi ne fillim nese nuk ka elemente
        if (index == 0) {
            addFirst(element);
        }
//        shtimi ne fund nese indexi eshte i barabarte me size
        else if (index == size) {
            addLast(element);
        } else {
            Node tmp = head;

//          Kerko deri tek pozita e caktuar
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }

            n.next = tmp.next;
            tmp.next = n;
            size++;
        }

    }

    /**
     * Leximi i elementit ne poziten e caktuar
     *
     * @param index - pozita ku do te lexohet elementi
     * @return elementi ne poziten e caktuar
     */

    public Object get(int index) {
        //kompleksiteti: best case: O(n) - linar
        checkIndex(index);

        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        return tmp.data;
    }

    /**
     * Ndryshimi i elementit ne poziten e caktuar
     *
     * @param element - elementi qe do te shtohet
     * @param index   - pozita ku do te ndryshohet elementi
     */

    public void set(Object element, int index) {
        //kompleksiteti: best case: O(n) - linar
        checkIndex(index);

        Node tmp = head;

        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        tmp.data = element;
    }

    private void checkIndex(int index) {
//       nuk mund te jete index me i vogel se 0 dhe me i madh se size

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void removeIndexOf(int index) {
        checkIndex(index);

//      nese lista nuk ka elemente
        if (index == 0) {
            head = head.next;
        }
//      nese indeksi eshte i fundit
        else if (index == size) {
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

    /**
     * Heqja e elemetin ne list
     *
     * @param element - vlera qe do te hiqet
     */
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

    /**
     * Heqja e te gjithe elementeve në liste
     *
     */
    public void removeAll() {
        head = tail = null;
        size = 0;
    }

    /**
     * Gjetja e elementit ne mesit te listes
     *
     * @return elementi ne mes te listes
     * */
    public void getMiddle() {
//        i marrim 2 referenca te hederit
//        Njeri i ben 1 hap dhe tjetri 2 hapa

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
