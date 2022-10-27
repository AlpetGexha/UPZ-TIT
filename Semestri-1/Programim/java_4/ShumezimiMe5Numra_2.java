package Java4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ShumezimiMe5Numra_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (true) { // cikli per programin
            boolean checkError = false;
            while (!checkError) { // cilki per kontrollimin e gabimeve ne rastin tone deri sa te jete numri i sakte me 5 shifra
                try {
                    System.out.print("Jep numrin me 5 shifra: ");
                    String numri = s.nextLine().replaceAll("\\s", ""); // hiq white space ne string
                    //replaceAll("([a-zA-Z])", ""); // hiq Karaktert

//                Shiko nese Stringu eshte numer
                    if (!Pattern.matches("[0-9]+", numri)) {
                        throw new Exception(String.format(" \"%s\" nuk eshte number!\n", numri));
                    }

//                Shiko nese Stringu ka 5 shifra
                    if (numri.length() != 5) {
                        throw new Exception("Numri duhet te jete me 5 shifra!\n");
                    }

//                Kthe stringun ne numer
                    int numriInt = Integer.parseInt(numri);

//                Jep shumezimin e shifrave
                    System.out.println(String.format("Shumezimi i shifrave te numrit %d eshte: %d \n", numriInt, shumezoShifratE(numriInt)));
                    checkError = true;

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
        }
    }

    /**
     * Metoda e shumezimit te numrave sipas shifrave
     *
     * @param n numri qe do te shumezojme
     * @return shumezimin e shifrave te numrit
     */
    public static int shumezoShifratE(int n) {
        int shumezimi = 1; // 1 sepse nese eshte 0 shumezimi do te jete 0

        while (n > 0) {
            shumezimi *= n % 10;
            n /= 10;
        }

        return shumezimi;
    }

}
