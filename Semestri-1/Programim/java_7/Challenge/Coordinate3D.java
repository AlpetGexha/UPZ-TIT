package java7Loop;

import java.util.Scanner;

public class Coordinate3D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

	while(true){

        System.out.print("Jep vleren e x: ");
        int x = s.nextInt();

        System.out.print("Jep vleren e y: ");
        int y = s.nextInt();

        System.out.print("Jep vleren e z: ");
        int z = s.nextInt();

        if (x > 0 && y > 0 && z > 0) System.out.println("Shtrihet në kuadrantin e parë");

        else if (x < 0 && y > 0 && z > 0) System.out.println("Shtrihet në kuadrantin e dytë");

        else if (x < 0 && y < 0 && z > 0) System.out.println("Shtrihet në kuadrantin e tretë");

        else if (x > 0 && y < 0 && z > 0) System.out.println("Shtrihet në kuadrantin e katërt");

        else if (x > 0 && y > 0 && z < 0) System.out.println("Shtrihet në kuadrantin e pesët");

        else if (x < 0 && y > 0 && z < 0) System.out.println("Shtrihet në kuadrantin e gjashtë");

        else if (x < 0 && y < 0 && z < 0) System.out.println("Shtrihet në kuadrantin e shtatë");

        else if (x > 0 && y < 0 && z < 0) System.out.println("Shtrihet në kuadrantin e tetë");

        else if (x == 0 && y > 0 && z > 0) System.out.println("Shtrihet në boshtin pozitiv y");

        else if (x == 0 && y < 0 && z > 0) System.out.println("Shtrihet në boshtin negativ y");

        else if (y == 0 && x < 0 && z > 0) System.out.println("Shtrihet në boshtin negativ x");

        else if (y == 0 && x > 0 && z > 0) System.out.println("Shtrihet në boshtin pozitiv x");

        else if (z == 0 && x > 0 && y > 0) System.out.println("Shtrihet në boshtin pozitiv z");

        else if (z == 0 && x < 0 && y > 0) System.out.println("Shtrihet në boshtin negativ z");

        else if (x == 0 && y == 0 && z > 0) System.out.println("Shtrihet në boshtin pozitiv z");

        else if (x == 0 && y == 0 && z < 0) System.out.println("Shtrihet në boshtin negativ z");

        else if (x == 0 && y == 0 && z == 0) System.out.println("Qëndron në origjinë");

        System.out.println();

		}
	}
}
