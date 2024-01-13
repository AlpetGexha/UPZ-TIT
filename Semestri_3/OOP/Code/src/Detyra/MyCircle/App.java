package Detyra.MyCircle;

public class App {

    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);
        System.out.println("Area = " + c1.getArea());
        System.out.println("Circumference = " + c1.getCircumference());

        MyCircle c2 = new MyCircle(2, 3, 5);
        System.out.println(c2);
        System.out.println("Area = " + c2.getArea());
        System.out.println("Circumference = " + c2.getCircumference());

        MyCircle c3 = new MyCircle(new MyPoint(2, 3), 5);
        System.out.println(c3);
        System.out.println("Area = " + c3.getArea());
        System.out.println("Circumference = " + c3.getCircumference());
    }
}
