package Java_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Matrica {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Java_4/matrix.txt"));
            String line;

            // Read matrix rows and parse into a list of lists
            while ((line = reader.readLine()) != null) {
                ArrayList<Integer> row = parseRow(line);
                matrix.add(row);
            }

            // Calculate and print row and column averages
            for (int i = 0; i < matrix.size(); i++) {
                int accRr = 0;
                int accK = 0;

                for (int j = 0; j < matrix.get(0).size(); j++) {
                    accRr += matrix.get(i).get(j);
                    accK += matrix.get(j).get(i);
                }

                double avgRr = avg(accRr, matrix.size());
                System.out.println("Mesatarja e rreshtit " + (i + 1) + ": " + avgRr);

                double avgK = avg(accK, matrix.get(0).size());
                System.out.println("Mesatarja e kolones " + (i + 1) + ": " + avgK);

                System.out.println();
            }


        } catch (FileNotFoundException e) {
            System.out.println("Gabim: File nuk u gjet!");
        } catch (IOException e) {
            System.out.println("Gabim gjeneral I/O!");
        }
    }

    private static ArrayList<Integer> parseRow(String line) {
        String[] numrat = line.split("\t");
        ArrayList<Integer> row = new ArrayList<>();

        for (String numri : numrat) {
            int vlera = Integer.parseInt(numri);
            row.add(vlera);
        }

        return row;
    }

    // Method to calculate the average given a sum and count
    private static double avg(int sum, int count) {
        return (double) sum / count;
    }
}
