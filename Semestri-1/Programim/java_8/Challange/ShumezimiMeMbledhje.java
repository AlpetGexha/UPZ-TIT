package java8;

import java.util.Scanner;

public class ShumezimiMeMbledhje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Shkruaj nje numer: ");
        int numri = s.nextInt();

        System.out.print("Shkruaj nje numer tjeter: ");
        int numri2 = s.nextInt();

        int acc = 0;

        for (int i = 0; i < numri2; i++) {
            acc += numri;
        }
        System.out.println(String.format("%d * %d = %d", numri, numri2, acc));
    }

}
