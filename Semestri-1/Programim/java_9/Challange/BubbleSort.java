package java10;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Jep nje numer me 6 shifra: ");
            int n = s.nextInt();
            int tmap = n;

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

            if (sh1 < sh2) swap(sh1, sh2);
            if (sh2 < sh3) swap(sh2, sh3);
            if (sh3 < sh4) swap(sh3, sh4);
            if (sh4 < sh5) swap(sh4, sh5);
            if (sh5 < sh6) swap(sh5, sh6);

            if (sh1 < sh2) swap(sh1, sh2);
            if (sh2 < sh3) swap(sh2, sh3);
            if (sh3 < sh4) swap(sh3, sh4);
            if (sh4 < sh5) swap(sh4, sh5);

            if (sh1 < sh2) swap(sh1, sh2);
            if (sh2 < sh3) swap(sh2, sh3);
            if (sh3 < sh4) swap(sh3, sh4);

            if (sh1 < sh2) swap(sh1, sh2);
            if (sh2 < sh3) swap(sh2, sh3);

            if (sh1 < sh2) swap(sh1, sh2);


            System.out.println(String.format("%d%d%d%d%d%d", sh1, sh2, sh3, sh4, sh5, sh6));
        }
    }

    public static void swap(int a, int b) {
//swapping logic
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
