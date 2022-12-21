package Provimi_Qeshor_2020;

/**
 * (30 pikë) Një trekëndësh kënddrejtë mund të ketë brinjët gjatësitë e të cilave
 * janë numra të plotë. Bashkësia e tre vlerave të plota për gjatësitë e brinjëve të një
 * trekëndëshi kënddrejtë quhet treshja Pitagoriane. Gjatësitë e tre brinjëve duhet
 * të plotësojnë kushtin që shuma e katrorëve të dy kateteve është e barabartë me
 * katrorin e hipotenuzës. Shkruani një aplikacion në Java që paraqet një tabelë të
 * tresheve Pitagoriane për (kateta1, kateta2, hipotenuza), për kufirin deri në 500.
 * Përdorni një cikël me tre for-a të mbivendosur që provon të gjitha mundësitë.
 * <p>
 * <p>
 * a^2 + b^2 = c^2
 */
public class Detyra_5_Trekenshi {
    public static void main(String[] args) {
        int n = 500;

        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                for (int c = 1; c < n; c++) {

                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        System.out.println(a + " " + b + " " + c);
                    }
                    
                }
            }
        }

    }
}
