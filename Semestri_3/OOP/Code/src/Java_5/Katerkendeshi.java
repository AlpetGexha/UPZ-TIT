package Java_5;

public class Katerkendeshi {

    //variablat
    private double a, b;

    //konstruktori(et)
    //pa parametra
    public Katerkendeshi() {
        a = 0.0;
        b = 0.0;
    }

    //me parametra
//	public Katerkendeshi(double a, double b) {
//		this.a = a;
//		this.b = b;
//	}

    public Katerkendeshi(double x, double y) {
        a = x;
        b = y;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double perimetri() {
        return 2 * (a + b);
    }

    public double siperfaqja() {
        return a * b;
    }

    public String toString() {
        return "a = " + a + ", b = " + b;
    }
}