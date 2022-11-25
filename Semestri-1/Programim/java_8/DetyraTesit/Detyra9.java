package java8;
/**
 * Kthe formain e oreve nga 24 ne 12
 */

import java.util.Scanner;

public class Detyra9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Jep oren: ");
            int ora = s.nextInt();

            System.out.print("Jep Minuta: ");
            int minuta = s.nextInt();


            if (minuta > 60) {
                System.out.println("Ka je nis me kto shirfra der 59 e kena");
            } else {

                if (ora >= 12) {
                    ora -= 12;
                }
                System.out.println("Ora eshte: " + ora + ":" + minuta);
            }
        }

    }
}
