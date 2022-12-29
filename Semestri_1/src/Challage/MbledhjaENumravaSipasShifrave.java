package Challage;

import java.util.Scanner;

public class MbledhjaENumravaSipasShifrave {
    /**
     * Metoda mbledh numrat sipas shifrave
     *
     * @param n numri qe do te mbledhet
     * @return numrin e mbledhur
     */
    public static int sumDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Shkruaj numrin: ");
            int numri = s.nextInt();

            System.out.println(String.format("Mbledhja e shifrave të numrit %d është %d \n", numri, sumDigits(numri)));
        }

    }
}
