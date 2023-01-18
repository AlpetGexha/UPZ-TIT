package Ushtrime;

public class detyra_4_prilii {
    public static void main(String[] args) {
        int n = 500;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) {
//                        if(Math.pow(k,2) < 500)
                            System.out.println(i + "^2 + " + j + "^2 = " + k + "^2 ");
                    }
                }
            }
        }
    }
}
