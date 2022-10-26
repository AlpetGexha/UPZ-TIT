package Java3;

import java.util.Scanner;

public class Paketimi_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        Input
        System.out.print("Jep Gjatesine e paketes: ");
        int gjatesiaPakete = s.nextInt();

        System.out.print("Jep Gjeresin e pakestes: ");
        int gjeresiaPaketes = s.nextInt();

        System.out.print("Jep lartesin e pakestes: ");
        int lartesiaPaketes = s.nextInt();

        System.out.print("Jep gjatesin e kubit: ");
        int gjatesiaKub = s.nextInt();

        System.out.print("Jep gjeresin e kubit: ");
        int gjeresiaKub = s.nextInt();

        System.out.print("Jep lartesin e kubit: ");
        int lartesiaKub = s.nextInt();

//        Process
        int formula = (int) Math.pow((gjatesiaPakete * gjeresiaPaketes * lartesiaPaketes) / (gjatesiaKub * gjeresiaKub * lartesiaKub), 3);
//        (a*b*c(kutia) / x*y*z(kub)) ^ 3

//        Output
        System.out.println(String.format("Në kuti mund të vendosen %s Kube \n", formula));

    }
}
