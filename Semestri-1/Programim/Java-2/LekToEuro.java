import java.util.Scanner;

public class LekToEuro {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double lek;
		double vlera_e_lek = 118;

		System.out.print("Shkruaj Lek: ");
		lek = s.nextInt();

		double result = lek / vlera_e_lek;

		System.out.println(result + " Euro");
	}
}
