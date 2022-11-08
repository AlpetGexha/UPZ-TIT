package java6;

import java.util.Scanner;

public class NumriDisarium {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep Numrin: ");
        int n = s.nextInt();

        int shifra1 = n / 100;
        int shifra2 = (n / 10) % 10;
        int shifra3 = n % 10;

        int sum = (int) (Math.pow(shifra1, 1) + Math.pow(shifra2, 2) + Math.pow(shifra3, 3));

        String res = (n == sum) ? " është disarium" : " nuk është disarium";

        System.out.println(String.format("Numri %d %s", n, res));
    }
}
