package java7Loop;

import java.util.Scanner;

public class NumriZigZak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep numrin: ");
        int n = s.nextInt();

        /*
         * Input : 123456
         * Output: fasle
         *
         * Input : 2415
         * Output: true
         *
         * Input : 4251
         * Output: true
         * */

        boolean isZigZag = true;
        int lastDigit = n % 10;
        n /= 10;
        boolean isLess = lastDigit < n % 10;

//        Check if digit its going up or down and if it is going up or down
        while (n > 0) {
            int digit = n % 10;

            if (isLess) {
                if (digit >= lastDigit) {
                    isZigZag = false;
                    break;
                }
            } else {
                if (digit <= lastDigit) {
                    isZigZag = false;
                    break;
                }
            }

            lastDigit = digit;
            n /= 10;
        }
        System.out.println(isZigZag ? "Numri është zig zag" : "Numri nuk është zig zag");

    }
}
