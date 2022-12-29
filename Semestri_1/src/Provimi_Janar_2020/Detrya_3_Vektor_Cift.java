package Provimi_Janar_2020;

/**
 * Shkruani një funksion në Java që kthen si rezultat shumën e anëtarëve
 * çift në pozitat tek të vektorit A(n).
 */

public class Detrya_3_Vektor_Cift {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                sum += v[i];
            }
        }
        System.out.println(sum);
    }
}
