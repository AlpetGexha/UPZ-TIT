package Java_6;

import java.util.Scanner;

public class CiftTek {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String res = (n % 2 == 0) ? "Çift" : "Tek";

        System.out.println(String.format("Numri %d eshte %s", n, res));
    }

}
