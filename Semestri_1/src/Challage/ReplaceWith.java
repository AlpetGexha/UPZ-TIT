package Challage;

import java.util.Scanner;

public class ReplaceWith {
    /**
     * Zëvendësoni dukuritë e një karakteri me një karakter tjetër
     *
     * @param str String që do të përpunohet
     * @param c   karakteri që do të zëvendësohet
     * @param j   karakteri që do të vendoset në vend të karakterit të zëvendësuar
     * @return String që përmban karakteret e stringut të dhënë, por duke zëvendësuar
     */
    public static String replaceWith(String str, char c, char j) {
        String replacement = "";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == c) letter = j;
            replacement += letter;
        }

        return replacement;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Jep Fjalin: ");
        String str = s.nextLine();

        System.out.println("Jep karaketerin qe deshironi ta zevendesoni: ");
        char w = s.next().charAt(0);

        System.out.println("Jep karaketerin me te cilin deshironi ta zevendesoni: ");
        char c = s.next().charAt(0);


        System.out.println(replaceWith(str, w, c));
        System.out.println("--------------------------");

    }
}
