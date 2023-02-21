package Challage;

public class fds {
    public static void main(String[] args) {

        System.out.println(firtLetterCapital("KETU SHENOHET VLERA E SHPENZIMIT PERKATES"));

    }
    public static String firtLetterCapital(String str) {
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
        }
        return res;
    }
}
