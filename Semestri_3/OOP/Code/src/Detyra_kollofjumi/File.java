package Detyra_kollofjumi;

import java.io.*;

public class File {

    public static void main(String[] args) {
        int countWord = 0;
        int countLine = 0;
        int countChars = 0;

        try (
             BufferedReader reader = new BufferedReader(new FileReader("src/Detyra_kollofjumi/x.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/Detyra_kollofjumi/y.txt"))
        ) {

            String line;
            while ((line = reader.readLine()) != null) {
                countLine++;
                String[] words = line.split(" ");
                countWord += words.length;
                countChars += line.length();
            }

            System.out.println(countLine + " " + countWord + " " + countChars);

            writer.write(
                    String.format("Numri i rreshtave: %d \nNumri i fjalve: %d \nNumri i karaktereve: %d\n",
                            countLine, countWord, countChars
                    )
            );

            System.out.println("SUCCESS");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading or writing file");
        }
    }
}