package Ushtrime;

public class Detryra_1_matrica_4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j == 0 || j == n - 1 || i == j || i + j == n - 1 || i == n / 2)
                {
                    System.out.print("X ");
                }
                else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
