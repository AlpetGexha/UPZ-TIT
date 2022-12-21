package Provimi_Qeshor_2020;

/**
 * (10 pikë) Shkruani një funksion në Java që kthen si rezultat shumën e anëtarëve
 * çift në pozitat tek të vektorit A(n).
 */


public class Detyra_3_Vektori_Cift {
    public static void main(String[] args) {
        int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Rezultati: " + vektoriQift(v));
    }

    public static int vektoriQift(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                sum += arr[i];
        }

        return sum;
    }
}
