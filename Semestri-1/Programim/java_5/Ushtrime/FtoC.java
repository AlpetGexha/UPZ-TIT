package java5;

import java.util.Scanner;

public class FtoC {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Fahrenheit to Celsius: ");
            double temp = s.nextDouble();

            double f = (temp - 32) * (5.0 / 9.0);
            System.out.println(String.format("%s Fahrenheit = %.2f Celsius", temp, f));
        }
    }


}
