package Kollofjumi_2_final;

public class detyra_5_formula {
    public static void main(String[] args) {

        int n = 10;

        double res = Math.pow(prodhimi(n), (1.0 / shuma(n)));
        System.out.println(res);
    }

    public static int shuma(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    public static int prodhimi(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
