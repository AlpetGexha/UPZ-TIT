package Kollofjumi1;

import java.util.Scanner;

public class Detyra5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double f = s.nextDouble();

        String s1 = "Celdasdas";

        double res = (f - 32.0) * (5.0 / 9.0);
        System.out.println(String.format("%.2f", res));

    }
}
