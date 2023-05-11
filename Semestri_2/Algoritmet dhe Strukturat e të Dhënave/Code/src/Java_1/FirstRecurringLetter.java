package Java_1;

public class FirstRecurringLetter {

    public static void main(String[] args) {
        String str = "qwertyuio1123456789lkjhgfvbnmqzxcvbnm34567890oifdcvbnkoytfvbnfjdshhfjkhsdajfksdajfsjdjsahdjashdjkash8934782jsadhd89y3oe293jkdasjkhdjkashd879213ey2918yjkhsajkdhasd821ye12jdhajkdhh29duiahd uqhfewuifuifbwe 789@#$%^&*(*&^RFDGhjsad0asuytdg)&^%$R^&*d9pasodjgasf#$%^&*((*7d654rASTgvhbjasdp9o*&^%$ER%^&*d09paslkjdgaE%^&*(ODkjasgfd5a^%&*kiytrdcnktrdcvbjytrdcvbnjytrdcvbhjytf";
// System.out.println("Elapsed time A1: " + String.format("%.3f", (double)elapsedTime / 1000000) + " ms");

//
        long startTime_1 = System.nanoTime();
        System.out.println("firstRecurringLetterSimple: " + firstRecurringLetterSimple(str));
        long endTime_1 = System.nanoTime();

        long elapsedTime_1 = endTime_1 - startTime_1;
        System.out.printf("Koha runtime per firstRecurringLetterSimple: %.3f ms%n", (double) elapsedTime_1 / 1000000);
        System.out.println("===========================================");

        long startTime_2 = System.nanoTime();
        System.out.println("findFirstRecurringASCII " + findFirstRecurringASCII(str));
        long endTime_2 = System.nanoTime();

        long elapsedTime_2 = endTime_2 - startTime_2;
        System.out.printf("Koha runtime per findFirstRecurringASCII: %.3f ms%n", (double) elapsedTime_2 / 1000000);
        System.out.println("===========================================");


        long startTime_3 = System.nanoTime();
        System.out.println("findFirstRecurringChar: " + findFirstRecurringChar(str));
        long endTime_3 = System.nanoTime();

        long elapsedTime_3 = endTime_3 - startTime_3;
        System.out.printf("Koha runtime per findFirstRecurringChar: %.3f ms%n", (double) elapsedTime_3 / 1000000);
        System.out.println("===========================================");


        long startTime_4 = System.nanoTime();
        System.out.println("findFirstRecurringCharLower:  " + findFirstRecurringCharLower(str));
        long endTime_4 = System.nanoTime();


        long elapsedTime_4 = endTime_4 - startTime_4;
        System.out.printf("Koha runtime per findFirstRecurringCharLower: %.3f ms%n", (double) elapsedTime_4 / 1000000);
        System.out.println("===========================================");
    }

    //    Secili me secilin
    public static char firstRecurringLetterSimple(String str) {

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (c == str.charAt(j)) {
                    return c;
                }
            }
        }

        return '\0';
    }


    // Kjo medhodhe eshte per te gjitha karakteret
    public static char findFirstRecurringASCII(String str) {
        int[] charCounts = new int[256]; // assuming ASCII character set
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charCounts[ch] != 0) {
                return ch;
            }
            charCounts[ch] = i + 1;
        }

        return '\0';
    }

    // Krijojme nje varg per te numruar te gjitha karakteret nga a-zA-Z 52 karaktere ne total
    // Kur nje karakteri hyn ne loop atehere rrite per 1 ne vargun me indeksin e perkates
    // Nese karakteri perseritet ai e ka vleren 1 dhe e dijm se eshte i perseritur dhe e kthejm ate karater
    public static char findFirstRecurringChar(String str) {

        int[] charCounts = new int[52]; // Shkronjat nje Anglisht 26 per te medha dhe 26 per te vogla
        for (char c : str.toCharArray()) { // foreach loop
            if (c >= 'a' && c <= 'z') { // per karakteret e vogla
                // Nese karakteri aktual eshte 1, atehere eshte karakteri i pare qe perseritet
                if (charCounts[c - 'a'] == 1) {
                    return c;
                }
                // rrit indeksin korret te karakterit
                charCounts[c - 'a']++;
            } else if (c >= 'A' && c <= 'Z') { // per karakteret e medha
                if (charCounts[c - 'A' + 26] == 1) {
                    return c;
                }
                charCounts[c - 'A' + 26]++;
            }
        }
        return '\0';
    }

    // i njejti si metoda me lart por vetem se te gjitha karakteret kthehen ne lowercase
    public static char findFirstRecurringCharLower(String str) {
        int[] charCounts = new int[26];
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (charCounts[c - 'a'] == 1) {
                    return c;
                }
                charCounts[c - 'a']++;
            }
        }
        return '\0';
    }
}


