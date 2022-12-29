package Java_7;

import java.util.Scanner;

public class ArmstrongNumber_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Jep numrin: ");

            int n = s.nextInt();
            int tmp = n;
            int norg = n;
            int res = 0;
            int numirIShifrave;

            for (numirIShifrave = 0; tmp > 0; numirIShifrave++) {
                tmp /= 10;
            }
//            System.out.println(numirIShifrave);

            while (n > 0) {
                int shifra = n % 10;
                res += Math.pow(shifra, numirIShifrave);
                n /= 10;
            }

            System.out.println((norg == res) ? "Eshte numer Armstrong" : "Nuk eshte numer Armstrong");
        }
    }
}
