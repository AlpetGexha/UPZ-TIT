package Provimi_Janer_2024;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Detyra_2 {

    public static void main(String[] args) {

        // on a file with number only we need to calculate the sum each line of number and print the sum of each line
        //  also need to count for each digit how many times it appears in the file (0,1,2,3 ... 9)

        int[] count = new int[10];
        try (
                BufferedReader reader = new BufferedReader(new FileReader("../src/Provimi_Janer_2024/file.txt"))
        ) {
            String line;
            int total = 0;
            while ((line = reader.readLine()) != null) {
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum += Character.getNumericValue(line.charAt(i));
                    count[Character.getNumericValue(line.charAt(i))]++;
                    total+= sum;
                }
                System.out.println("Shuma e numrave ne rreshtin " + line + " eshte: " + sum);
            }
            System.out.println("Shuma totale e numrave ne fajll eshte: " + total);

            for(int i = 0; i < count.length; i++)
                System.out.println("Numri " + i + " eshte shfaqur: " + count[i]);

        } catch (FileNotFoundException e) {
            System.out.println("Fajlli nuk u gjet");
        } catch (IOException e) {
            System.out.println(e);
        }


    }
}
