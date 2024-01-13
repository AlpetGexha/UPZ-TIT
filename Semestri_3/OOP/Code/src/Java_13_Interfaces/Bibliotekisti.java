package Java_13_Interfaces;

public class Bibliotekisti extends Person {

    private double rroga;

    public Bibliotekisti(String emri, String mbiemri, String adresa, double rroga) {
        super(emri, mbiemri, adresa);
        this.rroga = rroga;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + rroga;
    }

    public double getRroga() {
        return rroga;
    }

    public void setRroga(double rroga) {
        this.rroga = rroga;
    }
}