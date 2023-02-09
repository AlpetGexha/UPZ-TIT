package Ushtrime_porvimi;

public class detyra_4_formula {
    public static void main(String[] args) {

        int n = 10;

        double formula = Math.pow(prodhimi(10), (1.0 / shuma(n)));
        System.out.println(formula);

    }

    public static int prodhimi(int n) {
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }

    public static int shuma(int n) {
        int res = 0;

        for (int i = 1; i <= n; i++) {
            res += i;
        }

        return res;
    }
}
