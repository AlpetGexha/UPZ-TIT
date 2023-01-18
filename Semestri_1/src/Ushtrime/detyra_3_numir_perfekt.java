package Ushtrime;

public class detyra_3_numir_perfekt {
    public static void main(String[] args) {

        int n = 67812;
        int tmp = n;
        int acc = 0;
        int numri_i_shifrave = 0;


        while (tmp > 0) {
            int sh = tmp % 10;
            acc += sh;
            numri_i_shifrave++;

            tmp /= 10;
        }

        if (acc > (acc / numri_i_shifrave)) {
            System.out.println("Numri " + n + " eshte Perfekt");
        } else {
            System.out.println("Kerksa sje ");
        }
    }
}
