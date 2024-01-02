package Java_13;

public class App {

	public static void main(String[] args) {
		Libri l1 = new Libri("12ABC", "Darka e gabuar", "Ismail Kadare", 3);
		Libri l2 = new Libri("123AB", "Xha Gorio", "Honore De Balzak", 1);
		
		Klienti k1 = new Klienti("Fitore", "Berisha", "Rruga e shkronjave");
		Klienti k2 = new Klienti("Fisnik", "Kryeziu", "Rruga Ismet Jashari");
		
		System.out.println("rezervim: " + k1.rezervoLibrin(l1));
		System.out.println("rezervim: " + k1.rezervoLibrin(l1));
		System.out.println("rezervim: " + k1.rezervoLibrin(l2));
		System.out.println(k1);
		
		System.out.println("rezervim: " + k2.rezervoLibrin(l1));
		System.out.println("rezervim: " + k2.rezervoLibrin(l2));
		System.out.println(k2);
		
		System.out.println("kthim: " + k1.ktheLibrin(l2));
		System.out.println(l2);
		
		System.out.println("kthim: " + k2.ktheLibrin(l2));
		System.out.println("rezervim: " + k2.rezervoLibrin(l2));
		System.out.println(k2);
	}
}