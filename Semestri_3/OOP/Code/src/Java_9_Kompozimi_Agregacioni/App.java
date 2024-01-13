package Java_9_Kompozimi_Agregacioni;

public class App {
    public static void main(String[] args) {
        Pika2D p1 = new Pika2D(8, 5);
        Pika2D p2 = new Pika2D(3, -9);

        Vija v1 = new Vija(p1, p2);
        System.out.println(v1);
        System.out.println("Distanca = " + v1.gjatesia());
        v1.shtypGjatesine();


        Vija v2 = new Vija(0, -1, 2, 6);
        System.out.println(v2);
        v2.shtypGjatesine();

        Vija v3 = new Vija(
                new Pika2D(6, 9),
                new Pika2D(-5, 11)
        );
        v3.shtypGjatesine();
    }
}