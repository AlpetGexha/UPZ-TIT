package Challage;

/**
 * Problemi 5: Palindrom
 * Per nje fjale/text/string shruani nje program i cili teston a eshte stringu PALINDROM
 */

import java.util.Scanner;

public class Palindrom {

    /**
     * Kthen teksti në anën e kundërt
     *
     * @param value - Teksti
     * @return Tektin në anën e kundert
     */
    public static String reverseString(String value) {
        StringBuilder text = new StringBuilder(value);
        text.reverse();
        return text.toString();
    }

    /**
     * Shiko nëse teksti është tekst PALINDROM
     *
     * @param value Teksti
     * @return boolean
     */
    public static boolean checkPalindrome(String value) {
        return value.equals(reverseString(value.toLowerCase()));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Shkruani Fjalën: ");
            String teksti = s.nextLine().toLowerCase().replaceAll("\\s", ""); // hiq hapesirat (spaces) dhe kthe tesktin ne shkronja të vogla

            System.out.println(String.format("%s %s Fjalë PALINDROM \n",teksti, checkPalindrome(teksti) ? "është" : "nuk është"));
        }

    }
}
