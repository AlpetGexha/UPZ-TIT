package java5;

import java.util.Scanner;

public class PerimetriTrekendeshit {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//       Input
        System.out.println("Jep vleren a: ");
        int a = s.nextInt();

        System.out.println("Jep vleren b: ");
        int b = s.nextInt();

        System.out.println("Jep vleren c: ");
        int c = s.nextInt();

//        Process
        int P = a + b + c;

//        Output
        System.out.println(String.format("P = %s", P));
    }
}
