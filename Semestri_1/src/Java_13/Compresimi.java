package Java_13;

public class Compresimi {
    public static void main(String[] args) {

        String str = "aaaabbbbcccccddddeeee";

        System.out.println(comprese(str));
    }

    public static String comprese(String str) {
        String output = "";

        int counter = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) // nese numri i karaktereve eshte i barabarte me gjatesine e stringut
                output += str.charAt(i) + "" + counter;

            else if (str.charAt(i) == str.charAt(i + 1)) counter++;

            else {
                output += str.charAt(i) + "" + counter;
                counter = 1;
            }
        }

        return output;
    }
}
