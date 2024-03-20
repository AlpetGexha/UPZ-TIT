package AES_DES;

import java.util.Arrays;

public class AES_DES {
    public static void main(String[] args) {
        // Test the methods
        String text = "alpet";
        int key = 15;


        String encrypted = encrypt(text, key);
        System.out.println("Encrypted: " + encrypted + " " + Arrays.toString(getAsciiValues(encrypted)));
        System.out.println();

        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted + " " + Arrays.toString(getAsciiValues(decrypted)));

    }

//    ((char - a) + key) mod 26 + a

    public static String encrypt(String text, int key) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                chars[i] = (char) ((((chars[i] - 'a') + key) % 26) + 'a');
            }
            System.out.println(
//                    print the formula
                    "(" + (int)chars[i]  + " - 97) + " + key + ") mod 26 + 97 = " + (int)chars[i] + " -> " + chars[i]
            );
        }
        return new String(chars);
    }

//    ((char - a) - key) mod 26 + a
    public static String decrypt(String text, int key) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                int decrypted = (chars[i] - 'a' - key) % 26;
                if (decrypted < 0) {
                    decrypted += 26;
                }
                chars[i] = (char) (decrypted + 'a');
            }
            System.out.println(
//                    print the formula
                    "(" + (int)chars[i]  + " - 97) + " + key + ") mod 26 - 97 = " + (int)chars[i] + " -> " + chars[i]
            );
        }
        return new String(chars);
    }

    public static int[] getAsciiValues(String text) {
        int[] asciiValues = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            asciiValues[i] = (int) text.charAt(i);
        }
        return asciiValues;
    }
}