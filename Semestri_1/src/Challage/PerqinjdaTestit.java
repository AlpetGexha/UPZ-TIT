package Challage;

import java.util.Scanner;

public class PerqinjdaTestit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        final double piketMaksimale = 100.0;
        while (true) {
            System.out.print("Jep Piket e testi: ");
            int piketTestuse = s.nextInt();

            System.out.print("Jep Perqidjen e Kollofjumit: ");
            double perqindjaTesti = s.nextDouble();

            double res = (piketTestuse * perqindjaTesti) / piketMaksimale;

            System.out.println("Perqinjda e Jujat është: " + res + "%\n");

            if (perqindjaTesti / 2 <= res)
                System.out.println("URIME KOLEG/E KENI KALUAR");
            else
                System.out.println("KERKA ME JET NUK JE");
        }
    }
}
