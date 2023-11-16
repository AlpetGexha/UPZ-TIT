package Java_6;

public class LlogariaBankare {
	
	//variablat
	private String numri;
	private String personi;
	private double bilanci;
	private final double MAX = 5000;
	
	//konstruktoret
	public LlogariaBankare() {
		numri = "i panjohur";
		personi = "i panjohur";
		bilanci = 0.0;
	}
	
	public LlogariaBankare(String n, String p, double b) {
		numri = n;
		personi = p;
		bilanci = b;
	}
	
	//metodat
	
	public String getNumri() {
		return numri;
	}
	
	public String getPersoni() {
		return personi;
	}
	
	public double getBilanci() {
		return bilanci;
	}
	
	public String toString() {
		return "Numri i llogarise bankare: " + numri 
				+ "\nEmri dhe mbiemri: " + personi 
				+ "\nBilanci: " + bilanci;
	}
	
	public boolean terheqje(double shuma) {
		if(shuma <= bilanci && shuma <= MAX) {
			bilanci = bilanci - shuma;
			return true;
		}
		return false;
	}
	
	public boolean deponim(double shuma) {
		if(shuma <= MAX) {
			bilanci = bilanci + shuma;
			return true;
		}
		return false;
	}
	
	public boolean transfer(double shuma, String numriLlogarise) {
		if(shuma <= bilanci && shuma <= MAX) {
			bilanci = bilanci - shuma;
			return true;
		}
		return false;
	}
	
	public void shikoBilancin() {
		System.out.println("Gjendja aktuale ne llogarine "
				+ "bankare eshte: " 
				+ String.format("%.3f", bilanci) + " euro");
	}
}