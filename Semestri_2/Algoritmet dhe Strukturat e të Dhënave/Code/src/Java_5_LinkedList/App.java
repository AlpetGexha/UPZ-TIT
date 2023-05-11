package Java_5_LinkedList;

public class App {
    public static void main(String[] args) {
        System.out.println("------------------------------- List 1 -------------------------------");

        LinkedList l1 = new LinkedList();
        l1.addFirst(8);
        l1.addFirst(17);
        l1.addFirst(24);
        l1.addLast(1);
        l1.addFirst(18);
        l1.addLast(80);
        l1.display(); //18, 24, 17, 8, 1, 80
        System.out.println("get: " + l1.get(-1)); //null

        System.out.println("------------------------------- List 2 -------------------------------");

        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinkedList2 l = new LinkedList2();
        l.addFirst(4);
        l.add(1);
        l.add("Alpet");
        l.add(3.14);
        l.add('Z');
//        l.add(arr);
        l.add(1);
        l.add(1);
        l.add(1);
        l.add(1);
        l.addLast(10);
        l.addFirst(12);
        l.addAt(200, 3);
//        l.remove(1);

//        l.deleteIndexOf(2);
//        l.deleteIndexOf(1);
//        l.deleteIndexOf(2);

        l.display();
        l.reverse();
        l.display();
        l.getMiddle();
    }
}
