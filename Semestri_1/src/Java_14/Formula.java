package Java_14;

public class Formula {

    public static void main(String[] args) {
        int n = 7;
        int a = 4;

        double formula1 = prodhimi(shuma(a));
        double formula2 = faktoriel(n);

        double result = formula1 / formula2;

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
