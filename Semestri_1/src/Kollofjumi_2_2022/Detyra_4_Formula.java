package Kollofjumi_2_2022;

public class Detyra_4_Formula {
    public static void main(String[] args) {
        int n = 6;
        int a = 5;

        double res = (shuma(a, n) + faktorizimi(n)) / (1.0 / prothimi(n));

        System.out.println(res);
    }

    public static int shuma(int a, int b) {
        int shuma = 0;
        for (int i = a; i <= b; i++) {
            shuma += i;
        }

        return shuma;
    }

    public static int prothimi(int n) {
        int prodhimi = 1;
        for (int i = 1; i <= n; i++) {
            prodhimi *= i;
        }

        return prodhimi;
    }

    public static int faktorizimi(int n) {
        return prothimi(n);
    }
}
