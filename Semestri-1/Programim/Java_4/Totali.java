package Java4;

import java.util.Scanner;

public class Totali {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //INPUT
        int gjysma = 4;
        int njezeta = 2;
        int dhjeta = 0;
        int pesa = 1;
        int qindarka = 6;

        //PROCESSION
        float totali = (gjysma * 50) + (njezeta * 20) + (dhjeta * 10) + (pesa * 5) + (qindarka * 1);
        float euro = totali / 100;


//       OUTPUT
        System.out.println("Vlera totale e pareve te imta: " + (int) totali + " cent \n" + "ose  " + euro + " Euro");

    }
}
