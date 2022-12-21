package Java_12;

import java.util.Scanner;

public class ReveserStringArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        System.out.println("Shkruaj nje fjalë: ");
//        String fjala = s.nextLine();

        String fjala = "Alpet Gexha kimik 16 ";

        String[] fjalaSplit = fjala.split(" ");

        System.out.println("\n------------------ Palindrom ------------------\n");

        for (String s1 : fjalaSplit) {
            System.out.println(s1 + " - " + isPalindrom(s1));
        }

        System.out.println("\n------------------ Reverse ------------------\n");

        for (String s1 : fjalaSplit) {
            System.out.print(reverse(" " + s1));
        }
    }

    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrom(String s) {
        return s.equals(reverse(s));
//                .toLowerCase();
    }
}
