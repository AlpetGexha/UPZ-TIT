package java7Loop;

import java.util.Scanner;

public class ShifraNeRritje {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Shkruaj numrin: ");
            int n = s.nextInt();
            int tmp = n;

            int shifra = n % 10;
            n /= 10;

            while (n > 0) {
                if (n % 10 > shifra) {
                    System.out.println("Numri nuk eshte ne rritje\n");
                    break;
                }

                shifra = n % 10;
                n /= 10;
            }
            System.out.println(String.format("Numri %d eshte ne rritje\n", tmp));
        }
    }
}
