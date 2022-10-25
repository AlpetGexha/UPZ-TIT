package Java4;

import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//           Input
            System.out.print("Shkruaj sekondat: ");
            int totaliSekonda = s.nextInt();

//            Process
            int ore = totaliSekonda / 3600;
            int minuta = (totaliSekonda % 3600) / 60;
            int sekonda = totaliSekonda % 60;

//            Output
            System.out.println(String.format("%s Ore %s Minuta %s Sekonda", ore, minuta, sekonda));

    }

}
