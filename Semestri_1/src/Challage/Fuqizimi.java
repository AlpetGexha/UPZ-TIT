package Challage;

public class Fuqizimi {
    public static void main(String[] args) {

        System.out.println(pow(2, 10));
    }

    /*
     * 2^10 = 2*2*2*2*2*2*2*2*2*2 = 1024
     * 2=2
     * 2+2=4
     * 4+4=8
     * 8+8=16
     * 16+16=32
     * 32+32=64
     * 64+64=128
     * 128+128=256
     * 256+256=512
     * 512+512=1024
     * */
    public static int pow(int n, int power) {
        int result = n;
        int fuqizimi = n;

        if (power == 0) {
            return 1;
        }

        for (int i = 1; i < power; i++) {
            for (int j = 1; j < n; j++) {
                result += fuqizimi;
            }
            fuqizimi = result;
        }

        return result;
    }
}
