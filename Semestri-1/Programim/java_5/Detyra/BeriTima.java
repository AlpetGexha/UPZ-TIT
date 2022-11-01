package java5;

import java.util.Scanner;

public class BeriTima {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Jep Eurot: ");
        double euro = s.nextDouble();
//      double euor = 78.90

        int peseEuro = (int) (euro / 5);
        int njeEuro = (int) ((euro % 5));

        int pesedhjetCent = (int) ((euro % 5) % 1 / 0.5);
        int dhjeteCent    = (int) (((euro % 5) % 1 % 0.5) / 0.1);
        int pesCent       = (int) ((((euro % 5) % 1 % 0.5) % 0.1) / 0.05);
        int njeCent       = (int) ((((((euro % 5) % 1 % 0.5) % 0.1) % 0.05) / 0.01) + 0.01);

        System.out.println(String.format("\n" +
                "Pese Euro:      %s    \n" +
                "Nje Euro:       %s    \n" +
                "Pesedhjet Cent: %s    \n" +
                "Dhjete Cent:    %s    \n" +
                "Pese Cent:      %s    \n" +
                "Nje Cent:       %s",
                peseEuro, njeEuro, pesedhjetCent, dhjeteCent, pesCent,njeCent));

        }
}
