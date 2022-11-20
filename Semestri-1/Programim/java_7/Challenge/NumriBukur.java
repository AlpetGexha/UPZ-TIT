package java7Loop;

import java.util.Scanner;

public class NumriBukur {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Shkruaj nje numer: ");
            int n = s.nextInt();

            boolean isBeautiful = true;

            int lastDigit = n % 10;
            n /= 10;

            while (n > 0) {
                int digit = n % 10;

                if (digit >= lastDigit) {
                    isBeautiful = false;
                    break;
                }

                lastDigit = digit;
                n /= 10;
            }

            System.out.println(isBeautiful ? "Numri është i bukur" : "Numri nuk është bukur");
        }
    }
}
