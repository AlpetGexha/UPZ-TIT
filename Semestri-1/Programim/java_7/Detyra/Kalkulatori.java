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
        String operator = s.next();

        int result = 0;

        if (operator.equals("+")) {
            result = a + b;
        }

        else if (operator.equals("-")) {
            result = a - b;
        }

        else if (operator.equals("*")) {
            result = a * b;
        }

        else if (operator.equals("/")) {
            result = a / b;
        }

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
