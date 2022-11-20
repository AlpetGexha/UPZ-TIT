package java7Loop;

import java.util.Scanner;

public class LekToEuroWhile {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double vlera_e_lek = 117.80;

        while (true) {
            System.out.print("Shkruaj Lek: ");
            int lek = s.nextInt();

            double result = lek / vlera_e_lek;
            System.out.println(String.format("%d lek janë: %.2f € Euro \n", lek, result));

        }
    }
}
