package Java_3_search_algorithm;

public class Sekuencial {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 3, 76, 234, 67, 43, 765, 34, 65, 776, 45, 3, 43, 321, 78, 97, 76, 54, 43, 43, 326, 546, 456, 78, 67, 9765, 543, 432, 654, 423, 645, 21, 43};;
        int find = 2;

        System.out.println("Index i " + find + ": " + sekuencial(arr, find));
    }



    public static int sekuencial(int[] arr, int find) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }
        }

        return -1;
    }
}
