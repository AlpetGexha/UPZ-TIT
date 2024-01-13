package Java_5_Class;

public class App {

    public static void main(String[] args) {
        Katerkendeshi k1 = new Katerkendeshi(20.2, 15.7);
        double p = k1.perimetri();
        System.out.println("Perimetri = " + p);
        System.out.println("Siperfaqja = " + k1.siperfaqja());

        k1.setB(19.2);
        p = k1.perimetri();
        System.out.println("Perimetri = " + p);
        System.out.println("Siperfaqja = " + k1.siperfaqja());

        Katerkendeshi k2 = new Katerkendeshi();
        System.out.println("a = " + k2.getA());

        k2.setA(7.2);
        k2.setB(9.5);
        System.out.println("a = " + k2.getA());
        System.out.println("b = " + k2.getB());

        System.out.println(k1); //a = 20.2, b = 19.2
        System.out.println(k1);
    }
}