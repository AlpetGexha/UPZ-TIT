package Java_3;

import java.util.Scanner;

public class Paketimi_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {
//        Input
//            Kutia
            System.out.print("Jep gjatesine e paketes: ");
            int gjatesiaPakete = s.nextInt();

            System.out.print("Jep gjeresin e pakestes: ");
            int gjeresiaPaketes = s.nextInt();

            System.out.print("Jep artesin e pakestes: ");
            int lartesiaPaketes = s.nextInt();

//           Kubi
            System.out.print("\nJep gjatesin e Kuboidit: ");
            int gjatesiaKuboid = s.nextInt();

            System.out.print("Jep gjeresin e Kuboidit: ");
            int gjeresiaKuboid = s.nextInt();

            System.out.print("Jep lartesin e Kuboidit: ");
            int lartesiaKuboid = s.nextInt();

//        Process
            int formula = (gjatesiaPakete * gjeresiaPaketes * lartesiaPaketes) / (gjatesiaKuboid * gjeresiaKuboid * lartesiaKuboid);

//        Output
            System.out.println(String.format("\nNë kuti mund të vendosen %s Kube \n", formula));
        }
    }
}
