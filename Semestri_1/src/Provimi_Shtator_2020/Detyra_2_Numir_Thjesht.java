package Provimi_Shtator_2020;

/**
 * (15 pikë) Një numër i thjeshtë është një numër i plotë më i madh se 1 dhe që
 * plotëpjesëtohet vetëm me 1 dhe me veten. Shtatë numrat e parë të thjeshtë janë
 * 2, 3, 5, 7, 11, 13, dhe 17. Kur testojmë nëse një numër është i thjeshtë, është
 * e mjaftueshme të provojmë të pjesëtojmë me numrat e plotë deri në rrënjën
 * katrore të numrit që po testohet. Shkruani një metodë në Java që kthen si
 * rezultat nëse numri i dhënë si hyrje është i thjeshtë apo jo.
 */
public class Detyra_2_Numir_Thjesht {
    public static void main(String[] args) {
//        All True
        int[] v = {1,4,2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " " + isNatyral(v[i]));
        }

    }

    public static boolean isNatyral(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


}
