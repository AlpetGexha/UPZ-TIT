package Java_12_13_Sorting;

public class AdvanceSorting_2 {

    public static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            //start divide
            int nArr1 = n / 2;
            int nArr2 = nArr1;
            if (n % 2 == 1) nArr2++;
            int[] arr1 = new int[nArr1];
            int[] arr2 = new int[nArr2];
            for (int i = 0; i < nArr1; i++) {
                arr1[i] = arr[i];
            }
            for (int i = nArr1; i < n; i++) {
                arr2[i - nArr1] = arr[i];
            }
            //stop divide

            //start recure
            arr1 = mergeSort(arr1);
            arr2 = mergeSort(arr2);
            //stop recure

            //start conquer - merge
            int i = 0, j = 0, k = 0;
            while (j < nArr1 && k < nArr2) {
                if (arr1[j] < arr2[k]) arr[i++] = arr1[j++];
                else arr[i++] = arr2[k++];
            }
            while (j < nArr1) arr[i++] = arr1[j++];
            while (k < nArr2) arr[i++] = arr2[k++];
            //stop merge
        }
        return arr;
    }

    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];
        //partition
        while (l <= r) {
            while (arr[l] < pivot) l++;
            while (arr[r] > pivot) r--;
            if (l <= r) {
                swap(arr, l, r);
                display(arr);
                l++;
                r--;
            }
        }
//			swap(arr, l, right);
        if (left < r) quickSort(arr, left, r);
        if (l < right) quickSort(arr, l, right);
    }

    public static void swap(int arr[], int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void display(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6, 4, 11, 9};
        display(arr);
        quickSort(arr, 0, arr.length - 1);
        display(arr);
    }
}