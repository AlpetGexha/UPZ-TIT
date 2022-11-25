package java8;

import java.util.Scanner;

public class Detyra4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        double res = 3 * Math.sqrt((25 + 10) * Math.sqrt(5 * (a * a)));

        System.out.println(String.format("Rezultatoi: %.2f", res));

    }
}
