package Ushtrime;

import java.util.Scanner;

public class detyra_2_prizrenNumer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.print("Jep numrin");
            int n = s.nextInt();

            int acc = 0, acc1 = 1;

            while (n > 0) {
                int sh = n % 10;
                acc += sh;
                acc1 *= sh;
                n /= 10;
            }

            if (acc1 > (acc * 2)) {
                System.out.println("Prizren Number");
            } else {
                System.out.println("Kerka sje ");
            }
        }
    }
}
