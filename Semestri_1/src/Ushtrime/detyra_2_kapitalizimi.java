package Ushtrime;

public class detyra_2_kapitalizimi {

    public static void main(String[] args) {
        String str = "Alpet  kjo eshte nje string";

        System.out.println(kapitalizimi(str));

    }

    public static String kapitalizimi(String fjala) {
        String res = "";
        String[] str = fjala.split(" ");

        for (int i = 0; i < str.length; i++) { // fori per indeksin e fjalis

            for (int j = 0; j < str[i].length(); j++) { // fori per indeksin e karaktereve te fjalis

                if (j == 0 && str[i].charAt(0) >= 'a' && str[i].charAt(0) <= 'z') { // nese osht lowercase
                    res += " " + (char) (str[i].charAt(0) - 32);// bone uppercase
                } else {
                    res += str[i].charAt(j); // shto karakterin tjera
                }
            }
        }

        return res;
    }
}
