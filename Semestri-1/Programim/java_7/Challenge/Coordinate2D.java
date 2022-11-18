package java7Loop;

import java.util.Scanner;

public class Coordinate2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Jep vleren e x: ");
            int x = s.nextInt();

            System.out.print("Jep vleren e y: ");
            int y = s.nextInt();

            if (x > 0 && y > 0) System.out.println("Shtrihet në kuadrantin e parë");

            else if (x < 0 && y > 0) System.out.println("Shtrihet në kuadrantin e dytë");

            else if (x < 0 && y < 0) System.out.println("Shtrihet në kuadrantin e tretë");

            else if (x > 0 && y < 0) System.out.println("Shtrihet në kuadrantin e katërt");

            else if (x == 0 && y > 0) System.out.println("Shtrihet në boshtin pozitiv y");

            else if (x == 0 && y < 0) System.out.println("Shtrihet në boshtin negativ y");

            else if (y == 0 && x < 0) System.out.println("Shtrihet në boshtin negativ x");

            else if (y == 0 && x > 0) System.out.println("Shtrihet në boshtin pozitiv x");

            else System.out.println("Qëndron në origjinë");

            System.out.println();
        }
    }
}
