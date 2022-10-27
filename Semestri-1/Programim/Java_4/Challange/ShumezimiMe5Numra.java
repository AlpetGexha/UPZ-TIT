package Java4;

import java.util.Scanner;

public class ShumezimiMe5Numra {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Jep numrin me 5 shifra: ");
        int numri = s.nextInt();
//        int numri = 12345;
        int temp = numri;

        int shifra1 = numri / 10000;
        numri %= 10000;

        int shifra2 = numri / 1000;
        numri %= 1000;

        int shifra3 = numri / 100;
        numri %= 100;

        int shifra4 = numri / 10;
        numri %= 10;

        int shifra5 = numri;

        int shumezimi = shifra1 * shifra2 * shifra3 * shifra4 * shifra5;

        System.out.println("Shumezimi i shifrave te numrit " + numri + " eshte: " + shumezimi);
    }
}
