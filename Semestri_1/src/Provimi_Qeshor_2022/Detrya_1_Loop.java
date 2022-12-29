package Provimi_Qeshor_2022;


/**
 * (20 pikë) Shkruani një program në metoden main() i cili pasi të jetë ekzekutuar do të ketë këtë dalje:
 * <p>
 * o           o
 * o  o     o  o
 * o  o  o  o  o
 * o  o     o  o
 * o           o
 */

public class Detrya_1_Loop {
    public static void main(String[] args) {
           int n = 5;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n - 1)
                        System.out.print("O ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }

    }
}
