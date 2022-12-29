package Java_5;

import java.util.Scanner;

public class NumriBukur {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        final int r = 10; // Pjesohet me 10
        int pjestuesi = 1000; // Per numrin 5 shifror

        System.out.print("Shkruaj nje numer me 4 shifra : ");
        int numri = s.nextInt();
        int temp = numri;

        if (numri < 1000 || numri > 9999) {
            System.out.println("\nNumri duhet te jete me 4 shifra!");
        }

        int shifra1 = numri / pjestuesi;
        numri %= pjestuesi;
        pjestuesi /= r;

        int shifra2 = numri / pjestuesi;
        numri %= pjestuesi;
        pjestuesi /= r;

        int shifra3 = numri / pjestuesi;
        numri %= pjestuesi;
        pjestuesi /= r;

        int shifra4 = numri / pjestuesi;
        numri %= pjestuesi;
        pjestuesi /= r;


        if( (shifra1 < shifra2) && (shifra2 < shifra3) && (shifra3 < shifra4))
            System.out.println(String.format("Numri %s është numër bukur", temp));
        else
            System.out.println(String.format("Numri %s nuk është bukur", numri));

    }
}
