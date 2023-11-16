package Data;

public class App {

	public static void main(String[] args) {
		Data d1 = new Data(16, 11, 2023);
		System.out.println(d1);
		d1.shtypDaten();

		Data d2 = new Data(17, 2, 2008);
		d2.shtypDaten();

		Data d3 = new Data(1, 1, 2024);
		System.out.println(d3);

		Data d4 = new Data(29, 13, -2);
		System.out.println(d4);
	}
}