package Java_13;

import java.util.ArrayList;

public class Klienti extends Person {

    private static long num = 0;
    private final long id;
    private final ArrayList<LibriInterface> libratRezervuar;

    public Klienti(String emri, String mbiemri, String adresa) {
        super(emri, mbiemri, adresa);
        id = ++num;
        libratRezervuar = new ArrayList<>();
    }

    public String toString() {
        return id + ", " + super.toString() + ", " + libratRezervuar;
    }

    public long getId() {
        return id;
    }

    public boolean rezervoLibrin(LibriInterface l) {
        if (l.getNumriKopjeve() == 0)
            return false;
        for (LibriInterface l1 : libratRezervuar) {
            if (l1.equals(l))
                return false;
        }
        libratRezervuar.add(l);
        l.setNumriKopjeve(l.getNumriKopjeve() - 1);
        return true;
    }

    public boolean ktheLibrin(LibriInterface l) {
        for (LibriInterface l1 : libratRezervuar) {
            if (l1.equals(l)) {
                libratRezervuar.remove(l);
                l.setNumriKopjeve(l.getNumriKopjeve() + 1);
                return true;
            }
        }
        return false;
    }
}









