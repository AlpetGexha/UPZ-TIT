// Made on Class

package Java_5_LinkedList;

public class LinkedList {

    //lista e lidhur eshte nje grup i nyjeve te lidhura njera me tjetren, linkedlist eshte strukture dinamike

    //variablat e objekteve te klases LinkedList
    Node head, tail;
    private int size; //size eshte e dukshme vetem brenda kesaj klase
    //konstruktori
    public LinkedList() {
        //ne fillim lista e lidhur eshte e zbrazte
        head = tail = null;
        size = 0;
    }

    //shtimi ne fillim te listes
    public void addFirst(Object e) {
        //kompleksiteti: O(1) - konstant

        //krijimi i nje nyjeje te re
        Node n = new Node(e);
        //kontrollo nese lista eshte e zbrazte
        if (size == 0) {
            head = tail = n;
        }
        //perndryshe, shto elementin e ri ne fillim te listes
        else {
            n.next = head;
            head = n;
        }
        size++;
    }

    //metodat e objekteve te kesaj klase

    //shtimi ne fund te listes
    public void addLast(Object e) {
        //kompleksiteti: O(1) - konstant

        //krijimi i nje nyjeje te re
        Node n = new Node(e);
        //kontrollo nese lista eshte e zbrazte
        if (size == 0) {
            head = tail = n;
        }
        //perndryshe, shto elementin e ri ne fund te listes
        else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public Object get(int in) {
        //kompleksiteti: best case: O(1) - konstant
        //kompleksiteti: worst case: O(n) - linear

        //kontrollo nese indeksi in nuk eshte valid
        if (in < 0 || in >= size) return null;
        //perndryshe kthe nyjen ne poziten in
        Node tmp = head;
        for (int i = 0; i < in; i++)
            tmp = tmp.next;
        return tmp.data;
    }

    //leximi i elementeve ne listen
    public void display() {
        //kompleksiteti: O(n) - linear

        Node tmp = head;
        //perderisa ka nyje ne listen
        while (tmp != null) {
            System.out.print(tmp.data + " "); //printo vleren e nyjes aktuale
            tmp = tmp.next; //leviz ne nyjen e ardhshme
        }
        System.out.println();
    }

    //krijimi i struktures se nyjes
    public class Node {
        //variablat e objekteve te klases Node
        Object data; //e dhena qe permbahet ne nyjen
        Node next; //referenca (treguesi, pointeri) qe tregon ne nyjen e ardhshme

        //konstruktori per inicializimin e variablave te objekteve te kesaj klase
        public Node(Object d) {
            data = d;
            next = null;
        }
    }
}
