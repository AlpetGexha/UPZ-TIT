package Java_13_Interfaces;

public class Person {

    protected String emri, mbiemri, adresa;

    public Person(String e, String m, String a) {
        emri = e;
        mbiemri = m;
        adresa = a;
    }

    public String toString() {
        return emri + " " + mbiemri + ", " + adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }
}