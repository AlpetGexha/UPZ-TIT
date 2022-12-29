package Java_10;

public class Fibonaqi {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 13;
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            if (i < n - 1) System.out.print(", ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

