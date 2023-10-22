import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Kopjimi {

	public static void main(String[] args) {
		try {
			//hapja e fajllit hyres (per lexim)
			BufferedReader reader = new BufferedReader(
				new FileReader("input.txt"));
			//hapja e fajllit dales (per shkrim)
			PrintWriter writer = new PrintWriter(
					new FileWriter("output.txt"));
			//lexojme perderisa fajlli hyres ka rreshta
			while(reader.ready()) {
				String rreshti = reader.readLine(); //leximi per rresht (String)
				writer.println(rreshti); //shkrimi direkt (kopjimi) ne fajllin dales
			}
			reader.close(); //mbyllja e fajllit hyres
			writer.close(); //mbyllja e fajllit dales
		}
		//trajtimi i perjashtimeve IO
		catch(FileNotFoundException f) {
			System.out.println("Fajlli nuk u gjet!");
		}
		catch(IOException i) {
			System.out.println("Gabim gjeneral I/O");
		}
	}
}