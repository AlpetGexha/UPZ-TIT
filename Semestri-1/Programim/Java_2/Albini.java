package Java2;

import java.util.Scanner;

public class Albini {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true) {
//      Inputs
            System.out.print("Sa është numrin i miqëve: ");
            int numri_i_miqve = s.nextInt();

            System.out.print("Sa është sasia e gotes (ml): ");
            int sasia_e_gotes = s.nextInt();

            System.out.print("Sa është sasia e shises (ml): ");
            int sasia_e_shishes = s.nextInt();

//      Proces
            int formula = 1 + (numri_i_miqve / (sasia_e_shishes / sasia_e_gotes) );

//      Output
            System.out.println("Numri i shishave që duhet të blini është: " + formula + "\n");
        }
    }
}
