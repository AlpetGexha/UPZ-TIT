package Java_9_Kompozimi_Agregacioni;

public class Pika2D {

    private int x, y;

    public Pika2D() {
        x = y = 0;
    }

    public Pika2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distanca(Pika2D p) {
        double dx = Math.pow(this.x - p.getX(), 2);
        double dy = Math.pow(this.y - p.getY(), 2);
        return Math.sqrt(dx + dy);
    }
}