package Java_12;

public class Funksionet {

    public static String extractSubstring(String str, int start, int end) {
//        Check if the start index is greater than the end index
        if (start > end) return "Start index is greater than the end index";
//        Check if the start index is less than 0
        if (start < 0) return "Start index is less than 0";

        String sub = "";
        for (int i = start; i < end; i++) {
            sub += str.charAt(i);
        }
        return sub;
        //        return str.substring(start, end);
    }

    public static int findChar(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) return i;
        }
        return -1;
    }

    public static String toLowerCase(String str) {
        String lower = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                lower += (char) (str.charAt(i) + 32);
            } else {
                lower += str.charAt(i);
            }
        }
        return lower;
    }

    public static void main(String[] args) {
        String str = "Hello World";

        String s = extractSubstring(str, 2, 7);
        System.out.println(s);

        int index = findChar(str, 'o');
        System.out.println(index);

        String lower = toLowerCase(str);
        System.out.println(lower);

    }
}
