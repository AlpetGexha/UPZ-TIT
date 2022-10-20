package Challange;
/**
 * Problemi 6: Paketimi
 * <p>
 * Shkruani një program që pyet përdoruesin të shënojë gjatësinë e një brinje të një kubi, dhe dimensionet e një kutie,
 * dhe printon numrin maksimal të kubeve që mund të vendosen në kutinë. Vini re se brinjët e secilit kub duhet të jenë
 * paralele me brinjët e kutisë. Mund të supozoni se të gjitha gjatësitë janë numra të plotë (në centimeter).
 */

import java.util.Scanner;

public class Paketimi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        try {
            while (true) {
//          Input
                System.out.print("Jep dimensionin e paketimt: ");
                int dimensioniPaketes = s.nextInt();

                System.out.print("Jep dimenzionin e kubit: ");
                int dimensioniKubit = s.nextInt();

//          Proces
                int formula = (int) Math.pow( (dimensioniPaketes / dimensioniKubit) , 3); // (DP/DK) * (DP/DK) * (DP/DK)

//          Output
                System.out.println(String.format("Në kuti mund të vendosen %s Kube \n", formula));

            }

//        } catch (Exception ex) {
//            System.out.println("\n" + ex);
//        }
    }
}
