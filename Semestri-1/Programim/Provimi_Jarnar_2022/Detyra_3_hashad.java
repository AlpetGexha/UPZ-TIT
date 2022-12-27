package Provimi_Jarnar_2022;

public class Detyra_3_hashad {

    public static void main(String[] args) {

        int n = 11;
        int tmp = n;
        int acc = 0;

        while (tmp > 0) {
            acc += tmp % 10;
            tmp /= 10;
        }

//        if(n % acc == 0)
        System.out.print(n % acc == 0);

    }
}
