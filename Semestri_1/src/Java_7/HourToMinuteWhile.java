package Java_7;

import java.util.Scanner;

public class HourToMinuteWhile {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("Shkruaj orën: ");
            int ora = s.nextInt();

            int formula = ora * 60;

            System.out.println(ora + " orë janë " + formula + " minuta \n");
        }
    }
}
