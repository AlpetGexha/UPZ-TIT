public class La {
    public static void main(String[] args) {

        int count = 0;
        int digit = 4;

        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < digit; j++) {
                for (int k = 0; k < digit; k++) {
                    for (int l = 0; l < digit; l++) {
//
                        if (i == 0 || j == 0 || k == 0 || l == 0) {
                            count++;
                        }

                        System.out.println(i + " " + j + " " + k + " " + l);
                    }

                }
            }
        }
        System.out.println("Count: " + count);
    }

}
