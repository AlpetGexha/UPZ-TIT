package Detyra_2;

public class Student {
    public String emri;
    public String mbiemri;
    public int nota;
    private String ditelindja;
    public String adresa;
    public boolean isMarried;
    public int nrStudenteve = 5;
    public Student(String emri, String mbiemri, int nota, String ditelindja, String adresa, boolean isMarried, int nrStudenteve) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.nota = nota;
        this.ditelindja = ditelindja;
        this.adresa = adresa;
        this.isMarried = isMarried;
        this.nrStudenteve = nrStudenteve;
    }
    public Student() {
        this.emri = "";
        this.mbiemri = "";
        this.nota = 0;
        this.ditelindja = "";
        this.adresa = "";
        this.isMarried = false;
        this.nrStudenteve = 0;
}

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setDitelindja(String ditelindja) {
        this.ditelindja = ditelindja;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public void setNrStudenteve(int nrStudenteve) {
        this.nrStudenteve = nrStudenteve;
    }

    public String getEmri() {
        return this.emri;
    }

    public String getMbiemri() {
        return this.mbiemri;
    }

    public int getNota() {
        return this.nota;
    }

    public String getDitelindja() {
        return this.ditelindja;
    }

    public String getAdresa() {
        return this.adresa;
    }

    public boolean getIsMarried() {
        return this.isMarried;
    }

    public int getNrStudenteve() {
        return this.nrStudenteve;
    }
}
