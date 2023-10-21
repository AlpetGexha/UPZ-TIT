package Detyra;


import java.io.*;
import java.util.Arrays;

public class Mesatarja {

    public static void main(String[] args) throws IOException {
        String inputPath = "input.txt";
        String outputPath = "output.txt";
        String failPath = "fail.txt";

        try {
            BufferedReader input = new BufferedReader(new FileReader(new File(inputPath)));
            FileWriter output = new FileWriter(new File(outputPath));

            int currentLine = 1;

            String line = input.readLine();
            while (line != null) {
                try {
                    line = line.replaceAll("\\s+", "");

                    String[] data = line.split(",");

                    isValidFormat(data);

                    writeDataToFileWithCalculation(data, output);

                } catch (NumberFormatException e) {
                    System.out.println("Rezultati duhet te jete numer: " + e.getMessage());
                    logTo(failPath, line);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    logTo(failPath, line);
                }

                line = input.readLine();
                currentLine++;
            }

            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("Faili nuk u gjet.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeDataToFileWithCalculation(String[] data, FileWriter output) throws IOException {
        String emri = data[0];
        String mbiermi = data[1];
        int kol1 = Integer.parseInt(data[2]);
        int kol2 = Integer.parseInt(data[3]);
        int result = avgOf(kol1, kol2);

        output.write(String.format("%s,%s,%d,%d,%d,%d\n",
                emri, mbiermi, kol1, kol2, result, grade(result)
        ));
    }

    public static int avgOf(int kol1, int kol2) {
        return (kol1 + kol2) / 2;
    }

    public static boolean isValidTestScore(int score) {
        return score >= 0 && score <= 100;
    }

    public static int grade(int score) {
        if (score >= 90) return 10;
        if (score >= 80) return 9;
        if (score >= 70) return 8;
        if (score >= 60) return 7;
        if (score >= 50) return 6;

        return 5;
    }

    public static void isValidFormat(String[] numbers) throws Exception {
        validateLineFormat(numbers);

        String emri = numbers[0];
        String mbiermi = numbers[1];
        int kol1 = Integer.parseInt(numbers[2]);
        int kol2 = Integer.parseInt(numbers[3]);

        validateName(emri, "Emri");
        validateName(mbiermi, "Mbiemri");
        validateTestScore(kol1, "Kolofjumi 1");
        validateTestScore(kol2, "Kolofjumi 2");
    }

    private static void validateLineFormat(String[] numbers) throws Exception {
        if (numbers.length != 4) {
            throw new Exception("Formatimi eshte i gabuar: " + Arrays.toString(numbers));
        }
    }

    private static void validateName(String name, String fieldName) throws Exception {
        if (name.length() < 2 || name.length() > 20) {
            throw new Exception(fieldName + " duhet te jete me i gjate se 2 dhe me i shkurte se 20: " + name);
        }
    }

    private static void validateTestScore(int score, String fieldName) throws Exception {
        if (!isValidTestScore(score)) {
            throw new Exception("Rezultati Invalid per " + fieldName + ": " + score);
        }

    }

    public static void logTo(String failPath, String line) throws IOException {
        FileWriter fail = new FileWriter(new File(failPath), true);
        fail.write(line + "\n");
        fail.close();
    }

    public static void validateLine(String line) {
        line = line.replaceAll("\\s+", "");
    }
}
