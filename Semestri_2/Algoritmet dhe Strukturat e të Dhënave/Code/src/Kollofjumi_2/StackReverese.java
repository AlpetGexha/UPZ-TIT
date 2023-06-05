package Kollofjumi_2;

import java.util.Stack;

public class StackReverese {

    public static void main(String[] args) {

        String str = "Alpet";
        System.out.println(reverse(str));

    }

    public static String reverse(String str) {
        Stack<Character> stack = new Stack<Character>();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()) {
            res += stack.pop();
        }

        return res;
    }

}
