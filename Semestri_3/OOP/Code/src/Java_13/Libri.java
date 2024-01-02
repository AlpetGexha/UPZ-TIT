package Java_13;

public class Libri implements LibriInterface {

    private final String ISBN;
    private final String titulli;
    private final String autori;
    private int numriKopjeve;

    public Libri(String i, String t, String a, int n) {
        ISBN = i;
        titulli = t;
        autori = a;
        numriKopjeve = n;
    }

    public String toString() {
        return ISBN + ", " + titulli + ", " + autori + ", "
                + numriKopjeve;
    }

    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o instanceof Libri l) {
			return this.ISBN.equals(l.ISBN);
        }
        return false;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }

    @Override
    public String getTitulli() {
        return titulli;
    }

    @Override
    public String getAutori() {
        return autori;
    }

    @Override
    public int getNumriKopjeve() {
        return numriKopjeve;
    }

    @Override
    public void setNumriKopjeve(int n) {
        numriKopjeve = n;
    }
}