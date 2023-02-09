package Ushtrime_porvimi;

public class Matrixa_1 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == n - 1  || i + j == n - 1 || j == n / 2) {
                    System.out.print(j+1 + " ");
                } else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }

    }
}
