package Ushtrime_testi;

public class Ushtrimi_3 {
    public static void main(String[] args) {
        numirDisarium(137);
    }

    public static void numirDisarium(int n) {
        int tmp = n;
        int numri_i_shifrave = 0;

        while (tmp > 0) {
            numri_i_shifrave++;
            tmp /= 10;
        }
        tmp = n;

        int acc = 0;

        while (tmp > 0) {
            acc += Math.pow((tmp % 10), numri_i_shifrave);
            tmp /= 10;
            numri_i_shifrave--;
        }


        if (acc == n) {
            System.out.println(n + " OSht numer diskret a qysh ke");
        } else {
            System.out.println(n + " Kerka nuk je me kit numer");
        }
    }
}
