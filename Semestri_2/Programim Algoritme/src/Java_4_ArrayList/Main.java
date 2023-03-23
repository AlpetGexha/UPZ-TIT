package Java_4_ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList2 arr = new ArrayList2();
        System.out.println("Fillimi");
        System.out.print("Size: ");
        arr.size();

        System.out.print("MAX Size: ");
        arr.maxSize();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);

        System.out.println("Shtimi: ");
        System.out.println("Size: " + arr.size);
        System.out.println("MAX Size: " + arr.maxSize);

        arr.remove(1);
        arr.remove(2);
        arr.remove(3);
        arr.remove(4);
        arr.remove(5);
        arr.remove(6);
        arr.remove(7);
        arr.remove(8);

        System.out.println("Remove: ");
        System.out.println("Size: " + arr.size);
        System.out.println("MAX Size: " + arr.maxSize);

        arr.add(42, 1);
        arr.display();

        System.out.println("Remove All:");
        arr.removeAll();
        System.out.println("Size: " + arr.size);
        System.out.println("MAX Size: " + arr.maxSize);

    }

}
