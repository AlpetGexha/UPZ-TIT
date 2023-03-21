package Java_5_LinkedList;

public class App {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();

//        list.addFirst(8);
//        list.addFirst(17);
//        list.addFirst(21);
//        list.addFirst(24);
//        list.addLast(1);
//        list.addFirst(18);
//        list.display();
//        System.out.println("get: " + list.get(3));

        LinkedList2 l = new LinkedList2();

        l.addFirst(4);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.addLast(10);
        l.addFirst(12);
        l.addAt(200, 3);
        l.remove(1);

//        l.deleteIndexOf(2);
//        l.deleteIndexOf(1);
//        l.deleteIndexOf(2);


        l.display();

        l.reverse();
        l.display();

        l.getMiddle();
    }
}
