package Ushtrime_porvimi;

public class detyra_4_zevendesimi {
    public static void main(String[] args) {

        int[] vargu = {3, 4, -1, -5, -9, 20, -4000, -8, 1};
        int[] res = new int[vargu.length];

        int indexTek = 0;
        int indexCift = 1;


        for (int i = 0; i < vargu.length; i++) {

            if (vargu[i] < 0) {
                res[indexTek] = vargu[i];
                indexTek += 2;
            } else {
                res[indexCift] = vargu[i];
                indexCift += 2;
            }
        }

        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.print("]");

    }
}
