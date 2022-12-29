package Java_5;

import java.util.Scanner;

public class Sfera {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Jep rrenjen e sferes: ");
        int r = s.nextInt();

        double V = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double A = Math.PI * Math.pow(r, 2);

        System.out.println(String.format("V = %.2f \nA = %.2f", V, A));

    }
}
