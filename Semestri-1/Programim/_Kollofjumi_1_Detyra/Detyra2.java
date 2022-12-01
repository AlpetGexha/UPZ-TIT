package Kollofjumi1;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Shkruaj nje numer peseshifror: ");
            int numri = s.nextInt();
            int acc = 0;
            if (!(numri < 10000 || numri > 99999)) {
                acc += numri % 10;
                numri /= 10;

                acc += numri % 10;
                numri /= 10;

                acc += numri % 10;
                numri /= 10;

                acc += numri % 10;
                numri /= 10;

                acc += numri % 10;
                numri /= 10;

                if (acc % 5 == 0) System.out.println("Numri eshte i pjestueshem me 5");
                else System.out.println("Numri nuk eshte i pjestueshem me 5");

                System.out.println("Mir je deri dikun");
            } else {

                System.out.println("Numri duhet te jete peseshifror!");
            }

        }
    }
}
