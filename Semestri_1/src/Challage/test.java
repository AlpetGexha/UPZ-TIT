package Challage;

public class test {
    public static void main(String[] args) {

        System.out.println(pow(2, 10));
    }

    /*
     * 3 ^ 3 = 3*3*3 =
     * 3+3+3 = 9
     * 9+9+9 = 27
     * */
    public static int pow(int n, int power) {
        int result = n;
        int fuqizimi = n;

        if(power == 0)
            return 1;

        for (int i = 1; i < power; i++) {
            for (int j = 1; j < n; j++) {
                result += fuqizimi;
            }
            fuqizimi = result;
        }

        return result;

    }
}
