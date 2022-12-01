package Kollofjumi1;

import java.util.Scanner;

public class Convert24to12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = 14;
        while (true) {
            int n = s.nextInt();
            if (n > 12) {
                n %= 12;
                System.out.println(n + " PM");
            } else {
                System.out.println(n + " AM");
            }
        }
    }
}
