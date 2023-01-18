package Ushtrime;

import java.util.Scanner;

public class detrya_2_funskioni_count_numbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Jep nje fjali: ");
        String str = s.nextLine();

        llogaritja(str);
    }

    public static void llogaritja(String str) {
        char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < c.length; i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (c[i] == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(c[i] + " u paraqit " + count);
        }

    }
}
