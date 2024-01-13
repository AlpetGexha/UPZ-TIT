package Kollofjumi_2_Ushtrimi_1;

import java.awt.*;

public class Ylli extends TrupatQiellor {
    String emri;

    public Ylli(long pesha, Pika pozita, String emri) {
        super(pesha, pozita);
        this.emri = emri;
    }

    @Override
    public String toString() {
        return "Ylli{" +
                "emri='" + emri + '\'' +
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
}
