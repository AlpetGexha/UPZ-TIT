package java7;

import java.util.Scanner;

public class VitiBrisht {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep vitin: ");
        int viti = s.nextInt();

        boolean isLeap;

//        boolean isleap = ((viti % 4 == 0 && viti % 100 !=0) || (viti % 400 == 0));

        if (viti % 4 == 0) {
            if (viti % 100 != 0) {
                isLeap = true;
            } else {
                if (viti % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            }
        } else {
            isLeap = false;
        }

        if (isLeap) {
            System.out.println("Viti eshte brisht");
        } else {
            System.out.println("Viti nuk eshte brisht");
        }
    }
}
