package Kollofjumi_2_2022;

public class Detyra_1_loop {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == (n / 2) + 1 || i == (n - j) + 1) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
