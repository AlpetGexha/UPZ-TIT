package java8;

import java.util.Scanner;

public class Detyra14 {

    public static void main(String[] args) {

        Scanner hyrja = new Scanner(System.in);
        System.out.print("Jepni numrin e centave per pagese: ");
        int n = hyrja.nextInt();
        int norg = n;
        int a = 0;
        int b1 = 0;
        int b2 = 0;
        int c = 0;
        int d = 0;

        a = n % 10;
        b1 = 5 - a;
        b2 = 10 - a;

        if (b1 > 0 && b1 < 5) {
            d = norg + b1;
            System.out.println("Numri i rrumbullaksuar ne 5 cent i centave te dhena eshte: " + d);
        } else {
            d = norg + b2;
            System.out.println("numri eshte:" + d);
        }
    }
}