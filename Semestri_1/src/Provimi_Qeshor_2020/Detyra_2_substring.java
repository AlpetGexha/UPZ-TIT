package Provimi_Qeshor_2020;

/**
 * (15 pikë) Shkruani një funksion String extractSubstring(String s,int start, int end)
 * i cili kthen një string që është nën-string i këtij stringu;
 * stringu fillon në indeksin e dhënë start dhe vazhdon deri në indeksin e dhënë end - 1.
 * <p>
 * Për shembull, nëse stringu është butterfly, start = 2, end = 7, atëherë
 * rezultati i kthimit duhet të jetë tterf.
 * <p>
 * butterfly ==> tterf
 */


public class Detyra_2_substring {
    public static void main(String[] args) {
        String str = "butterfly";

        System.out.println(extractSubstring(str, 2, 7));
    }

    public static String extractSubstring(String s, int start, int end) {

        String str = "";

        for (int i = start; i < end; i++) {
            str += s.charAt(i);
        }

        return str;
    }
}
