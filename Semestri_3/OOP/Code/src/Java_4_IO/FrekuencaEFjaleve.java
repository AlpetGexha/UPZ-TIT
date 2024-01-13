package Java_4_IO;

import java.io.*;
import java.util.HashMap;

public class FrekuencaEFjaleve {
    public static void main(String[] args) {
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Java_4_IO/text.txt"));
            PrintWriter writer = new PrintWriter(new FileWriter("src/Java_4_IO/frekuencat.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                // Skip empty lines
                if (line.isEmpty()) {
                    continue;
                }

                // Convert the line to lowercase and split it into words
                line = line.toLowerCase();
                String[] words = line.split("[ .,:;!?\"(){}\\[\\]]");

                // Count word frequencies
                for (String word : words) {
                    // Skip empty words
                    if (word.isEmpty()) {
                        continue;
                    }

                    // Update word frequency
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }

            // Write word frequencies to a file and print them
            for (String word : wordFrequency.keySet()) {
                writer.write(word + ", " + wordFrequency.get(word) + "\n");
                System.out.println(word + ", " + wordFrequency.get(word));
            }
        }
        catch (FileNotFoundException e){
             System.out.println("Gabim: File nuk u gjet!");        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
