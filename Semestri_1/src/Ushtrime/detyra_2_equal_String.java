package Ushtrime;

public class detyra_2_equal_String {
    public static void main(String[] args) {

    }

    public static boolean isEqualString(String str1, String str2) {
//        nese nuk kan karaktere te njejat
        if (str1.length() != str2.length()) {
            return false;
        }

//        nese nuk kan karakeret e njejta ne pozicionin e njejte
//        Nuk mund pe perdorim "==" kur punojme me stringje
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

}
