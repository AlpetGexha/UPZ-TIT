package Kollofjumi_2_2022;

public class Detyra_2_karakteeret {
    public static void main(String[] args) {

        String str = "Hello, World!!! ARe you there?  Yes I Am .";

        krahaso(str);
    }

    public static void krahaso(String str) {

        char[] c = {',', '.', ':', '!', '?'};


        for (int i = 0; i < c.length; i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (c[i] == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(c[i] + " : " + count);
        }

    }
}
