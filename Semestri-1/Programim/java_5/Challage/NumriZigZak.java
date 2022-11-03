package java5;

import java.util.Scanner;

public class NumriZigZak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Shkruaj nje numer me 4 shifra : ");
        int numri = s.nextInt();
//        int numri = 5719;
        int temp = numri;

        if (numri < 1000 || numri > 9999) {
            System.out.println("\nNumri duhet te jete me 4 shifra!");
            return;
        }

        int shifra1 = numri / 1000;
        int shifra2 = (numri / 100) % 10;
        int shifra3 = (numri / 10) % 10;
        int shifra4 = numri % 10;

        if ((shifra1 < shifra2) && (shifra2 > shifra3) && (shifra3 < shifra4))
            System.out.println(String.format("Numri %s është zig zag", temp));

        else if ((shifra1 > shifra2) && (shifra2 < shifra3) && (shifra3 > shifra4))
            System.out.println(String.format("Numri %s është zig zag", temp));

        else
            System.out.println(String.format("Numri %s nuk është zig zag", temp));

    }
}
