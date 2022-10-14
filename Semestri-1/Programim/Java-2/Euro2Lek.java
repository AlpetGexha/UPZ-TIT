import java.util.Scanner;

public class Euro2Lek {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double euro;
		int vlera_e_lekut = 122;

		System.out.print("Shkruaj Euron: ");
		euro = s.nextDouble();

		euro = euro * vlera_e_lekut;

		System.out.println(euro + " Lekë");
	}
}
