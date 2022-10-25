package Java4;

import java.util.Scanner;

public class Totali2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //INPUT
        System.out.print("Shkruaj numrin e gjysmave: ");
        int gjysma = s.nextInt();

        System.out.print("Shkruaj numrin e njezetave: ");
        int njezeta = s.nextInt();

        System.out.print("Shkruaj numrin e dhjetave: ");
        int dhjeta = s.nextInt();

        System.out.print("Shkruaj numrin e pesave: ");
        int pesa = s.nextInt();

        System.out.print("Shkruaj numrin e qindarkave: ");
        int qindarka = s.nextInt();

        //PROCESSION
        int totali = (gjysma * 50) + (njezeta * 20) + (dhjeta * 10) + (pesa * 5) + (qindarka * 1);
        int euro = totali / 100;
        int cent = totali % 100;

//        OUTPUT
        System.out.println("Velra totale: " + euro + " Euro " + cent + " Cent");

//        D.SH
//        Sekonda to ore,minuta,sekonda

    }
}
