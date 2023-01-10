package Ushtrime_testi;

public class Ushtrimi_4 {
    public static void main(String[] args) {
        int[] v1 = {1, 23, 4, 12, 53, 221, 353, 2, 12, 132};
        int[] v2 = {1, 4343, 2, 2, 32, 2, 432, 423, 423, 4, 24, 234, 12, 6, 65, 76, 9789, 67, 12, 132};

        int[] arr = unioniVargut(v1, v2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        prerja(v1, v2);
    }

    public static int[] unioniVargut(int[] arr1, int[] arr2) {
        int lowerLength = Math.min(arr1.length, arr2.length);
        int higherLength = Math.max(arr1.length, arr2.length);

        int[] arr3 = new int[lowerLength];
        int counter = 0;
        for (int i = 0; i < lowerLength; i++) {
            for (int j = 0; j < higherLength; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[counter] = arr1[i];
                    counter++;
                }
            }
        }
        return arr3;
    }

    public static void prerja(int[] v1, int[] v2) {
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    System.out.println(v1[i] + " ");
                    break;
                }
            }
        }
    }
}
