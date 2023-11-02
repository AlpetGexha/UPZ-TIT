package Detyra_2;

public class Studentdadadasdads {
    public static int nrStudenteve;
    public String emri = "Albana";
    public String mbiemri;
    public int nota = 4;
    public String adresa;
    public boolean isMarried;
    private String ditelindja;

    public Studentdadadasdads(String emri, String mbiemri, int nota, String ditelindja, String adresa, boolean isMarried, int nrStudenteven) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.nota = nota;
        this.ditelindja = ditelindja;
        this.adresa = adresa;
        this.isMarried = isMarried;
        nrStudenteve = nrStudenteven;
    }

    public Studentdadadasdads() {
        this.emri = "";
        this.mbiemri = "";
        this.nota = 0;
        this.ditelindja = "";
        this.adresa = "";
        this.isMarried = false;
        nrStudenteve = 0;
    }

    public String getEmri() {
        return this.emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return this.mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getNota() {
        return this.nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDitelindja() {
        return this.ditelindja;
    }

    public void setDitelindja(String ditelindja) {
        this.ditelindja = ditelindja;
    }

    public String getAdresa() {
        return this.adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public boolean getIsMarried() {
        return this.isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public int getNrStudenteve() {
        return nrStudenteve;
    }

    public void setNrStudenteve(int nrStudenteven) {
        nrStudenteve = nrStudenteven;
    }
}
