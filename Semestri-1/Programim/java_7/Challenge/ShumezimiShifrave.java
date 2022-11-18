package java7Loop;

import java.util.Scanner;

public class ShumezimiShifrave {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep numrin: ");
        int n = s.nextInt();

        int shumezimi = 1;

        while (n > 0) {
            shumezimi *= n % 10;
            n /= 10;
        }

        System.out.println(String.format("Shumezimi i shifrave eshte %d\n", shumezimi));

    }
}
