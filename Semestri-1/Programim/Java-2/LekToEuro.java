package Java2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LekToEuro {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner s = new Scanner(System.in);

        double vlera_e_lek = 117.80;

        while (true) {
            System.out.print("Shkruaj Lek: ");
            int lek = s.nextInt();

            double result = lek / vlera_e_lek;

            System.out.println(lek + " Lek janë " + df.format(result) + "€ Euro \n");
        }
    }
}
