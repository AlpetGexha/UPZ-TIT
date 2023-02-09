package Ushtrime_porvimi;

public class Detyra_3_ndritja_fuqi {
    public static void main(String[] args) {
//        4^3

        System.out.println(fuqiaMe20(2,8));
    }

    public static int fuqiaMe20(int a, int b){
//        a = 4
//        b = 3
        // 4^3 = 4*4*4
        // 4+4+4+4 = 16
        // 16+16+16+16 = 64

        int count = a;
        int rezultat = a;

        for (int i = 1; i < b; i++) {
//            count *= a; == +
            for (int j = 1; j < a ; j++) {
                count += rezultat;
            }

            rezultat = count;
        }

        return count;
    }

    public static int fuqiaPa20(int a, int b){

//        4^3
//        4^3 = 4*4*4

        int count = a;

        for (int i = 1; i < b; i++) {
            count *= a;
        }

        return count;
    }
}
