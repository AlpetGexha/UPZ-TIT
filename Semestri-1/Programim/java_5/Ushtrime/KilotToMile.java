package java5;

import java.util.Scanner;

public class KilotToMile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Kilogram to Mile: ");
            double kilogram = s.nextDouble();

            double mile = kilogram * 1.60934;
            System.out.println(String.format("%s Kilogram = %.2f Mile", kilogram, mile));
        }

    }
}
