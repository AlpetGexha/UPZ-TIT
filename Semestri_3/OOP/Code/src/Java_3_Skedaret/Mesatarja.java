package Java_3_Skedaret;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Mesatarja {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("src/Java_3_Skedaret/ints.txt")
            );
            int shuma = 0, count = 0;

            while (reader.ready()) {
                String rreshti = reader.readLine();
                if (rreshti.equals(""))
                    continue;
                String[] vargu = rreshti.split(" ,.");
                for (int i = 0; i < vargu.length; i++) {
                    try {
                        int vlera = Integer.parseInt(vargu[i]);
                        shuma += vlera;
                        count++;
                    } catch (NumberFormatException n) {
                        System.out.println("Nuk mund te konvertohet String ne int!");
                    }
                }
            }
            reader.close();
            if (count != 0) {
                double mesatarja = (double) shuma / count;
                System.out.println("Mesatarja = " +
                        String.format("%.2f", mesatarja));
            } else {
                System.out.println("Nuk ka pasur asnje numer ne fajllin hyres!");
            }

        } catch (FileNotFoundException f) {
            System.out.println("Ky fjall nuk u gjet!");
        } catch (IOException i) {
            System.out.println("Gabim ne I/O!");
        }
    }
}

