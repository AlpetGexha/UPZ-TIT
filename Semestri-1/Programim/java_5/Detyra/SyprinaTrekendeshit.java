package java5;

import java.util.Scanner;

public class SyprinaTrekendeshit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Input
        System.out.print("Jep vleren h: ");
        int h = s.nextInt();

        System.out.print("Jep vleren b: ");
        int b = s.nextInt();

//        Process
        double S = (h * b) / 2.0;

//        Output
        System.out.println(String.format("S = %s", S));
    }
}
