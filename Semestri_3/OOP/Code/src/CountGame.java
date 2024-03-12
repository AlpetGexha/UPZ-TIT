import java.util.Scanner;

public class CountGame {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int count = 0;

        long start = System.currentTimeMillis();

        for (int i = 0; i < 3; i++) {

            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);

            System.out.println("sa osht " + num1 + " + " + num2 + " ?");

            System.out.print("shkruaj rezultatin: ");
            int rez = s.nextInt();

            if (rez == num1 + num2) {
                System.out.println("BAVVVVOOO RINESAAAAA");
                count++;
            } else {
                System.out.println("Kerksa sje ti cik");
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("koha: " + ((end - start) / 100) + " ms");

        s.close();

    }
}
