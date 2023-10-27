package Java_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class FrekuncaFjalve {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
            HashMap<String, Integer> frecuency = new HashMap<>();

            while (reader.ready()) {
                String line = reader.readLine();
                line = line.toLowerCase();
                String[] words = line.split(" ");

                for (String word : words) {
                    if (frecuency.containsKey(word)) {
                        frecuency.put(word, frecuency.get(word) + 1);
                    } else {
                        frecuency.put(word, 1);
                    }
                }
            }

            for (String word : frecuency.keySet()) {
                System.out.println(word + " " + frecuency.get(word));
            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
