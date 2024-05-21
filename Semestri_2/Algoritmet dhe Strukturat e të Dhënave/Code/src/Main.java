public class Main {
    public static void main(String[] args) {

//        find if the string have a unique chars the complexity is O(n)
        String str = "Hello";
        System.out.println("String: " + str);
        System.out.println("Unique: " + isUnique(str));

    }

//    Detyra 6
    public static boolean isUnique(String str) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

}