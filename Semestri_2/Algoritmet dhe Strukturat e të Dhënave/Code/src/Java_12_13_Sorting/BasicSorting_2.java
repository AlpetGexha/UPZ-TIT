package Java_12_13_Sorting;

public class BasicSorting_2 {

    public static int[] bubbleSort(int[] arr) {
        int in, out, swaps = 0, comparisons = 0;
        boolean flag = true;
        for (out = arr.length - 1; out > 0 && flag; out--) {
            flag = false;
            for (in = 0; in < out; in++) {
                comparisons++;
                if (arr[in] > arr[in + 1]) {
                    swap(arr, in, in + 1);
                    swaps++;
                    flag = true;
                }
            }
        }
        System.out.println("swaps: " + swaps + " comparisons: " + comparisons);
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        int in, out, min, swaps = 0, comparisons = 0;
        for (out = 0; out < arr.length - 1; out++) {
            min = out;
            for (in = out + 1; in < arr.length; in++) {
                comparisons++;
                if (arr[in] < arr[min]) {
                    min = in;
                }
            }
            swap(arr, out, min);
            swaps++;
        }
        System.out.println("swaps: " + swaps + " comparisons: " + comparisons);
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        int in, out, copies = 0, comparisons = 0;
        for (out = 1; out < arr.length; out++) {
            int key = arr[out];
            for (in = out - 1; in >= 0 && key < arr[in]; in--) {
                arr[in + 1] = arr[in];
                comparisons++;
            }
            arr[in + 1] = key;
            copies++;
        }
        System.out.println("copies: " + copies + " comparisons: " + comparisons);
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {25, 15, 10, 5, 2, 1};
        insertionSort(arr);
        display(arr);
    }
}