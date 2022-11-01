package java5;

import java.util.Scanner;

public class Katrori {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//      Input
        System.out.print("Jep fleren a (cm): ");
        int a = s.nextInt();

//      Process
        int P = 4 * a;
        int A = a * a;

//        Output
        System.out.println(String.format("P = %s (cm) \nA = %s (cm)", P, A));
    }
}
