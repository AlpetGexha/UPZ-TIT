package Ushtrime;

public class Detyra_1_matrica_2 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {


//                System.out.print(i + " ");
//                System.out.print(j + " ");

                if (i == n - 1 || i == 0 || i + j == n - 1 || j == n / 2) {
                    System.out.print(i + 1 + " ");
                } else {
                    System.out.print(0 + " ");
                }

            }
            System.out.println();
        }
    }

}
