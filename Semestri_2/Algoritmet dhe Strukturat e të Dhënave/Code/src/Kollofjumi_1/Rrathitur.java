package Kollofjumi_1;

public class Rrathitur {
    public static void main(String[] args) {
        int[] v = {23, 123, 1, 432, 5, 36, 756, 342, 4, 23, 4, 654, 65, 34, 856, 432, 42};
        System.out.println(isSorted(v));


        int v1[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(isSorted(v1));

    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}