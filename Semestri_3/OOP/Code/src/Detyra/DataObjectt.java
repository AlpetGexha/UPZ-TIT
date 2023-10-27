package Detyra;

public class DataObjectt {
    private String name;
    private String surname;
    private int kol1;
    private int kol2;

    public DataObjectt(String[] data) {
        this.name = data[0];
        this.surname = data[1];
        this.kol1 = Integer.parseInt(data[2]);
        this.kol2 = Integer.parseInt(data[3]);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getKol1() {
        return kol1;
    }

    public int getKol2() {
        return kol2;
    }
}
