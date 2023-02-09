package Ushtrime_porvimi;

public class Detyra_2_fjalt_tek {
    public static void main(String[] args) {
        String str = "Nje ditë e bukur por e gjatë!";

        System.out.println(fjaltTekMrapsht(str));
        //        System.out.println(reverseTek(str));
    }

    public static String fjaltTekMrapsht(String str){
        String rezultati = "";

        String falit[] = str.split(" ");

    // Nje  -> 1 -1
    // ditë -> 2 - 1
    // e    -> 3 - 1
    // bukur -> 4
    // por   -> 5
    // e     -> 6
    // gjatë -> 7

        for (int i = 0; i < falit.length ; i++) {

            if(i % 2 == 0){
                rezultati += mrapsht(falit[i]) + " ";
            } else {
                rezultati += falit[i] + " ";
            }

        }

        return rezultati;
    }

    public static String mrapsht(String str){
        String resultati = "";
//        0,1,2,3,4
//        4,3,2,1,0
//        Alpet
//        teplA

        for (int i = str.length() - 1; i >= 0 ; i--) {
            resultati += str.charAt(i);
        }

        return resultati;
    }
}
