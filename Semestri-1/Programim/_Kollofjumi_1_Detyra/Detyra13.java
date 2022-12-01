package Kollofjumi1;

import java.util.Scanner;

public class Detyra13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Jep numrin 4shirfor");
            int n = s.nextInt();

            int shifra1 = n % 10;
            n /= 10;

            int shifra2 = n % 10;
            n /= 10;

            int shifra3 = n % 10;
            n /= 10;

            int shifra4 = n % 10;
            n /= 10;

//            System.out.println(shifra1 + " " + shifra2 + " " + shifra3 + " " + shifra4);

            if (
                    (((shifra1 + 3) == shifra2) || ((shifra1 - 3) == shifra2)) &&
                    (((shifra2 + 3) == shifra3) || ((shifra2 - 3) == shifra3)) &&
                    (((shifra3 + 3) == shifra4) || ((shifra3 - 3) == shifra4)) &&
                    (((shifra4 + 3) == shifra3 ) || ((shifra4 - 3) == shifra3))
            ){
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
