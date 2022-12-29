package Challage;

import java.util.Arrays;

public class PrejrjaNeVarg {
    public static void main(String[] args) {
        int v2[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int v1[] = {0, 1, 2, 3, 4, 5, 6, 7, 11, 12, 13, 14, 15};

        System.out.print("Rezultati: ");
        dd(simularElement(v1, v2));
    }

    public static int[] simularElement(int[] arr1, int[] arr2) {

        if (arr1.length < arr2.length) {
            swap(arr1, arr2);
        }

        int[] rezult = new int[arr1.length];
        int index = 0;

        // Iterate through both arrays and check for similar elements
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    rezult[index] = arr1[i];
                    index++;
                    break;
                }
            }
        }

        // Krijimi i nje vargje te ri me madhesine e indexit
        int[] finalRezult = new int[index];
        for (int i = 0; i < index; i++) {
            finalRezult[i] = rezult[i];
        }

        return finalRezult;
    }

    public static void swap(int[] arr1, int[] arr2) {
        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;
    }

    public static void dd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
    }
}