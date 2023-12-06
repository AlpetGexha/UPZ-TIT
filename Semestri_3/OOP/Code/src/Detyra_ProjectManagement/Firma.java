package Detyra_ProjectManagement;

import java.util.ArrayList;

public class Firma {
    String emri;
    ArrayList<Punotri> punetoret;

    @Override
    public String toString() {
        return "Firma{" +
                "emri='" + emri + '\'' +
                ", punetoret=" + punetoret +
                '}';
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public ArrayList<Punotri> getPunetoret() {
        return punetoret;
    }

    public void setPunetoret(ArrayList<Punotri> punetoret) {
        this.punetoret = punetoret;
    }

    public Firma(String emri, ArrayList<Punotri> punetoret) {
        this.emri = emri;
        this.punetoret = punetoret;
    }
}
