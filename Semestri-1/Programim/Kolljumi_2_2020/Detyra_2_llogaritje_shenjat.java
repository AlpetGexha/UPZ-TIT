package Kolljumi_2_2020;

/**
 * 2. (20 pikë) Shkruani një metodë (funksion) në JAVA e cila llogarit numrin e paraqitjeve të shenjave të pikësimit
 * {',', '.', ':', '!', '?'} në një tekst të dhënë perdoruesi.
 * Për shembull: Nëse teksti i dhënë është: nga "Hello, World!!! Are you there? Yes I am." atëherë funksioni duhet
 * të raportojë qё:
 * ":" u paraqit 0 herë
 * "," и paraqit 1 herë
 * "!" и paraqit 3 herë
 * "?" и paraqit 1 herë
 * "."" и paraqit 1 herë
 */

public class Detyra_2_llogaritje_shenjat {
    public static void main(String[] args) {

        String str = "Hello, World!!! Are you there? Yes I am.";

        char v[] = {',', '.', ':', '!', '?'};

        for (int i = 0; i < v.length; i++) {
            count(str, v[i]);
        }

    }

    public static void count(String str, char c) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }

        System.out.println(c + " u paraqit " + count + " herë");

    }
}
