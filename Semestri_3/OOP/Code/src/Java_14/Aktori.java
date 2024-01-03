package Java_14;

import java.util.ArrayList;

public class Aktori extends Personi {

    private final ArrayList<Filmi> filmat;

    public Aktori(String id, String emri) {
        super(id, emri);
        filmat = new ArrayList<>();
    }

    public void addFilmi(Filmi f) {
        filmat.add(f);
    }

    public String toString() {
        return super.toString();
    }

    public void printoFilmat() {
        for (Filmi f : filmat)
            System.out.println(f);
    }

    public ArrayList<Filmi> getFilmat() {
        return filmat;
    }
}