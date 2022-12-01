package Kollofjumi1;

public class Detyra11 {
    public static void main(String[] args) {
        int n = 12346;

        int shifra = n;
        int acc = 0;

        shifra = n % 10;
        n /= 10;
        acc += shifra;


        shifra = n % 10;
        n /= 10;
        acc += shifra;

        shifra = n % 10;
        n /= 10;
        acc += shifra;

        shifra = n % 10;
        n /= 10;
        acc += shifra;

        shifra = n % 10;
        n /= 10;
        acc += shifra;

        System.out.println(acc);

        if (acc % 5 == 0) {
            System.out.println("Numer Ideals");
        } else {
            System.out.println("Kerka sje");
        }

    }
}
