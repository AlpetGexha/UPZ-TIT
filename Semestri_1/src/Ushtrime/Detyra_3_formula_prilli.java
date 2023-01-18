package Ushtrime;

public class Detyra_3_formula_prilli {
    public static void main(String[] args) {

        int n = 10;
        int k = 2;
        int b = 4;
        double formula = (1 / Math.pow(n, k)) * prodhimi(b, n) + shuma(n);

        System.out.println(formula);

    }

    public static int shuma(int k) {
        int acc = 0;

        for (int i = 1; i <= k; i++) {
            acc += k;
        }

        return acc;
    }


    public static int prodhimi(int a, int b) {
        int acc = 1;

        for (int i = a; i <= b; i++) {
            acc *= b;
        }

        return acc;
    }
}
