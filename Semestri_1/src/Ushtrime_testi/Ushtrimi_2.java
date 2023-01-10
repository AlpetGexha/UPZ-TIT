package Ushtrime_testi;

public class Ushtrimi_2 {
    public static void main(String[] args) {
//        for (int i = 0; i < 26; i++) {
//            System.out.print((char) (i + 65) + " ");
//        }
        alfabeti();
    }

    public static void alfabeti() {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char)i + " " + (char) (i + 32));
        }
    }
}
