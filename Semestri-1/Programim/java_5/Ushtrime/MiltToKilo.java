package java5;

public class MiltToKilo {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Mile to Kilogram: ");
            double mile = new java.util.Scanner(System.in).nextDouble();

            double kilogram = mile * 0.45359237;
            System.out.println(String.format("%s Mile = %.2f Kilogram", mile, kilogram));
        }
    }
}
