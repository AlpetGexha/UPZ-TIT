package Kollofjumi_2_final;

public class detyra_3_pow_with_plus {
    public static void main(String[] args) {
// 4^3 = 4*4*4
// 4+4+4+4 = 16
//        16+16+16+16 = 64

        System.out.println(pow(4, 3));

    }

    public static int pow(int a, int b) {
        int res = a;
        int tmp = a;
        for (int i = 1; i < b; i++) {
            for (int j = 1; j < a; j++) {
                res += tmp;
            }
            tmp = res;
        }
        return res;

    }
}
