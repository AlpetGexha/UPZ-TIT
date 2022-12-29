package Java_10;

import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep nje numer me 6 shifra: ");
        int n = s.nextInt();
        int tmp = n;

//        Shiko nese numri eshte 6 shifror
        if (!(n > 100000 && n < 1000000)) {
            System.out.println("Nuk je kerka me numra 4shifor");
            return;
        }

//        Nxjerrja e shifres se pare

        int sh1 = n % 10;
        n /= 10;

        int sh2 = n % 10;
        n /= 10;

        int sh3 = n % 10;
        n /= 10;

        int sh4 = n % 10;
        n /= 10;

        int sh5 = n % 10;
        n /= 10;

        int sh6 = n % 10;
        n /= 10;

//        Nese numri eshte i renditur
        if (sh1 < sh2 && sh2 < sh3 && sh3 < sh4 && sh4 < sh5 && sh5 < sh6) {
            System.out.println("Numri eshte i renditur nga i me i madh");
            return;
        }

//        Nxerr shifrat nga i me i madhi
        for (int i = 0; i < 6; i++) {
            int max = 0;

            if (max < sh1) max = sh1;
            if (max < sh2) max = sh2;
            if (max < sh4) max = sh4;
            if (max < sh5) max = sh5;
            if (max < sh3) max = sh3;
            if (max < sh6) max = sh6;

            System.out.print(max);

            if (max == sh1) sh1 = 0;
            else if (max == sh2) sh2 = 0;
            else if (max == sh3) sh3 = 0;
            else if (max == sh4) sh4 = 0;
            else if (max == sh5) sh5 = 0;
            else if (max == sh6) sh6 = 0;
        }
    }
}

