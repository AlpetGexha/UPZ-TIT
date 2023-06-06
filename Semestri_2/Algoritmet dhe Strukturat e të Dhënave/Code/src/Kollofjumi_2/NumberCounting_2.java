package Kollofjumi_2;

import java.util.Arrays;

public class NumberCounting_2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2, 4, 5, 5, 1, 2, 4, 5, 7, 8, 9, 4, 45, 2, 34, 5, 45,};

        numberCounting(arr);
    }

    public static void numberCounting(int[] arr) {
        Arrays.sort(arr); // sorting the array with (n log n) (QuickSort)

        for (int i = 0; i < arr.length; i++) { // O(n)
            int count = 1;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) { // Perderisa nuk eshte fundi i array dhe numri i tanishem eshte i njejte me numrin e ardhshem
                count++;
                i++;
            }
            System.out.print(arr[i] + ":" + count + ", ");
        }
    }


    public static void numberCounting2(int[] arr) {
//        ChatGPT
        Arrays.sort(arr); // Sort the array in ascending order

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            // Count the occurrences of the current number
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    count++;
                else
                    break;
            }

            // Print the number and its count
            System.out.print(arr[i] + ":" + count + ", ");

            // Skip the remaining occurrences of the same number
            i += count - 1;
        }
    }

}