package Vernom;

import java.util.Random;

public class Vernom {

//  (chifer -key) mod26

//    fcceqshd   xbmornyz

    public static void main(String[] args) {
        String text = "fcceqshd";

//        String key = generateKey(text.length());
        String key = "xbmornyz";


        String encrypted = encrypt(text, key);
        System.out.println("Key: " + key);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);

    }

    public static String encrypt(String text, String key) {
        char[] alf = " abcdefghijklmnopqrstuvwxyz".toCharArray(); // Add a space at the beginning

        char[] texts = text.toCharArray();
        char[] keys = key.toCharArray();

        for (int i = 0; i < texts.length; i++) {
            if (Character.isLetter(texts[i])) {
                int index = (texts[i] - 'a' + 1) - (keys[i] - 'a' + 1); // Add 1 to each character's index
                if (index < 0) {
                    index += 26;
                }
                texts[i] = alf[index];

            }
        }

        return new String(texts);
    }

    public static String decrypt(String text, String key) {
        char[] alf = " abcdefghijklmnopqrstuvwxyz".toCharArray(); // Add a space at the beginning

        char[] texts = text.toCharArray();
        char[] keys = key.toCharArray();

        for (int i = 0; i < texts.length; i++) {
            if (Character.isLetter(texts[i])) {
                int index = (texts[i] - 'a' + 1) + (keys[i] - 'a' + 1); // Add 1 to each character's index
                if (index > 26) {
                    index -= 26;
                }
                texts[i] = alf[index];
            }
        }

        return new String(texts);
    }
    public static String generateKey(int length) {
        Random random = new Random();
        StringBuilder key = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            key.append(c);
        }
        return key.toString();
    }
}