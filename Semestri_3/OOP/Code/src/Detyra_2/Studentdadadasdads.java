package Detyra_2;

class Date {}
 public class Studentdadadasdads {
    public String emri  = "Albana";
    public String mbiemri ;
    public int nota  = 4;
    private Date ditelindja ;
    public String adresa ;
    public boolean isMarried ;
    public ArrayList<String> testing ;
    public static int nrStudenteve ;
    public Studentdadadasdads(String emri, String mbiemri, int nota, Date ditelindja, String adresa, boolean isMarried, ArrayList<String> testing, int nrStudenteven) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.nota = nota;
        this.ditelindja = ditelindja;
        this.adresa = adresa;
        this.isMarried = isMarried;
        this.testing = testing;
        nrStudenteve = nrStudenteven;
    }

    public Studentdadadasdads() {
        this.emri = "";
        this.mbiemri = "";
        this.nota = 0;
        this.ditelindja = "";
        this.adresa = "";
        this.isMarried = false;
        this.testing = "";
        nrStudenteve = 0;
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

    public Date getDitelindja() {
        return this.ditelindja;
    }

    public String getAdresa() {
        return this.adresa;
    }

    public boolean getIsMarried() {
        return this.isMarried;
    }

    public ArrayList<String> getTesting() {
        return this.testing;
    }

    public int getNrStudenteve() {
        return nrStudenteve;
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

    public void setDitelindja(Date ditelindja) {
        this.ditelindja = ditelindja;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public void setTesting(ArrayList<String> testing) {
        this.testing = testing;
    }

    public void setNrStudenteve(int nrStudenteven) {
        nrStudenteve = nrStudenteven;
    }


    public String toString() {
        return
                "emri: " + this.emri +
                "mbiemri: " + this.mbiemri +
                "nota: " + this.nota +
                "ditelindja: " + this.ditelindja +
                "adresa: " + this.adresa +
                "isMarried: " + this.isMarried +
                "testing: " + this.testing +
                "nrStudenteve: " + nrStudenteve +
                "";
    }
}