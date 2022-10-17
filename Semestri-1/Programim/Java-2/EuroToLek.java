package Java2;

import java.util.Scanner;

public class EuroToLek {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int vlera_e_lekut = 128;

        while (true) {

            System.out.print("Shkruaj Eurot: ");
            int euro = s.nextInt();

            int formula = euro * vlera_e_lekut;

            System.out.println(euro + "€ janë " + formula + " lek");
        }
    }
}
