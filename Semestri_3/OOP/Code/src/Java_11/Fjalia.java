package Java_11;

import java.util.ArrayList;

public class Fjalia extends Teksti {

    private final ArrayList<Fjala> fjalet;

    public Fjalia() {
        super();
        fjalet = new ArrayList<Fjala>();
    }

    public String toString() {
        return fjalet.toString();
    }

    public ArrayList<Fjala> getFjalet() {
        return fjalet;
    }

    public void addFjalen(Fjala fjala) {
        fjalet.add(fjala);
        gjatesia += fjala.gjatesia;
    }

    public boolean removeFjalen(Fjala fjala) {
        for (Fjala f : fjalet) {
            if (f.equals(fjala)) {
                fjalet.remove(fjala);
                gjatesia -= fjala.gjatesia;

                return true;
            }
        }

        return false;
    }

    public void ndryshoGjatesineFjales(int gjatesiaNdryshuar) {
        gjatesia -= gjatesiaNdryshuar;
    }
}