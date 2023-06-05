package Kollofjumi_2;

public class NumberCounting {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 12, 3, 5, 32, 35, 1, 3, 32, 42, 42, 12, 31, 21, 2, 2, 2, 4, 5, 66};

        counter(arr);
    }

    public static void counter(int[] arr) {
        int[] freq = new int[101]; // assuming numbers in array are between 0 and 100

        // Count frequency of each number in the array
        for (int num : arr) {
            freq[num]++;
        }

        // Print the frequency of each number
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.print(i + ":" + freq[i] + " ,");
            }
        }
    }
}
