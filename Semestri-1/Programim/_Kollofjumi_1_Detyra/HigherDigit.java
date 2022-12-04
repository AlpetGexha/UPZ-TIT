package Challange;

import java.util.Scanner;

public class HigherDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();


        if (!(n > 1000 && n < 10000)) {
            System.out.println("Nuk je kerka me numra 4shifor");
            return;
        }

//        get all digits
        int sh1 = n % 10;
        n /= 10;

        int sh2 = n % 10;
        n /= 10;

        int sh3 = n % 10;
        n /= 10;

        int sh4 = n % 10;
        n /= 10;

//        Sort all digit by higher number
        int max = 0;
        if (max < sh1) max = sh1;

        if (max < sh2) max = sh2;

        if (max < sh3) max = sh3;

        if (max < sh4) max = sh4;

//        4392


        System.out.print(max);

        if (max == sh1) sh1 = 0;
        else if (max == sh2) sh2 = 0;
        else if (max == sh3) sh3 = 0;
        else if (max == sh4) sh4 = 0;

        max = 0;

        if (max < sh1) max = sh1;

        if (max < sh2) max = sh2;

        if (max < sh3) max = sh3;

        if (max < sh4) max = sh4;


        System.out.print(max);

        if (max == sh1) sh1 = 0;
        else if (max == sh2) sh2 = 0;
        else if (max == sh3) sh3 = 0;
        else if (max == sh4) sh4 = 0;

        max = 0;

        if (max < sh1) max = sh1;

        if (max < sh2) max = sh2;

        if (max < sh3) max = sh3;

        if (max < sh4) max = sh4;


        System.out.print(max);

        if (max == sh1) sh1 = 0;
        else if (max == sh2) sh2 = 0;
        else if (max == sh3) sh3 = 0;
        else if (max == sh4) sh4 = 0;

        max = 0;

        if (max < sh1) max = sh1;

        if (max < sh2) max = sh2;

        if (max < sh3) max = sh3;

        if (max < sh4) max = sh4;


        System.out.print(max);

    }
}
