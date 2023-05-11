package Java_7_Stack;

import java.util.Stack;

public class StackApp {

    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello World!"));
    }
}
