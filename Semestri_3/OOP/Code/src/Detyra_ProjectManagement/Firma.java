package Detyra_ProjectManagement;

import java.util.ArrayList;

public class Firma {
    String emri;
    ArrayList<Puntori> punetoret;

    public Firma(String emri, ArrayList<Puntori> punetoret) {
        this.emri = emri;
        this.punetoret = punetoret;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public ArrayList<Puntori> getPunetoret() {
        return punetoret;
    }

    public void setPunetoret(ArrayList<Puntori> punetoret) {
        this.punetoret = punetoret;
    }

    @Override
    public String toString() {
        return String.format("Firma: %s\nPunetoret: %s\n", emri, punetoret);
    }

}
