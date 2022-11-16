package java7;

/*
 * Detyra Trego cili është numri me i madh.
 *
 * */
public class NumirMax {
    public static void main(String[] args) {

//        int x1 = 10, x2 = 20, x3 = 30, x4 = 40, x5 = 50, x6 = 60;

        int x1 = (int) (Math.random() * 100);
        int x2 = (int) (Math.random() * 100);
        int x3 = (int) (Math.random() * 100);
        int x4 = (int) (Math.random() * 100);
        int x5 = (int) (Math.random() * 100);
        int x6 = (int) (Math.random() * 100);

        int max = x1;

        if (x2 > max) max = x2;
        if (x3 > max) max = x3;
        if (x4 > max) max = x4;
        if (x5 > max) max = x5;
        if (x6 > max) max = x6;

        System.out.println(String.format("x1 = %d\n x2 = %d\n x3 = %d\n x4 = %d\n x5 = %d\n x6 = %d\n", x1, x2, x3, x4, x5, x6));
        System.out.println("Numri me i madh eshte: " + max);

    }

}
