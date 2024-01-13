package Kollofjumi_2_Ushtrimi_1;

import java.awt.*;

public class Hena extends TrupatQiellor implements Rrotullohet {
    String emri;
    Color color;

    public Hena(String emri, Color color, long pesha, Pika pozita) {
        super(pesha, pozita);
        this.emri = emri;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Hena{" +
                "emri='" + emri + '\'' +
                ", color=" + color +
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void rrotullohet() {

    }
}
