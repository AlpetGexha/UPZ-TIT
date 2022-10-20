package Challange;

import java.util.Scanner;

public class ShifratNeRritje {
    /**
     * Metoda kontrollon nese numri eshte ne rritje
     *
     * @param n numri qe do te kontrollohet
     * @return boolean
     */
    public static boolean shifratNeRritje(int n) {

        int shifra = n % 10;
        n /= 10;

        while (n > 0) {
            if (n % 10 > shifra) {
                return false;
            }

            shifra = n % 10;
            n /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Shkruaj numrin: ");
            int numri = s.nextInt();

            System.out.println(String.format("Numri %d %s shifrat në rritje \n", numri, shifratNeRritje(numri) ? "ka" : "nuk ka"));
        }

    }
}
