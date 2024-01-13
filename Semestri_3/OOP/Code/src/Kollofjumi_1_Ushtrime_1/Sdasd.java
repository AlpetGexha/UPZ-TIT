package Kollofjumi_1_Ushtrime_1;

import java.util.Scanner;

public class Sdasd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Engjellusha so ka kupton sen bash sen: ");
        String piket = s.nextLine();
        String[] piketVarg = piket.split(",");
        int[] piketProv = new int[piketVarg.length];
        for (int i = 0; i < piketVarg.length; i++)
            piketProv[i] = Integer.parseInt(piketVarg[i]); //
        double avg;
        int sum = 0;
        for (int i = 0; i <= piketProv.length; i++) //
            sum += piketProv[i];

        avg = (double) sum / piketProv.length; //
        System.out.println("Mesatarja: " + avg);
    }

}
