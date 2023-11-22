package Java_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nota = 0, sum = 0, n = 0;
		System.out.print("Jepni noten (-1 per daljen): ");
		try {
			nota = s.nextInt(); //InputMismatchException
			while(nota != -1) {
				sum += nota;
				n++;
				System.out.print("Jepni noten (-1 per daljen): ");
				nota = s.nextInt(); //InputMismatchException
			}
			double avg = sum / n; //0/0 -> ArithmeticException
			System.out.println("Mesatarja e klases: " + avg);
		}
		catch(InputMismatchException i) {
			System.out.println("Gabim ne hyrje!");
		}
		catch(ArithmeticException a) {
			System.out.println("Gabim aritmetikor!");
		}
		catch(Exception e) {
			System.out.println("Gabim i pergjithshem!");
		}
		finally {
			System.out.println("Ekzekutimi do te arrije ne kete pike");
		}
		System.out.println("Fund");
	}
}