package Provimi_Prill_2020;

/**
 * (10 pikë) Shkruani një funksion në Java që kthen si rezultat shumën e fuqive
 * (a[i]^2) të në pozitat tek të vektorit A(n) që kanë vlerën absolute më të madhe se 8.
 */


// if APS > 8
//  NUMRI i Pjestimi == 0 mbejta
// sum += APS^2


public class Detyra_3_Vektort {
    public static void main(String[] args) {

        int v[] = {1, 2, 3, 10, 8};

        System.out.println("Rezultati: " + vektori(v));
    }

    public static int vektori(int arr[]) {
        int sum = 0;

        for (int i = 1; i < arr.length; i += 2) {
            if (Math.abs(arr[i]) > 8)
                sum += Math.pow(arr[i], 2);
        }
        return sum;
    }
}
