package Java_12;

public class ReplaceWith {

    /**
     * Zëvendësoni dukuritë e një karakteri me një karakter tjetër
     *
     * @param str String që do të përpunohet
     * @param c   karakteri që do të zëvendësohet
     * @param j   karakteri që do të vendoset në vend të karakterit të zëvendësuar
     * @return String që përmban karakteret e stringut të dhënë, por duke zëvendësuar
     */
    public static String replaceWith(String str, char c, char j) {
        String replacement = "";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (letter == c) letter = j;
            replacement += letter;
        }

        return replacement;
    }

    public static void main(String[] args) {
        String s = "pwrshwndetje nga JAVA";

        System.out.println(replaceWith(s, 'w', 'ë'));
        System.out.println("--------------------------");
        System.out.println(s.replace('w', 'ë'));
    }
}
