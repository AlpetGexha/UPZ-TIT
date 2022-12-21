package Provimi_Qeshor_2020;


/**
 * (30 pikë) Punëtorët në një kompani paguhen për orët e punës me 7.25 euro për
 * 40 orë në javë. Ata do të paguhen për çdo orë shtesë me gjysmën e pagës së tyre
 * bazë. Për më tepër, ata do të pranojnë një përqindje për shitjet që ata realizojnë
 * përderisa drejtojnë arkën. Përqindja bazohet në formulën e mëposhtme:
 * <p>
 * Vëllimi i shitjeve       Përqindja
 * 1.0 - 99.99 euro          5%  të shitjeve totale
 * 100.00 - 299.99 euro      10% të shitjeve totale
 * ≥ 300.00 euro             15% shitjeve totale
 * <p>
 * Shkruani një program në Java që merr si hyrje numrin e orëve të punuara dhe
 * numrin e përgjithshëm të shitjeve, llogarit pagën dhe si rezultat e paraqet atë
 * në konsolë.
 */

public class Detyra_5_Oret_Punuar {
    public static void main(String[] args) {
        int oret = 45;
        double shitja = 253.32;

        System.out.println(String.format("Paga: %.2f €", paga(oret, shitja)));
    }

    public static double paga(int oret, double shitjet) {
        final double paga = 7.25;
        double pagaShtese = 0;
        double pagaShitje = 0;
        double pagaTotale = 0;

        if (oret > 40) {
            pagaShtese = (oret - 40) * (paga / 2.0);
        }

        if (shitjet >= 300)
            pagaShitje = shitjet * 0.15;
        else if (shitjet >= 100)
            pagaShitje = shitjet * 0.10;
        else if (shitjet >= 1)
            pagaShitje = shitjet * 0.05;

        pagaTotale = paga + pagaShtese + pagaShitje;

        return pagaTotale;
    }

}
