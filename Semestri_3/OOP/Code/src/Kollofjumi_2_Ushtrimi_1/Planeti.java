package Kollofjumi_2_Ushtrimi_1;

import java.awt.*;
import java.util.ArrayList;

public class Planeti extends TrupatQiellor implements Rrotullohet {
    String emri;
    long perimetri;
    ArrayList<Hena> Henat = new ArrayList<>();

    public Planeti(String emri, long pesha, Pika pozita, long perimetri, ArrayList<Hena> henat) {
        super(pesha, pozita);
        this.emri = emri;
        this.perimetri = perimetri;
        Henat = henat;
    }

    @Override
    public String toString() {
        return "Planeti{" +
                "emri='" + emri + '\'' +
                ", perimetri=" + perimetri +
                ", Henat=" + Henat +
                ", pesha=" + pesha +
                ", pozita=" + pozita +
                '}';
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public long getPerimetri() {
        return perimetri;
    }

    public void setPerimetri(long perimetri) {
        this.perimetri = perimetri;
    }

    public ArrayList<Hena> getHenat() {
        return Henat;
    }

    public void setHenat(ArrayList<Hena> henat) {
        Henat = henat;
    }

    @Override
    public void rrotullohet() {

    }
}
