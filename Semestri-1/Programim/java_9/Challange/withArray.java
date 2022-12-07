package java10;

import java.util.ArrayList;
import java.util.Scanner;

public class withArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jep nje numer : ");
        int n = s.nextInt();
        int tmp = n;

        ArrayList<Integer> shifrat = new ArrayList<>();
        while (n > 0) {
            shifrat.add(n % 10);
            n /= 10;
        }

//        bubble sort shifrat
        for (int i = 0; i < shifrat.size(); i++) {
            for (int j = 0; j < shifrat.size() - 1; j++) {
                if (shifrat.get(j) < shifrat.get(j + 1)) {
                    int tmp1 = shifrat.get(j);
                    shifrat.set(j, shifrat.get(j + 1));
                    shifrat.set(j + 1, tmp1);
                }
            }
        }

        for (int i = 0; i < shifrat.size(); i++) {
            System.out.print(shifrat.get(i));
        }

    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
