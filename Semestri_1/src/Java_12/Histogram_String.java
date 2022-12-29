package Java_12;

import java.util.Scanner;

public class Histogram_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read in the input string
        System.out.print("Enter a string: ");
        String input = scan.nextLine();

        // Create an array to store the frequencies of each character
        int[] freq = new int[26];

        // Count the frequencies of each character
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        // Find the maximum frequency
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        // Print the histogram
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (freq[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Print the character labels
        for (int i = 0; i < 26; i++) {
            System.out.print((char) ('a' + i) + " ");
        }
        System.out.println();
    }
}

