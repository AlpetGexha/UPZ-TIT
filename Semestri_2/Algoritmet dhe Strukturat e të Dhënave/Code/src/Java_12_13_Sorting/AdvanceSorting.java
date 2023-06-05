package Java_12_13_Sorting;

import java.util.Arrays;

public class AdvanceSorting {

    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 3, 1, 5, 6};
//        quickSort(new int[]{5, 4, 3, 2, 1});
    }


    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high); //është indeksi i ndarjes, arr[pi] është tani në vendin e duhur
            quickSort(arr, low, pivotIndex - 1); // para ndarjes "pivot"
            quickSort(arr, pivotIndex + 1, high); // pas ndarjes  "pivot"
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // zgjedh pikën e fundit si pivot
        int i = low - 1; // indeksin e elementit më të vogël
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);

        return i + 1;
    }

    public static void mergeSort(int[] array) {
        if (array == null) {
            return; // Base case: if array is null, return
        }
        int n = array.length;
        if (n <= 1) {
            return; // Base case: if array has 1 or fewer elements, return
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Split the array into two halves
        for (int i = 0; i < mid; i++) {
            left[i] = array[i]; // Copy the first half of array into left
        }

        for (int i = 0; i < n - mid; i++) {
            right[i] = array[mid + i]; // Copy the second half of array into right
        }

        mergeSort(left); // Recursively sort the left subarray
        mergeSort(right); // Recursively sort the right subarray

        merge(left, right, array); // Merge the sorted left and right subarrays
    }

    private static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        // Merge the two sorted subarrays into a single sorted array
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++]; // Place the smaller element from the left subarray into the result array
            } else {
                result[k++] = right[j++]; // Place the smaller element from the right subarray into the result array
            }
        }

        // Copy any remaining elements from the left subarray
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Copy any remaining elements from the right subarray
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
