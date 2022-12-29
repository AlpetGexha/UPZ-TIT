package Java_7;

import java.util.Scanner;

public class AfishoNumrat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Shkruaj numrin: ");
            int n = s.nextInt();

            int sum = 0;

            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }

            System.out.println(String.format("Shuma e shifrave eshte: %d\n", sum));
        }
    }
}
