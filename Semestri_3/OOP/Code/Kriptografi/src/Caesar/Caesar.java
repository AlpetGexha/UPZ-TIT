package Caesar;

import java.util.ArrayList;

public class Caesar {

    public static ArrayList<String> caesarCipherEncrypt(String plaintext, int shift, int mod) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> indexList = new ArrayList<>();
        for (int i = 0; i < plaintext.length(); i++) {
            char currentChar = plaintext.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                int asciiOffset = Character.isUpperCase(currentChar) ? 'A' : 'a';
                char encryptedChar = (char) (((currentChar - asciiOffset + shift) % mod) + asciiOffset);
                result.add(String.valueOf(encryptedChar));
                indexList.add(String.format("%02d", ((int) encryptedChar - asciiOffset)));
            } else {
                result.add(String.valueOf(currentChar));
                indexList.add("--");
            }
        }
        ArrayList<String> combinedResult = new ArrayList<>();
        combinedResult.add(String.join("", result));
        combinedResult.addAll(indexList);
        return combinedResult;
    }

    public static ArrayList<String> caesarCipherDecrypt(String ciphertext, int shift, int mod) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> indexList = new ArrayList<>();
        for (int i = 0; i < ciphertext.length(); i++) {
            char currentChar = ciphertext.charAt(i);
            if (Character.isAlphabetic(currentChar)) {
                int asciiOffset = Character.isUpperCase(currentChar) ? 'A' : 'a';
                char decryptedChar = (char) (((currentChar - asciiOffset - shift) % mod + mod) % mod + asciiOffset);
                result.add(String.valueOf(decryptedChar));
                indexList.add(String.format("%02d", ((int) decryptedChar - asciiOffset)));
            } else {
                result.add(String.valueOf(currentChar));
                indexList.add("--");
            }
        }
        ArrayList<String> combinedResult = new ArrayList<>();
        combinedResult.add(String.join("", result));
        combinedResult.addAll(indexList);
        return combinedResult;
    }

    public static void main(String[] args) {
        String name = "alpet";

        System.out.println("Encryption:");
        for (int key = 0; key < 26; key++) {
            ArrayList<String> encryptedNameAndIndices = caesarCipherEncrypt(name, key, 26);
            System.out.printf("Key %d: %s (%s)%n", key, encryptedNameAndIndices.get(0), String.join(", ", encryptedNameAndIndices.subList(1, encryptedNameAndIndices.size())));
        }

        System.out.println("\nDecryption:");
        for (int key = 0; key < 26; key++) {
            ArrayList<String> decryptedNameAndIndices = caesarCipherDecrypt(name, key, 26);
            System.out.printf("Key %d: %s (%s)%n", key, decryptedNameAndIndices.get(0), String.join(", ", decryptedNameAndIndices.subList(1, decryptedNameAndIndices.size())));
        }
    }
}
