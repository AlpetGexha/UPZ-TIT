package LikendListBuilderPattern;

public class App {
    public static void main(String[] args) {
        LinkedListBuilder list = new LinkedListBuilder();

            list.add(1)
                .add(2)
                .add(3)
                .add(4)
                .add(5)
                .addAt(6, 3)
                .addAt(7, 0)
                .addAt(8, 6)
                .addAt(9, 5);
//        System.out.println(list.display());
    list.display();
    }

}
