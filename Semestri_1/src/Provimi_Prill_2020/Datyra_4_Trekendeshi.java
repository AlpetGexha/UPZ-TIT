package Provimi_Prill_2020;

/**
 * (30 pikë) Një trekëndësh kënddrejtë mund të ketë brinjët gjatësitë e të cilave
 * janë numra të plotë. Bashkësia e tre vlerave të plota për gjatësitë e brinjëve të një
 * trekëndëshi kënddrejtë quhet treshja Pitagoriane. Gjatësitë e tre brinjëve duhet
 * të plotësojnë kushtin që shuma e katrorëve të dy kateteve është e barabartë me
 * katrorin e hipotenuzës. Shkruani një aplikacion në Java që paraqet një tabelë të
 * tresheve Pitagoriane për (kateta1, kateta2, hipotenuza), për kufirin deri në 500.
 * Përdorni një cikël me tre for-a të mbivendosur që provon të gjitha mundësitë.
 *
 *
 * Katetja1^2 + Katetja^2 = Hipotenuza^2
 * a^2 + b^2 = c^2
 */
public class Datyra_4_Trekendeshi {
    public static void main(String[] args) {

        int n = 500;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2))
                        System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
