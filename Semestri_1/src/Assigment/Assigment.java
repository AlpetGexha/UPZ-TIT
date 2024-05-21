package Assigment;

import java.util.Scanner;

public class Assigment {
    public static void main(String[] args) {
        String str = "Përshëndetje Bota!".toLowerCase();

        int zanore = 0;
        int bashktingllore = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (!((letter >= 'a' && letter <= 'z'))) {
                continue;
            }

            if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'u' || letter == 'i' || letter == 'y' || letter == 'ë') {
                zanore++;
            } else{
                bashktingllore++;
            }

        }

        System.out.println("Zanore: " + zanore);
        System.out.println("Bashktingllore: " + bashktingllore);


    }


}
