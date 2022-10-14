import java.util.Scanner;

public class Albini {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		
//		input
			int NumriIMiqve = 0;
			int SasiaEShisheve = 0;
			int SasiaEGotave = 0;

			int NumriISHisheve = 0;

			System.out.print("Sa është numri i miqëve: ");
			NumriIMiqve = S.nextInt();

			System.out.print("Sa është sasia e shishes(ml): ");
			SasiaEShisheve = S.nextInt();

			System.out.print("Sa është sasia e gotes(ml): ");
			SasiaEGotave = S.nextInt();

//		Proccess
			NumriISHisheve = 1 + (NumriIMiqve / (SasiaEShisheve / SasiaEGotave));

//		Out
		System.out.println("Numir i Shisheve: " + NumriISHisheve);
		}
	}

