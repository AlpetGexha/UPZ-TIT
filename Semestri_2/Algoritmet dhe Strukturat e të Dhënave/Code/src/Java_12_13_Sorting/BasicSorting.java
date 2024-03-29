package Java_12_13_Sorting;

public class BasicSorting {

    public static void main(String[] args) {

        int arr[] = {123,32,32,123,432,5,31,23,432,4};

        selectionSort(arr);
        dd(arr);

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
    }

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1 ; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            swap(arr, i, min);
        }
    }

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length ; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void dd(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
