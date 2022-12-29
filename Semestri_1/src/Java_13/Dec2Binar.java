package Java_13;

import java.util.Scanner;

public class Dec2Binar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Shkruani nje numer: ");
        int number = s.nextInt();

        String binar = dec2binar(number);

        System.out.printf("Numri %d ne binar eshte %s\ndhe ka %d 0-ro%n", number, binar, countZero(binar));
    }

    public static String dec2binar(int number) {
        String binar = "";

        while (number > 0) {
            binar = number % 2 + binar;
            number /= 2;
        }

        return binar;
    }

    //count how many 0 have binary number
    public static int countZero(int number) {
        int counter = 0;

        while (number > 0) {
            if (number % 2 == 0) counter++;

            number /= 2;
        }

        return counter;
    }

    public static int countZero(String number) {
        int counter = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '0') counter++;
        }

        return counter;
    }
}
