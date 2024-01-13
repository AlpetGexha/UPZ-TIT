package Java_8_Ushtrime;

import java.io.*;

public class ShifrimiCezarian {

    public static void main(String[] args) {
        int key = 1;
        StringBuilder c = new StringBuilder();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Java_8_Ushtrime/text.txt"));

            while (reader.ready()) {
                String p = reader.readLine();

                for (int i = 0; i < p.length(); i++) {
                    char pi = p.charAt(i);

                    if (pi >= 'A' && pi <= 'Z')
                        c.append((char) ((pi - 65 + key) % 26 + 65));
                    else if (pi >= 'a' && pi <= 'z')
                        c.append((char) ((pi - 97 + key) % 26 + 97));
                    else
                        c.append(pi);

                }
                c.append("\n");
            }
            reader.close();

            PrintWriter writer = new PrintWriter(new FileWriter("src/Java_8_Ushtrime/text_encrypted.txt"));

            writer.println(c);

            writer.close();
        } catch (IOException e) {
            System.out.println("Gabim gjeneral I/O!");
        }
    }
}