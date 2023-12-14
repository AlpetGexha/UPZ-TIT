package Java_11;

public class App {

    public static void main(String[] args) {
        Fjala f1 = new Fjala("pershendetje");
        Fjala f2 = new Fjala("nga");
        Fjala f3 = new Fjala("JAVA");

        Fjalia ff1 = new Fjalia();
        ff1.addFjalen(f1);
        ff1.addFjalen(f2);
        ff1.addFjalen(f3);

        System.out.println(ff1);
        System.out.println("gjatesia e fjalise = " + ff1.getGjatesia());
        System.out.println("remove fjalen: " + ff1.removeFjalen(f2));
        System.out.println(ff1);

        System.out.println("remove fjalen: " + ff1.removeFjalen(f2));
        System.out.println(ff1);

        System.out.println("fjalet: " + ff1.getFjalet());
        System.out.println("gjatesia e fjalise = " + ff1.getGjatesia());

        int gjatesiaNdryshuar = f1.setPermbajtja("Hello");
        ff1.ndryshoGjatesineFjales(gjatesiaNdryshuar);

        System.out.println("gjatesia e fjales = " + f1.getGjatesia());
        System.out.println(ff1);
        System.out.println("gjatesia e fjalise = " + ff1.getGjatesia());
    }
}