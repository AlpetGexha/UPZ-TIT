package Ushtrime;

import java.util.Scanner;

public class Detrya_3_Alfabeti_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        while (true) {
            char c = s.nextLine().toLowerCase().charAt(0);

//            check if its letter
            if (! (c >= 'a' && c <= 'z') ) {
                return;
            }


            String res = "";

            switch (c) {
                case 'a':
                    res = "Zanore";
                    break;
                case 'e':
                    res = "Zanore";
                    break;
                case 'u':
                    res = "Zanore";
                    break;
                case 'o':
                    res = "Zanore";
                    break;
                case 'i':
                    res = "Zanore";
                    break;
                case 'y':
                    res = "Zanore";
                    break;
                default:
                    res = "Bashketingellore";
            }

            System.out.println(res);
        }
    }
}
