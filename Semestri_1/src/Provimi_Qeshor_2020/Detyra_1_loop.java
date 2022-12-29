package Provimi_Qeshor_2020;

/**
 * (20 pikë) Shkruani një program në metodën main() i cili pasi të jetë ekzekutuar
 * do të ketë këtë dalje:
 * <p>
 * x o o o o
 * x x o o o
 * x x x o o
 * x x x x o
 * x x x x x
 */
public class Detyra_1_loop {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j)
                    System.out.print("X ");
                else
                    System.out.print("O ");
                System.out.println();
            }
        }
    }
}
