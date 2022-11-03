package java5;

import java.util.Scanner;

public class NumriMadh {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Shkruaj nje numer : ");
        int n = s.nextInt();
        int temp = n;

        int max = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
            n = n / 10;
        }
        System.out.println(String.format("Shifra me e madhe e numrit %d eshte %d", temp, max));
    }
}
