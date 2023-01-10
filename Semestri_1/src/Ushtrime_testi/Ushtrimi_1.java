package Ushtrime_testi;

public class Ushtrimi_1 {
    public static void main(String[] args) {

        pattern(6);
    }

    public static void pattern(int n) {
        int k;
        for (int i = 0; i < n; i++) {
            k = i + 1;
            for (int j = 0; j < n; j++) {
                if (i + j <= n - 1) {
                    System.out.print(k + " ");
                } else {
                    System.out.print(0 + " ");
                }
                k += 2;
            }
            System.out.println();
        }
    }
}
