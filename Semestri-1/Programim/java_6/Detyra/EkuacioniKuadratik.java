package java6;

import java.util.Scanner;

public class EkuacioniKuadratik {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
//        double a = 1, b = 5, c = 1;
        System.out.print("Jep vlerën e a: ");
        double a = input.nextDouble();

        if (a == 0) {
            System.out.println("Vlera 'a' nuk mund të jetë 0.");
            return;
        }

        System.out.print("Jep vlerën e b: ");
        double b = input.nextDouble();

        System.out.print("Jep vlerën e c: ");
        double c = input.nextDouble();

        //llogaritja e diskriminantes (d)
        int d = (int) (Math.pow(b, 2) - 4 * a * c); // (b^2 - 4 * a * c)
//        int d = (int) (b * b - 4 * a * c);

        /*
         *   abs - Vlera apsulute
         *   sqrt - Rrënjën katrore
         */
        double determinanta = Math.sqrt(Math.abs(d));

//      Nese determinanta eshte me e madhe se 0-ro
        if (d > 0) {
            System.out.println("\n Rrënjët e ekuacionit janë reale dhe të ndryshme. \n");

            double x1 = (-b + determinanta) / (2 * a); // llogaritja e rrënjës së parë ( -b+(b^2-4*a*c) / (2*a) )
            double x2 = (-b - determinanta) / (2 * a); // llogaritja e rrënjës së dytë ( -b-(b^2-4*a*c) / (2*a) )

            System.out.println(String.format("x1 = %.2f \nx2 = %.2f", x1, x2)); // "%.2f" merr vetem 2 numra pas presjes
//      Nese determinanta eshte 0

        } else if (d == 0) {
            System.out.println("\n Rrënjët e ekuacionit janë reale dhe të njëjta. \n");
            double x1 = (-b / (2 * a)); // llogaritja e rrënjës së vetme ( -b / (2*a) )
            double x2 = (-b / (2 * a));
//            double x2 = x1;
            System.out.println(String.format("x1 = %.2f \nx2 = %.2f", x1, x2));
        }
//      nese determinanta eshte me vogel se 0-ro
        else {
            System.out.println("\n Rrënjët e ekuacionit janë komplekse dhe të ndryshme. \n");
//            String x1 = ((-b / (2 * a)) + " + i" + determinanta);
//            String x2 = ((-b / (2 * a)) + " - i" + determinanta);
//
//            System.out.println(String.format("x1 = %.2f \nx2 = %.2f", x1, x2));
        }
    }
}
