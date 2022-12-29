package Java_4;

public class AfishimoNumrat {
    public static void main(String[] args) {
        int numri = 3;
        int gjatesia = 3;

        for (int i = 1; i <= numri; i++) {
            for (int j = 1; j <= gjatesia; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "\t\t");
            }
            System.out.println();
        }
    }
}
