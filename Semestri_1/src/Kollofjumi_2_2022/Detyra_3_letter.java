package Kollofjumi_2_2022;

import java.util.Scanner;

public class Detyra_3_letter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep nje shkronje: ");
        char letter = s.next().toLowerCase().charAt(0);

        if (!(letter >= 'a' && letter <= 'z')) {
            System.out.println("Nuk eshte shkronje");
            return;
        }

        if (isZanore(letter)) {
            System.out.println("Zanore");
        } else {
            System.out.println("Bashtingllore");
        }


    }

    public static boolean isZanore(char letter) {
        char[] zanore = {'a', 'e', 'o', 'u', 'i'};

        for (int i = 0; i < zanore.length; i++) {
            if (zanore[i] != letter) {
                return false;
            }
        }

        return true;
    }
}
