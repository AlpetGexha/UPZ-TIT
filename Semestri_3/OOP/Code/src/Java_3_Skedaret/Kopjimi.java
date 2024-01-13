package Java_3_Skedaret;

import java.io.*;

public class Kopjimi {

    public static void main(String[] args) {
        try {
            //hapja e fajllit hyres (per lexim)
            BufferedReader reader = new BufferedReader(
                    new FileReader("src/Java_3_Skedaret/input.txt"));
            //hapja e fajllit dales (per shkrim)
            PrintWriter writer = new PrintWriter(
                    new FileWriter("src/Java_3_Skedaret/.txt"));
            //lexojme perderisa fajlli hyres ka rreshta
            while (reader.ready()) {
                String rreshti = reader.readLine(); //leximi per rresht (String)
                writer.println(rreshti); //shkrimi direkt (kopjimi) ne fajllin dales
            }
            reader.close(); //mbyllja e fajllit hyres
            writer.close(); //mbyllja e fajllit dales
        }
        //trajtimi i perjashtimeve IO
        catch (FileNotFoundException f) {
            System.out.println("Fajlli nuk u gjet!");
        } catch (IOException i) {
            System.out.println("Gabim gjeneral I/O");
        }
    }
}