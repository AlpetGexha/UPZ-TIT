package Detyra_Orkestra;

public class Muzikant extends Person {
    private String instrumenti;

    public Muzikant(String emri, int mosha, String instrumenti) {
        super(emri, mosha);
        this.instrumenti = instrumenti;
    }

    public String getInstrumenti() {
        return instrumenti;
    }

    public void setInstrumenti(String instrumenti) {
        this.instrumenti = instrumenti;
    }

    public String toString() {
        return "Instrumenti: " + instrumenti + " " + super.toString() + " ";
    }
}
