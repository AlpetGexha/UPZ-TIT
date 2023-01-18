package Ushtrime;

public class detyra_1_matrica_ma_ndryshe {
    public static void main(String[] args) {
        int num = 10;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print(num + j + " ");
            }

            num += 10;
            System.out.println();
        }
    }
}
