package Kollofjumi1;

import java.util.Scanner;

public class Detyra10 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        while (true) {
            int n = s.nextInt();

            boolean isCift = true;
            final int r = 10;

            int shifra = n;

            if (shifra % 2 != 0) {
                isCift = false;
            }

            shifra = n % r;
            n /= r;

            if (shifra % 2 != 0) {
                isCift = false;
            }

            shifra = n % r;
            n /= r;

            if (shifra % 2 != 0) {
                isCift = false;
            }

            shifra = n % r;
            n /= r;

            if (shifra % 2 != 0) {
                isCift = false;
            }

            shifra = n % r;
            n /= r;

            if (shifra % 2 != 0) {
                isCift = false;
            }

            shifra = n % r;
            n /= r;

            if (shifra % 2 != 0) {
                isCift = false;
            }
            System.out.println(isCift);
        }
    }
}























