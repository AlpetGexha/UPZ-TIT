package Java_7;

public class Libri {
    private final String titulli;
    private final String autori;
    private final String publikuesi;
    private final String kategoria;
    private final int numriFaqeve;

    public Libri(String titulli, String autori, String publikuesi, String kategoria, int numriFaqeve) {
        this.titulli = titulli;
        this.autori = autori;
        this.publikuesi = publikuesi;
        this.kategoria = kategoria;
        this.numriFaqeve = numriFaqeve;
    }

    public String getTitulli() {
        return this.titulli;
    }

    public String getAutori() {
        return this.autori;
    }

    public String getPublikuesi() {
        return this.publikuesi;
    }

    public String getKategoria() {
        return this.kategoria;
    }

    public int getNumriFaqeve() {
        return this.numriFaqeve;
    }

    public double llogartiCmimin() {
        return 5 + 0.03 * this.numriFaqeve;
    }

    public String inicialet() {
        String[] inicialet = this.autori.split(" ");
        String inicialetAutorit = "";

        for (String inicialetAutori : inicialet) {
            inicialetAutorit += inicialetAutori.charAt(0) + ". ";
        }

        return inicialetAutorit;
    }

    @Override
    public String toString() {
        return String.format(
                "Titulli: %s\nAutori: %s\nPublikuesi: %s\nKategoria: %s\nNumri i faqeve: %d\nCmimi: %.2f",
                this.titulli, this.autori, this.publikuesi, this.kategoria, this.numriFaqeve, this.llogartiCmimin(), this.inicialet()
        );
    }

    public void shtypTeDhenate() {
        System.out.println(this);
    }

}
