package Challage;

import java.util.Scanner;

public class Histogrami3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vargu = {1, 2, 2, 2, 4, 1, 2, 4, 1, 2, 4, 2, 2, 1};

//        System.out.print("Jep sa shifra");
//        int n = s.nextInt();

//        int[] vargu = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.print("Jep shifren e " + i + ": ");
//            vargu[i] = s.nextInt();
//        }


        int[] vargu2 = new int[vargu.length];
        for (int i = 0; i < vargu.length; i++) {
            int count = vargu[i];
            vargu2[count]++;
        }

        dd(vargu2);


        int max = findMax(vargu2);


        for (int i = max; i > 0; i--) {

            for (int j = 0; j < vargu2.length; j++) {
                if (vargu2[j] >= i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println("  ");
        }

        printLable();
    }

    public static void printLable() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void dd(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println("[" + i + "] => " + input[i]);
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

}
