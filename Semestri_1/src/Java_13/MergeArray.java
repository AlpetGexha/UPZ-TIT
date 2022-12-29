package Java_13;

public class MergeArray {
    public static void main(String[] args) {

        int[] v1 = {1, 3, 5, 7, 8, 10, 12, 15};
        int[] v2 = {2, 4, 6, 8, 9, 11, 13, 14, 18, 21, 35};

        int[] v3 = mergeF(v1, v2);
        printArr(v3);


    }

    public static int[] mergeF(int[] arr1, int[] arr2) {

        int[] v3 = new int[arr1.length + arr2.length];

        int vp1 = 0;
        int vp2 = 0;
        int vp3 = 0;

//        if (arr1.length < arr2.length) {
//            swap(arr1, arr2);
//        }

        while (vp1 < arr1.length && vp2 < arr2.length) {
            if (arr1[vp1] < arr2[vp2]) {
                v3[vp1 + vp2] = arr1[vp1];
                vp1++;
            } else {
                v3[vp1 + vp2] = arr2[vp2];
                vp2++;
            }
        }

        while (vp1 < arr1.length) {
            v3[vp1 + vp2] = arr1[vp1];
            vp1++;
        }

        while (vp2 < arr2.length) {
            v3[vp1 + vp2] = arr2[vp2];
            vp2++;
        }

        return v3;
    }

    public static void swap(int[] swpaV1, int[] swpaV2) {
        int[] swap3 = swpaV1;
        swpaV1 = swpaV2;
        swpaV2 = swap3;
    }

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
