package java7Loop;

import java.util.Scanner;

public class NumirMaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Shkruaj nje numer: ");
            int n = s.nextInt();

            int max = 0;
            int min = 9;

            while (n > 0) {
                int digit = n % 10;

                if (digit > max) max = digit;

                if (digit < min) min = digit;

                n = n / 10;
            }

            System.out.println(String.format("Shifra me e madhe eshte: %d\n"
                    + "Shifra me e vogel eshte: %d", max, min));
        }
    }

}
