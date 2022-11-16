package java7;

import java.util.Scanner;

public class Kalkulatori {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep nje numer te plot: ");
        int a = s.nextInt();

        System.out.print("Jep edhe nje numer te plot: ");
        int b = s.nextInt();

        System.out.print("Jep nje operator (+, -, *, /): ");
        char operator = s.next().charAt(0);

        int result = 0;

        if (operator == '+')
            result = a + b;


        else if (operator == '-')
            result = a - b;


        else if (operator == '*')
            result = a * b;


        else if (operator == '/')
            result = a / b;

        else
            System.out.println("Operatori i dhene nuk eshte valid");


        /*
        *  int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        * */

        System.out.println("Rezultati eshte: " + result);

    }
}
