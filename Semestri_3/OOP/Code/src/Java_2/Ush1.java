import java.util.*;

public class Ush1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in); 
    	String str1 = "10";
    	int x = Integer.parseInt(str1);
		try {
			int a = s.nextInt(); //input mismatch exception
			System.out.println(x/a); //arithmetic exception
		}
		catch(InputMismatchException i) {
			//kodi per trajtimin e gabimit InputMismatchException
			System.out.println("Hyrje jo kompatibile!");
		}
		catch(ArithmeticException a) {
			//kodi per trajtimin e gabimit ArithmeticException
			System.out.println("Nuk mund te pjesetohet me zero!");
		}
		String str2 = "ten";
		try {
			int y = Integer.parseInt(str2);
		}
		catch(NumberFormatException n) {
			System.out.println("Nuk mund te konvertohet ne int!");
		}
		System.out.println("Fund!");
	}
}