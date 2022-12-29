package Provimi_Qeshor_2022;

public class Detyra_2_Numri_Perfekt {
    public static void main(String[] args) {
        String str = "Hello from jAVA nga Alpet";
//        Capitalize first letter for each word on string without using toUperCase() method
        System.out.println(title(str));

    }

    public static String title(String str) {
        String[] words = str.split(" ");
        String rezult = "";

//    Capitalize first letter for each word on string without using toUpperCase() method
        for (String word : words) {
            String firstLetter = word.substring(0, 1);
            String remainingLetters = word.substring(1);
            rezult += firstLetter.toUpperCase() + remainingLetters + " ";
        }
        return rezult;
    }
}
