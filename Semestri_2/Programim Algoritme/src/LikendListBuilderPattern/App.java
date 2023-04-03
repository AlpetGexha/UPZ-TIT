package LikendListBuilderPattern;

public class App {
    public static void main(String[] args) {
        LinkedListBuilder list = new LinkedListBuilder();
            list.add(1)
                .add(2)
                .add(3)
                .addLast(4)
                .addFirst(0)
                .add(4)
                .add(5)
                .addLast(2)
                .addAt(6, 3)
                .addAt(7, 0)
                .addAt(8, 6)
                .addAt(9, 5)
                .addAt(10, 4)
                .build();
//        System.out.println(list.display());
    list.display();
    }

}
