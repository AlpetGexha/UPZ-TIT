package Provimi_Janar_2020;

import java.util.Scanner;

/**
 * Një numër i Armstrongut është një numër i plotë pozitiv që është i
 * barabartë me shumën e shifrave të tij të ngritur në fuqinë e numrit të shifrave.
 * Për shembull, 371 ka tre shifra, 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371.
 * Shkruani një program që pranon një numër të plotë pozitiv dhe përcakton nëse numri është i Armstrongut.
 */
public class Detyra_5_Armstorng {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Jep nje numer pozitiv: ");
        int n = s.nextInt();
        int tmp = n;
        int org = n;
        int numri_i_shifrafe = 0;

        while (tmp > 0) {
            numri_i_shifrafe++;
            tmp /= 10;
        }

        int sum = 0;
        while (n > 0) {
            int sh = n % 10;
            sum += Math.pow(sh, numri_i_shifrafe);
            n /= 10;
        }
        System.out.println(sum);

        if (org == sum)
            System.out.print("Armstrongut");
        else
            System.out.print("Nuk osht Armstrongut");
    }
}
