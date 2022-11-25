package java8;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
//    int n = 123;
        Scanner s = new Scanner(System.in);
        while (true) {
            String muaji = "i pa njohur";
            System.out.print("Jep numrin: ");
            int n = s.nextInt();

//        get month
            switch (n) {
                case 1:
                    muaji = "Janar";
                    break;
                case 2:
                    muaji = "Shkurt";
                    break;
                case 3:
                    muaji = "Mars";
                    break;
                case 4:
                    muaji = "Prill";
                    break;
                case 5:
                    muaji = "Maj";
                    break;
                case 6:
                    muaji = "Qershor";
                    break;
                case 7:
                    muaji = "Korrik";
                    break;
                case 8:
                    muaji = "Gusht";
                    break;
                case 9:
                    muaji = "Shtator";
                    break;
                case 10:
                    muaji = "Tetor";
                    break;
                case 11:
                    muaji = "Nentor";
                    break;
                case 12:
                    muaji = "Dhjetor";
                    break;
//                default:
//                    muaji = "i pa njohur";
            }

            System.out.println(muaji);
            System.out.println();

        }
    }
}
