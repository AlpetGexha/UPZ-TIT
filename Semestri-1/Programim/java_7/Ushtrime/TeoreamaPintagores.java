package java7;

import java.util.Scanner;

public class TeoreamaPintagores {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Jep vleren a: ");
        int a = s.nextInt();

        System.out.println("Jep vleren b: ");
        int b = s.nextInt();

        System.out.println("Jep vleren c: ");
        int c = s.nextInt();

        if (
                (c * c == a * a + b * b) ||
                (a * a == b * b + c * c) ||
                (b * b == a * a + c * c)
        )
            System.out.println("Teorema Pintagores eshte e vlefshme");
         else
            System.out.println("Teorema Pintagores nuk eshte e vlefshme");

    }
}
