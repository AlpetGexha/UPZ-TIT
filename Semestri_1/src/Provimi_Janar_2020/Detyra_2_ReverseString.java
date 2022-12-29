package Provimi_Janar_2020;

/**
 * Detyra 2
 * <p>
 * Shkruani një program në Java që do të kthejë nga ana e kundërt
 * sekuencën e shkronjave në secilën fjalë nga paragrafi që jepet si hyrje.
 * Për shembull, nëse hyrja është "To be or not to be" atëherë rezultati do të
 * jetë "oT eb ro ton ot eb."
 * "To be or not to be" ==> "oT eb ro ton ot eb."
 * <p>
 * *
 */
public class Detyra_2_ReverseString {
    public static void main(String[] args) {
        String s = "To be or not to be";
        String v[] = s.split(" ");

        for (String s1 : v) {
            for (int i = s1.length() - 1; i >= 0; i--) {
                System.out.print(s1.charAt(i));
            }
            System.out.print(" ");
        }

    }
}
