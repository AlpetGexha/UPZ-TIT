package Ushtrime;

public class ushtrimi_2_prilli {
    public static void main(String[] args) {

        int[] v = {2, 3, 5, 7, 11, 13, 17, 6, 9, 10, 4, 19, 23};

        for (int i = 0; i < v.length; i++) {
            if (isNatyrale(v[i])) {
                System.out.println(v[i] + " => True");
            } else {
                System.out.println(v[i] + " => False");

            }
        }

    }

    public static boolean isNatyrale(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

//        while (round <= 1) {
//            if (n % round != 0) {
//                return false;
//            }
//            round--;
//        }

        return true;
    }
}
