package QuickSort;

public class QuickSort {
    public static int count = 0;

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 6, 4, 2};

        sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nCount: " + count);
    }

    public static void sort(int[] arr) {
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
        count++;

        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
