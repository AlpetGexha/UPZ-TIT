package Java_12_Polimorfizmi;

public class Date {

    private final int day;
    private final int month;
    private final int year;

    public Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return day + "." + month + "." + year;
    }
}