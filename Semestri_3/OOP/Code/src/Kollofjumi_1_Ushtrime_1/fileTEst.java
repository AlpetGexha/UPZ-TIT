package Kollofjumi_1_Ushtrime_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class fileTEst {
    public static void main(String[] args) {

        int countLine = 0;
        int countWord = 0;
        int countChars = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"));

            while (reader.ready()) {
                String line = reader.readLine();// Lorem Ipsum is simply dummy
                countLine++;
                String[] word = line.split(" ");
                countWord += word.length;
                countChars += line.length();
            }

            reader.close();

            PrintWriter writer = new PrintWriter(new PrintWriter("out_text.txt"));
            writer.println("Numri i Rreshtave: " + countLine + "\nNumri i Fjalve: " + countWord + "\nNumri karaktere: " + countChars);

            writer.close();

        } catch (IOException e) {
            System.out.println("IO EX");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("U KRIJUA");

    }
}
