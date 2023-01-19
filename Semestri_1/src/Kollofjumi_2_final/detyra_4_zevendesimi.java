package Kollofjumi_2_final;

public class detyra_4_zevendesimi {
    public static void main(String[] args) {
        int[] vargu = {3, 4, -1, -5, -9, 20, -4000, -8, 1};
        int[] res = new int[vargu.length];
        int index = 0;
        int index2 = 1;
        //        result = { -1 3,-5,4,-9,20,-4000,-8,1}
//        negativ number is odd and positive number is even
        for (int i = 0; i < vargu.length; i++) {
            if (vargu[i] < 0) {
                res[index] = vargu[i];
                index += 2;
            } else {
                res[index2] = vargu[i];
                index2 += 2;
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
