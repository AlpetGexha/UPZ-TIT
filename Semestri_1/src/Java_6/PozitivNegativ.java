package Java_6;

import java.util.Scanner;

public class PozitivNegativ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep Numrin: ");
        int n = s.nextInt();

       String res = (n < 0) ? "Negativ" : "Pozitiv";

         System.out.println(String.format("Numri %d eshte %s", n, res));
    }
}
