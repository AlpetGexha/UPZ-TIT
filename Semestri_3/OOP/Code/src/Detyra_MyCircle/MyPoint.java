package Detyra_MyCircle;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = y = 0;
    }

    public MyPoint(int x, int y) {
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


    public double distance(int x, int y) {
        double dx = Math.pow(this.x - x, 2);
        double dy = Math.pow(this.y - y, 2);
        return Math.sqrt(dx + dy);
    }

    public double distance(MyPoint another) {
        double dx = Math.pow(this.x - another.getX(), 2);
        double dy = Math.pow(this.y - another.getY(), 2);
        return Math.sqrt(dx + dy);
    }
}
