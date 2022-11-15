package java7;

import java.util.Scanner;

public class isOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep numrin: ");
        int numri = s.nextInt();

        boolean isOdd = numri % 2 != 0;

        System.out.println(isOdd);
    }
}
