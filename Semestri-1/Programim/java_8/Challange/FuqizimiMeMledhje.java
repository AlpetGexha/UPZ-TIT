/* Fuqizimi i numrave duke perdorur mbledhen
*
* 3^4 = 3 * 3 * 3 * 3 = 81
*
*   1) Së pari 3 herë shtoni 3, marrim 9. (3^2)
*   2) Pastaj 3 herë shtoni 9, marrim 27. (3^3)
*   3) Pastaj 3 herë shtoni 27, marrim 81. (3^4)
*
* */

package java8;

import java.util.Scanner;

public class FuqizimiMeMledhje {
    public static void main(String[] args) {
//        int n = 3, power = 4;
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Jep Numrin: ");
            int n = s.nextInt();

            System.out.print("Jep Fuqin: ");
            int power = s.nextInt();

            int result = n;
            int rritja = n;

            if (power == 0) result = 1;
            else {
                for (int i = 1; i < power; i++) {
                    for (int j = 1; j < n; j++) {
                        result += rritja;
                    }

                    rritja = result;
                }
            }

            System.out.println(String.format("%d ^ %d = %d", n, power, result));
            System.out.println((int) Math.pow(n, power));
        }
    }
}
