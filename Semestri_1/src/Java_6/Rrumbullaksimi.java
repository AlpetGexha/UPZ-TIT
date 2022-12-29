package Java_6;

import java.util.Scanner;

public class Rrumbullaksimi {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Jep vlerën a: ");
        double a = s.nextDouble();

        System.out.print("Jep vlerën b: ");
        double b = s.nextDouble();

        double result = a / b;
        double result1 = result;
        int rrumbullasimi;

        /*
         * Na duhet ta dijm sa e kemi mbetjen
         * Llogaritja:
         *
         * Numri me mbetje - Numri i plotë = Mbetja
         *
         * Nese mbetja eshte me e madhe se 0.5 atehere rrumbullasimi eshte numri i plotë + 1
         * Nese mbetja eshte me e vogel se 0.5 atehere rrumbullasimi eshte numri i plotë
         * */
        if ((result1 - (int) result1) >= .5)
            rrumbullasimi = (int) result + 1;
        else
            rrumbullasimi = (int) result;


        System.out.println(String.format("Rrumbullasimi i %.4f eshte %s", result, rrumbullasimi));

    }
}
