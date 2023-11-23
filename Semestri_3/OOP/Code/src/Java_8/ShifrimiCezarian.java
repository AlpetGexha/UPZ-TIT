package Java_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ShifrimiCezarian {

	public static void main(String[] args) {
		int key = 1;
		StringBuilder c = new StringBuilder();

		try {
			BufferedReader reader = new BufferedReader(new FileReader("text.txt"));

			while(reader.ready()) {
				String p = reader.readLine();

				for(int i = 0; i < p.length(); i++) {
					char pi = p.charAt(i);

					if(pi >= 'A' && pi <= 'Z')
						c.append((char) ((pi - 65 + key) % 26 + 65));
					else if(pi >= 'a' && pi <= 'z')
						c.append((char) ((pi - 97 + key) % 26 + 97));
					else
						c.append(pi);

				}
				c.append("\n");
			}
			reader.close();
			
			PrintWriter writer = new PrintWriter(new FileWriter("text_encrypted.txt"));

			writer.println(c);

			writer.close();
		}
		catch(IOException e) {
			System.out.println("Gabim gjeneral I/O!");
		}
	}
}