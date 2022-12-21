package Kolljumi_2_2020;


/**
 * (20 pikë) Shkruani një program në JAVA i cili zhvendos secilin numer pozitiv në të djathtë dhe secilin numer
 * negativ në të majtë të një vargu të dhënë të numrave të plotë.
 */
public class Detyra_4_zevendesimi {
    public static void main(String[] args) {
        // Numrat që do të zhvendosim
        int[] numbers = {-5, 3, -1, 4, -2, 8, -9};

        // Zhvendosim numrat pozitiv në të djathtë dhe numrat negativ në të majtë
        int[] result = new int[numbers.length];
        int resultIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                result[resultIndex++] = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 0) {
                result[resultIndex++] = numbers[i];
            }
        }

        // Shfaqim rezultatin
        for (int number : result) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
