package Provimi_Qeshor_2022;

public class Detyra_3_numri_perfekt {
    public static void main(String[] args) {
        int n = 407;
        int tmp = n;
        int acc = 0;
        int numri_i_shifrve = 0;


        while (tmp > 0) {
            numri_i_shifrve++;
            tmp /= 10;
        }
        tmp = n;

        while (tmp > 0) {
            acc += Math.pow(tmp % 10, numri_i_shifrve);
            tmp /= 10;
        }

        if (n == acc) System.out.println("Numri Eshte Perfekt");
        else System.out.println("Kerka sje me numra");
    }
}
