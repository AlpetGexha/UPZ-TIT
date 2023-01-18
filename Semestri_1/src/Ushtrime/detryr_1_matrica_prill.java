package Ushtrime;

public class detryr_1_matrica_prill {
    public static void main(String[] args) {
        int n = 4;
        int numri = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    System.out.print(numri + j + 1 + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            numri += 1;
            System.out.println();
        }

    }
}
