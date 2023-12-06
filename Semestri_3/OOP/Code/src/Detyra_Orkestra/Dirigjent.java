package Detyra_Orkestra;

public class Dirigjent extends Person {
    private String titulli;

    public Dirigjent(String emri, int mosha, String titulli) {
        super(emri, mosha);
        this.titulli = titulli;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public String toString() {
        return "Titulli: " + titulli + ", " + super.toString();
    }


}
