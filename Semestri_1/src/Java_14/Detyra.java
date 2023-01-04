package Java_14;

public class Detyra {

    public static void main(String[] args) {
        int n = 5;
        int a = 10;

        int sum = shuma(a);
        System.out.println(n);

        int prod = faktoriel(n);
        System.out.println(prod);

        double prod2 = prodhimi(sum);
        System.out.println(prod2);

        double result = (double)prodhimi(shuma(a)) / (double) faktoriel(n);

        System.out.println(result);
    }

    public static int shuma(int n) {
        int shuma = 0;
        for (int i = 1; i <= n; i++) {
            shuma += i;
        }
        return shuma;
    }

    public static int prodhimi(int n) {
        int prodhimi = 1;
        for (int i = 1; i <= n; i++) {
            prodhimi *= i;
        }
        return prodhimi;
    }

    public static int faktoriel(int n) {
        return prodhimi(n);
    }

}
