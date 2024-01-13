package Kollofjumi_1_Ushtrime_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nota = 0, sum = 0, n = 0;

        try {
            System.out.print("Jepni noten (-1 per daljen): ");
            nota = s.nextInt();

            while (nota != -1) {
                sum += nota;
                n++;
                System.out.print("Jepni noten (-1 per daljen): ");
                nota = s.nextInt();
            }

            double avg = sum / n;
            System.out.println("Mesatarja e klases: " + avg);

        } catch (InputMismatchException e) {
            System.out.println("Input ");
        } catch (ArithmeticException e) {
            System.out.println("0 dsa ");
        } catch (Exception e) {
            System.out.println("gabim i pergjigjshem");
        } finally {
            System.out.println("u ex");
        }

        System.out.println("U kru me suskse");
    }
}
