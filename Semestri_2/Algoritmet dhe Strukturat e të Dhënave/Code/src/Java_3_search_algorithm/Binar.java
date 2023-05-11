package Java_3_search_algorithm;

import java.util.Arrays;

public class Binar {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 3, 76, 234, 67, 43, 765, 34, 65, 776, 45, 3, 43, 321, 78, 97, 76, 54, 43, 43, 326, 546, 456, 78, 67, 9765, 543, 432, 654, 423, 645, 21, 43};

        int find = 65;

        System.out.println("Index i " + find + ": " + binary(arr, find));
    }

    public static int binary(int[] arr, int find) {
        Arrays.sort(arr);
        int low = 0;
        int up = arr.length - 1;

        while (low <= up) {
            int mid = (low + up) / 2;

            if (arr[mid] == find)
                return mid;

            else if (arr[mid] < find)
                low = mid + 1;

            else
                up = mid - 1;
        }

        return -1;
    }
}
