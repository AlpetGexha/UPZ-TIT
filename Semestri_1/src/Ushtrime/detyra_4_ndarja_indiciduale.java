package Ushtrime;

public class detyra_4_ndarja_indiciduale {
    public static void main(String[] args) {
        int n = 312312;
        int tmp = n;
        int count = 0;

        while (tmp > 0) {
            count++;
            tmp /= 10;
        }

        int vargu[] = new int[count];

        for (int i = 0; i < vargu.length; i++) {
            vargu[i] = n % 10;
            n /= 10;
        }

        for (int i = vargu.length - 1 ; i >= 0; i--) {
            System.out.print(vargu[i]);
        }

    }
}
