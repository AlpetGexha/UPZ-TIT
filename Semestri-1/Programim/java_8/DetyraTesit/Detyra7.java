package java8;

import java.util.Scanner;

public class Detyra7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        String dita = "Nuk ka resulata";

        switch (n) {
            case 1:
                dita = "E hene 1";
                break;
            case 2:
                dita = "E hene 2";
                break;
            case 3:
                dita = "E hene 3";
                break;
            case 4:
                dita = "E hene 4";
                break;
            case 5:
                dita = "E hene 5";
                break;
            case 6:
                dita = "E hene 6";
                break;
            case 7:
                dita = "E hene 7";
                break;
        }

        System.out.println(dita);
    }
}
