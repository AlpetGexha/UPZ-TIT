package Java_5;

import java.util.Scanner;

public class Drejtekendeshi {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//      Input
        System.out.print("Jep vlerën w: ");
        int w = s.nextInt();

        System.out.print("Jep vlerën l: ");
        int l = s.nextInt();

//      Process
        int P = 2 * (w + l);
        int A = w * l;
        int d = (int) Math.sqrt(Math.pow(w, 2) + Math.pow(l, 2));

//      Output
        System.out.println(String.format("P = %s \nA = %s \nd = %s ", P, A, d));
    }
}
