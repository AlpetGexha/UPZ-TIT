package java7;

import java.util.Scanner;

public class ShifraEDjathte {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep Numrin 1: ");
        int n1 = s.nextInt();

        System.out.print("Jep Numrin 2: ");
        int n2 = s.nextInt();

        int shifra1 = n1 % 10;
        int shifra2 = n2 % 10;

        if(shifra1 == shifra2) {
            System.out.println("Shifrat e fundit të dy numrave janë të njëjta");
        }

        System.out.println("\nProgrami ka mbaruar ...");

    }
}
