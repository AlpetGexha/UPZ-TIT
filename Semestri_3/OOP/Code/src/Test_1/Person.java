package Test_1;

public class Person {
    private String mbiemri;
    private String dataELindjes;
    private String ID;
    private String emri;

    public Person(String ID, String emri, String mbiemri, String dataELindjes) {
        this.ID = ID;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.dataELindjes = dataELindjes;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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
        this.emri = mbiemri;
    }

    public String getDataELindjes() {
        return this.dataELindjes;
    }


    public String toString() {
        return String.format("%s, %s, %s",
                this.ID, this.emri, this.mbiemri
        );
    }

    public int getMosha() {
        //  DD MM YYYY
        String[] data = this.dataELindjes.split("/");

        int vitiLindjes = Integer.parseInt(data[2]);
        int vitiAktual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

        return vitiAktual - vitiLindjes;
    }

}
