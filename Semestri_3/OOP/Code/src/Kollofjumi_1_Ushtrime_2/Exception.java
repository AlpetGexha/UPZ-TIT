package Kollofjumi_1_Ushtrime_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try{
            System.out.print("Jep nje numer: ");
            int n = s.nextInt();

            System.out.println(n);
        }catch (InputMismatchException e){
            System.out.println("Ju lutem jepni numer");
        }

        try{
            int rezult = 10 / 0;
            System.out.println(rezult);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
