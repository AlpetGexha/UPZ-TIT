package Kollofjumi_2_2022;

public class Detyra_5_zbritja {
    public static void main(String[] args) {

        int n = 20;
        int j = 2;
        int counter = 0;

        while (n >= j) {
            counter++;
            n -= j;
        }

        System.out.println(counter);


    }
}
