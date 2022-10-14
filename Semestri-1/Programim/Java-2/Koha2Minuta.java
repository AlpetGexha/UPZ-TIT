import java.util.Scanner;

public class Koha2Minuta {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		int koha;
		
		System.out.print("Shkruaj oren: ");
		koha = s.nextInt();
		
		koha = koha * 60;
		
		System.out.println(koha + " Minuta");
	
	}
}
