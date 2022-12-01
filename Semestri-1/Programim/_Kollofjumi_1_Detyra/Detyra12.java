package Kollofjumi1;

import java.util.Scanner;

public class Detyra12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Inputs
        System.out.print("Jep x1: ");
        int x1 = s.nextInt();

        System.out.print("Jep y1: ");
        int y1 = s.nextInt();

        System.out.print("Jep x2: ");
        int x2 = s.nextInt();

        System.out.print("Jep y2: ");
        int y2 = s.nextInt();

//        Procesimit

        double res = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));

//        Outputi

        System.out.println("Resulati: " + res);

    }
}
