package Challage;

public class NumberCounter {
    public static void main(String[] args) {
        int n[] = {1, 2,2,3,3,1,2,3,5,10,1,5,21,23,11,31,1};
        countOccurrences(n);
    }

    public static void countOccurrences(int[] arr) {
        int[] freq = new int[101]; // assuming numbers in array are between 0 and 100

        // Count frequency of each number in the array
        for (int num : arr) {
            freq[num]++;
        }

        // Print the frequency of each number
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }
    }

}
