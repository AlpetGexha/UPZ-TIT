package java5;

import java.util.Scanner;

public class Drejtkendeshi {
    public static void main(String[] args) {
//        S = PI * r^2
//        P = 2 * PI * r
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Shkruaj rrenjen: ");
            double rrenja = s.nextDouble();

            double siperfaqja = Math.PI * Math.pow(rrenja, 2);
            double perimetri = 2 * Math.PI * rrenja;

            System.out.println(String.format("S = %.2f \nP = %.2f \n", siperfaqja, perimetri));
        }
    }
}
