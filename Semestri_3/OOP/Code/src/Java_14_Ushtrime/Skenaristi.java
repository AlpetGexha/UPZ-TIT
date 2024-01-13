package Java_14_Ushtrime;

public class Skenaristi extends Personi {

    private final int numriFilmave;

    public Skenaristi(String id, String emri, int n) {
        super(id, emri);
        numriFilmave = n;
    }

    @Override
    public String toString() {
        return super.toString() + ", numriFilmave = " + numriFilmave;
    }

    public int getNumriFilmave() {
        return numriFilmave;
    }
}