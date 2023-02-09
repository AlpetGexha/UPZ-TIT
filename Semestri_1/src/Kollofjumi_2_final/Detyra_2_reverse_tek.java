package Kollofjumi_2_final;

public class Detyra_2_reverse_tek {
    public static void main(String[] args) {
        String str = "Nje ditë e bukur por e gjatë!";
        System.out.println(reverseTek(str));
    }

    public static String reverseTek(String str) {
        String res = "";

        String[] word = str.split(" ");

        for (int i = 0; i < word.length; i++) {

            if (i % 2 == 0) {
                res += reverse(word[i]) + " ";
            } else {
                res += word[i] + " ";
            }
        }

        return res;
    }

    public static String reverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}
