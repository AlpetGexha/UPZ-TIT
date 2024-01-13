package Java_14_Ushtrime;

public class Regjisori extends Personi {

    private final int numriFilmave;

    public Regjisori(String id, String emri, int n) {
        super(id, emri);
        numriFilmave = n;
    }

    public String toString() {
        return super.toString() + ", numri i filmave = "
                + numriFilmave;
    }

    public int getNumriFilmave() {
        return numriFilmave;
    }
}