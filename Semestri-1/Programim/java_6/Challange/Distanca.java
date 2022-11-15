package java6;

import java.util.Scanner;

import static java.lang.Math.*;

public class Distanca {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep x1: ");
        int x1 = s.nextInt();

        System.out.print("Jep y1: ");
        int y1 = s.nextInt();
        System.out.println();

        System.out.print("Jep x2: ");
        int x2 = s.nextInt();

        System.out.print("Jep y2: ");
        int y2 = s.nextInt();
        System.out.println();

        int distancaAjrore = (int) sqrt(pow(abs(x2 - x1), 2) + pow(abs(y2 - y1), 2)); // √ |x2-x1|²+|y2-y1|²
        int distancaNjerzore = abs(x2 - x1) + abs(y2 - y1); // |x2-x1|+|y2-y1|

        /*  pa perdorur Math.pow() dhe Math.abs()
         * int xy1 = (x1 - y1 < 0) ? (x1 - y1) * -1 : x1 - y1;
         * int xy2 = (x2 - y2 < 0) ? (x2 - y2) * -1 : x2 - y2;
         * int distancaAjrore1 = ((xy1 * xy1) + (xy2 * xy2));
         *
         * System.out.println("Distanca ajrore: " + distancaAjrore1);
         **/

        System.out.print(String.format("Distanca nese jeni Supermen: %s \n" + "Distanca nëse jeni Njëri   : %s", distancaAjrore, distancaNjerzore));

    }
}
