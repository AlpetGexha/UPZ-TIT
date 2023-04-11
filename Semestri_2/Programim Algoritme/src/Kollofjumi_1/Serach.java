package Kollofjumi_1;

import java.util.Arrays;

public class Serach {
    public static void main(String[] args) {

//        Shembujt
        int[] vargu = {1, 6, 2, 7, 8, 0};
        int find = 8;

        System.out.println(linarSearch(vargu,find)); // 4
        selfOrganization(vargu,6); // 1
//        swap(vargu[0] , vargu[1]);

//        System.out.println();
//        dd(vargu); // 6,1,2,7,8

    }

    //  return Linar
    public static int linarSearch(int[] arr, int value) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }

//    vetorganizim
//    public static void
//  Kur e bojm 1 element serach vlera e elementit zhvendoset per 1 ( i bohet swap me i+1)

    public static void selfOrganization(int[] dionesa, int value) {
        for (int i = 0; i < dionesa.length; i++) {
            if (dionesa[i] == value) {
                System.out.print(i);
                swap(dionesa[i], dionesa[i + 1]);
                System.out.println();
                return;
            }

        }

        System.out.println("Kerka sje");
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void dd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int binarySerach(int arr[], int value){
        Arrays.sort(arr);

        int low = 0;
        int hight = arr.length - 1;

        while(low <= hight){
            int mid = (low + hight) / 2;

            if (value == arr[mid])
                return mid;

            else if (value < arr[mid])
                low = mid + 1;

            else
                hight = mid - 1;

        }

        return -1;
    }


    public static void binaryRecursion(int arr[], int value, int low, int dionesaHeight){
        Arrays.sort(arr);

        int mid = (low + dionesaHeight) / 2;

        if(dionesaHeight < low){
            System.out.println("Not ka vlera");
            return;
        }

        if (value == arr[mid])
            System.out.println(mid);

        else if (value < arr[mid])
            binaryRecursion(arr, value, mid + 1, dionesaHeight);

        else
            binaryRecursion(arr, value, low, mid - 1);

    }

}
