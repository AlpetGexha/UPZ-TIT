package Java_14;

public class Personi {

    protected String id, emri;

    public Personi(String i, String e) {
        id = i;
        emri = e;
    }

    public String toString() {
        return id + ", " + emri;
    }

    public String getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }
}