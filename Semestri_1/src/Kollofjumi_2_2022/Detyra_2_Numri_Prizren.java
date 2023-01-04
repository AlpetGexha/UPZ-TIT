package Kollofjumi_2_2022;

public class Detyra_2_Numri_Prizren {
    public static void main(String[] args) {
        int n = 23;
        int shuma = 0;
        int prodhimi = 1;

        while (n > 0) {
            int sh = n % 10;
            shuma += sh;
            prodhimi *= sh;
            sh /= 10;
        }


        if (prodhimi > shuma * 2) {
            System.out.println("Numri Prizren");
        } else {
            System.out.println("Nuk osht numer Prizren");
        }

    }
}
