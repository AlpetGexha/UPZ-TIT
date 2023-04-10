package Kollofjumi_1;

public class Serach {
    public static void main(String[] args) {

        int[] v = {23, 123, 1, 432, 5, 36, 756, 342, 4, 23, 4, 654, 65, 34, 856, 432, 42};
        int find = 34;

        // kerkimi
        // cdo pozit\
        // for (0 < n-1)
        // char at
        System.out.println(sequencialSearch(v, find));
    }

    public static int sequencialSearch(int[] v, int find) {
        for (int i = 0; i < v.length; i++) {
//            if(v[i] == find){
//                swap v[i] me v[i + 1]
//            }
            if (v[i] == find) {
//                System.out.println("index" + i);
                return i;
            }
        }

        return -1;
    }

    public static void seqFindSelf(int[] v, int find) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == find) {
                swap(i, i + 1);
            }
        }
    }

  public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
  }

}
