package java7;

import java.util.Scanner;

public class Trekendeshi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep vleren a: ");
        int a = s.nextInt();

        System.out.print("Jep vleren b: ");
        int b = s.nextInt();

        System.out.print("Jep vleren c: ");
        int c = s.nextInt();

        boolean isRight = (c * c) == (a * a) + (b * b);
        boolean isIsosceles = (a == b) || (b == c) || (a == c);
        boolean isEquilateral = (a == b) && (b == c);

        if (isEquilateral) {
            System.out.println("Trekendeshi eshte i barabarte");
        }

        else if (isIsosceles) {
            System.out.println("Trekendeshi eshte i barabarte");
        }

        else if (isRight) {
            System.out.println("Trekendeshi eshte i drejte");
        }

    }

}
