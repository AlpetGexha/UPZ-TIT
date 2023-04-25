package Provimi_prill_2023;

import java.util.Scanner;

public class GrupiA {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j || j == n - 1 || i == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();

        }


        Scanner s = new Scanner(System.in);

        System.out.println("A:");
        double a = s.nextInt();

        System.out.println("B:");
        double b = s.nextInt();

        System.out.println("C:");
        double c = s.nextInt();

        double syprina = (a + b + c) / 2;

        double area = Math.sqrt(syprina * (syprina - a) * (syprina - b) * (syprina - c));






    }


    public static int sum(int[] vargu){

        int count = 0;

        for (int i = 0; i < vargu.length; i++) {
            if(i % 3 == 0 || vargu[i] < 5){
                count += vargu[i];
            }
        }

        return count;
    }




public static boolean isBinak(int num1, int num2){

        int count = 0;

        while(num1 > 0){
            if(num1 % 10 == num2 % 10){
                count++;
            }
            num1 /= 10;
            num2 /= 10;
        }

        if(num1/2 >= count)
            return true;

        return false;
}




/*
    public class MeKorigjo{
        public static void main(String[] args) {
            int var1 = 5, var2 = 0;
            Integer ans = var1 / var2;
            for (int i = 0; i <= 5; i--)
                System.out.print(i);

            char c = 'a';
            final double a = 3;
        }
    }

*/



}
