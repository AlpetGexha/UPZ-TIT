package Provimi_Jarnar_2022;

public class Detyra_4_unike {
    public static void main(String[] args) {

        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9,1 };

        System.out.println(isUnique(v));

    }

    public static boolean isUnique(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) return false;
            }
        }
        return true;
    }
}