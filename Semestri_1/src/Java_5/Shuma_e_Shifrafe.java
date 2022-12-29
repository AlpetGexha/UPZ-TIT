package Java_5;

public class Shuma_e_Shifrafe {

	public static void main(String[] args) {

		int n = 42957; // Numri i inputit
		int temp = n; // Numri i inputit temp

		final int r = 10; // Pjesohet me 10
		int p = 10000; // Per numrin 5 shifror
		int acc = 0; // Rezultati
		int sh = 0; // Shuma per numer

		int numri_i_vogel = n; // numri ne rastin ton eshte 42957

		sh = n / p;
		n %= p;
		p /= r;
		acc += sh;
//		per ta barazuar numrin e vogel me shifren e pare numri i vogel duhet te jepet patjeter me i madh si shifer e pare 
		if (numri_i_vogel > sh)
			numri_i_vogel = sh;

		sh = n / p;
		n %= p;
		p /= r;
		acc += sh;
		if (numri_i_vogel > sh)
			numri_i_vogel = sh;

		sh = n / p;
		n %= p;
		p /= r;
		acc += sh;
		if (numri_i_vogel > sh)
			numri_i_vogel = sh;

		sh = n / p;
		n %= p;
		p /= r;
		acc += sh;
		if (numri_i_vogel > sh)
			numri_i_vogel = sh;

		sh = n / p;
		n %= p;
		p /= r;
		acc += sh;
		if (numri_i_vogel > sh)
			numri_i_vogel = sh;

//
//		for (int i = 0; i < 5; i++) {
//			sh = n / p;
//			n %= p;
//			p /= r;
//			acc += sh;
//			if (numri_i_vogel > sh) {
//				numri_i_vogel = sh;
//			}
////			System.out.println(acc);
////			System.out.println(sh);
//		}

		System.out.println("Shifra me e vogel e numrit " + temp + " eshte: " + numri_i_vogel);

	}

}

