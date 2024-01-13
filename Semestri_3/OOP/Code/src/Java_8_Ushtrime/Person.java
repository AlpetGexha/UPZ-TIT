package Java_8_Ushtrime;

import java.util.GregorianCalendar;

public class Person {

    private final String emri;
    private final String mbiemri;
    private final String ditelindja;
    private String id;

    public Person(String i, String e, String m, String d) {
        id = i;
        emri = e;
        mbiemri = m;
        ditelindja = d;
    }

    public String toString() {
        return id + ", " + emri + ", " + mbiemri + ", " + ditelindja;
    }

    public void shtypTeDhenat() {
        System.out.println(this);
    }

    public int getMosha() {
        //(dd/mm/yyyy)
        String[] dataL = ditelindja.split("/");
        int vitiL = Integer.parseInt(dataL[2]);
        GregorianCalendar g = new GregorianCalendar();

        int vitiA = g.get(GregorianCalendar.YEAR);

        return (vitiA - vitiL);
    }

    public String getId() {
        return id;
    }

    public void setId(String i) {
        id = i;
    }
}

