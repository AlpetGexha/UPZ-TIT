package Ushtrime;

public class Detyra_4_formula {
    public static void main(String[] args) {

        int n = 15;
        int a = 4;
        double res = (shuma(a, n) + faktoriel(n)) * (1 / prodhimi(n));

        System.out.println(res);
    }

    public static int shuma(int a, int b) {
        int acc = 0;

        for (int j = a; j <= b; j++) {
            acc += j;
        }

        return acc;
    }

    public static int prodhimi(int n) {
        int acc = 1;

        for (int i = 1; i <= n; i++) {
            acc *= i;
        }

        return acc;
    }

    public static int faktoriel(int n) {
        return prodhimi(n);
    }
}
