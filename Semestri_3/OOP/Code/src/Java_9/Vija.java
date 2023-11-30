package Java_9;

public class Vija {

    private Pika2D p1, p2;

    public Vija() {
        p1 = p2 = null;
    }

    public Vija(Pika2D p1, Pika2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Vija(int x1, int y1, int x2, int y2) {
        this.p1 = new Pika2D(x1, y1);
        this.p2 = new Pika2D(x2, y2);
    }

    public Pika2D getP1() {
        return p1;
    }

    public void setP1(Pika2D p1) {
        this.p1 = p1;
    }

    public Pika2D getP2() {
        return p2;
    }

    public void setP2(Pika2D p2) {
        this.p2 = p2;
    }

    public String toString() {
        return "P1" + p1 + "\nP2" + p2;
    }

    public double gjatesia() {
        return p1.distanca(p2);
    }

    public void shtypGjatesine() {
        System.out.printf("Gjatesia = %.2f%n", gjatesia());
    }
}