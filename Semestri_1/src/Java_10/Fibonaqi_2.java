package Java_10;

import java.util.Scanner;

public class Fibonaqi_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0, b = 1;

        System.out.print("Deri ne cilen shifer duhet te ndalet numir: ");
        int n = s.nextInt();

        while (a <= n) {
            System.out.print(a);
            if(a < n - 1) System.out.print(", ");
            int c = a + b;
            a = b;
            b = c;
        }

    }
}
