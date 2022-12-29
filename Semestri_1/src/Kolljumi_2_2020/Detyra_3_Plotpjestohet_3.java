package Kolljumi_2_2020;

import java.util.Scanner;

/**
 * (20 pikë) Shkruani një program në JAVA i cili zhvendos secilin numer pozitiv në të djathtë dhe secilin numer
 * negativ në të majtë të një vargu të dhënë të numrave të plotë.
 * */

public class Detyra_3_Plotpjestohet_3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Jep numrin n: ");
            int n = s.nextInt();
            int tmp = n;

            int sum = 0;

            while (tmp < 0) {
                sum += tmp % 10;
                tmp /= 10;
            }

            if (n % 3 == 0 && sum % 3 == 0)
                System.out.println("Plotjetsohet me 3");
            else
                System.out.println("Nuk Plotpjestohet me 3");

            System.out.println();
        }
    }
}
