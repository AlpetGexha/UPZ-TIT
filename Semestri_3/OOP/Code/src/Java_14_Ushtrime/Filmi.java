package Java_14_Ushtrime;

import java.util.ArrayList;

public class Filmi {

    private final String emri;
    private final Regjisori regjisori;
    private final ArrayList<Skenaristi> skenaristet;
    private final ArrayList<Aktori> aktoret;

    public Filmi(String e, Regjisori r,
                 ArrayList<Skenaristi> s, ArrayList<Aktori> a) {
        emri = e;
        regjisori = r;
        skenaristet = s;
        aktoret = a;
    }

    public String toString() {
        return "Emri: " + emri + ", Regjisori: " + regjisori
                + "Skenaristet: " + skenaristet
                + "Aktoret: " + aktoret;
    }

    public String getEmri() {
        return emri;
    }

    public Regjisori getRegjisori() {
        return regjisori;
    }

    public ArrayList<Skenaristi> getSkenaristet() {
        return skenaristet;
    }

    public ArrayList<Aktori> getAktoret() {
        return aktoret;
    }
}