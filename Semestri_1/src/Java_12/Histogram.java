package Java_12;

import java.util.Scanner;

/** Histogrami
 *
 *  Supozojm se vargu a permban vetem shifra decimale.
 *  Numeroni per cdo shifer k numrin e paraqitjeve te shifrave k ne vargun a dhe ruaji ato ne h[k]
 *
 *
 *  Zgjithja:
 *
 *  Merr nje varg me numnra
 *  Sa eshte vlera minimale dhe maksimale e vargut
 *  Sa eshte numri i shifres se me shume paraqitur
 *  Sili numer perseritet me shume dhe gjeni "Lartesine" e histogramit
 *  Shfaq histogramin
 *
 *  * */

public class Histogram {
    public static void main(String[] args) {
//        6 Numra
//        Min: 1
//        Max: 5
        int input[] = {1, 1, 2, 1, 5, 1};

//        Scanner s = new Scanner(System.in);
//        System.out.println("Sa numra do te jepni: ");
//        int n = s.nextInt();
//        int input[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Jep numrin: ");
//            input[i] = s.nextInt();
//        }


//        E gjejm numrin maksimal dhe minimal
        int max = findMax(input);
        int min = findMin(input);


        // Kijorjm nje array me madhesine e numrave qe kemi
        // Vlera (Maximale - Minimale) - Referohen numir i rreshtave per (*)
        // +1 - Referohen numri i rreshtave per numra
        int[] vargu = new int[max - min + 1];


        // Tregon sa here perseritet nje numr në array
        for (int i = 0; i < input.length; i++) {
            int count = input[i] - min; // - minus indeksi minimal
            vargu[count]++; // rrit indeksin per 1
        }

        // maksimumi i vargut
        int maxYlla = findMax(vargu);

        // Printo histogramin
        for (int i = maxYlla; i > 0; i--) {
//            System.out.print(i + " ");
            for (int j = 0; j < vargu.length; j++) {
//                System.out.print(j+" ");
                if (vargu[j] >= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // Printo Numrat
        printLable(vargu, min);

        System.out.println("\n-------------------------------------------\n");

        for (int i = 0; i < vargu.length; i++) {
            System.out.println((i + min) + " : " + printStars(vargu[i]));
        }

        System.out.println("\n-------------------------------------------\n");

        for (int i = 0; i < vargu.length; i++) {
            System.out.println("Numri " + (i + min) + " perseritet " + vargu[i] + " here");
        }


    }

    public static int findMax(int[] input) {
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    public static int findMin(int[] input) {
        int min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }
        return min;
    }

    public static void printLable(int[] vargu, int min) {
        for (int i = 0; i < vargu.length; i++) {
            System.out.print((i + min) + " ");
        }
        System.out.println();
    }

    public static String printStars(int n) {
        String str = "";

        for (int i = 0; i < n; i++) {
            str += "*";
            if (i < n - 1) str += " ";
        }
        return str;
    }

    public static void dd(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}
