package Java_13;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {

//
        Scanner s = new Scanner(System.in);
        System.out.println("Shkruani disa numra 1 2 3 4 (te ndahen me space) : ");

        String input = s.nextLine().replaceAll("[a-zA-Z]", " ").replaceAll("^0", " ").replaceAll(" +", " ").trim();

        System.out.println(input);

        String[] inputArray = input.split(" ");

        int[] vargu = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            vargu[i] = Integer.parseInt(inputArray[i]);
        }


        System.out.println("\n----------------- ME FOR -----------------");
        System.out.println(withFor(vargu));

        System.out.println("\n----------------- ME While -----------------");
        System.out.println(withWhile(vargu));

        System.out.println("\n----------------- ME Do While -----------------");
        System.out.println(withDoWhile(vargu));

        System.out.println("\n----------------- ME Recursion -----------------");
        System.out.println(withRecursion(vargu, 0, vargu.length - 1));

        System.out.println(withRecursion2(vargu, 0, vargu.length - 1));

    }

    public static int withFor(int[] input) {
        int min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min)
                min = input[i];
        }

        return min;
    }

    public static int withWhile(int[] input) {
        int min = input[0];
        int i = 1;

        while (i < input.length) {
            if (input[i] < min)
                min = input[i];
            i++;
        }

        return min;
    }

    public static int withDoWhile(int[] input) {
        int min = input[0];
        int i = 1;

        do {
            if (input[i] < min)
                min = input[i];
            i++;
        } while (i < input.length);

        return min;
    }

    //    Find minumum number using recursion
    public static int withRecursion(int[] input, int start, int end) {
        if (start == end)
            return input[start];

        int min = withRecursion(input, start + 1, end);

        if (input[start] < min)
            return input[start];

        return min;

    }

    public static int withRecursion2(int[] input, int start, int end) {

        if (start == end) return input[start];

        int mid = (start + end) / 2;
        int min1 = withRecursion2(input, start, mid);
        int min2 = withRecursion2(input, mid + 1, end);

        return Math.min(min1, min2);
    }
}
