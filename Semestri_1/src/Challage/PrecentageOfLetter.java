package Challage;

public class PrecentageOfLetter {
    public static void main(String[] args) {
        String str = "foobar";
        char c = 'o';

        int count = 0;
        int total = str.length();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) count++;
        }

        int res = (count * 100) / total;
        System.out.println(res);

    }
}
