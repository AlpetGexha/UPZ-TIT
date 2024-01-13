package Java_2_Exceptions;

import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Jepni piket e provimit te ndara me presje: "); //"1,2,a,4,5"
		String piket = s.nextLine();

		String [] piketVarg = piket.split(","); //{"1", "2", "a", ...}
		int [] piketProv = new int[piketVarg.length];
		
		try {
			for(int i = 0; i < piketVarg.length; i++)
				piketProv[i] = Integer.parseInt(piketVarg[i]); //"1"->1, number format exception
			//piketProv = {1, 2, 3, 4, 5}

			double avg;
			int sum = 0;

			for(int i = 0; i < piketProv.length; i++)
				sum += piketProv[i];

			avg = (double)sum / piketProv.length;
			System.out.println("Mesatarja: " + avg);
		}
		catch(NumberFormatException n) {
			//kodi per trajtimin e gabimit NumberFormatException
			System.out.println("Nuk mund te realizohet konvertimi i String->int");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			//kodi per trajtimin e gabimit ArrayIndexOutOfBoundsException
			System.out.println("Ke tejkaluar kufinjte e vargut");
		}
		catch(Exception e) {
			//kodi per trajtimin e gabimeve gjenerale
			System.out.println("Gabim gjeneral");
		}
		finally {
			System.out.println("Ekzekutimi do te arrije ne kete pike");
		}
		System.out.println("Programi perfundoi");
	}
}