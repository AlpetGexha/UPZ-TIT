package Challage;

import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {

        String str = "()()()";
        System.out.println( str + " is: " + isValidPattern(str));

        String str2 = "{(()))[]}";
        System.out.println( str2 + " is: " + isValidPattern(str2));

        String str3 = "{(()))[]}";
        System.out.println( str3 + " is: " + isValidPattern(str3));

        String str4 = "[()()()()()()]}{}{}{}{}{()({(()))[]}";
        System.out.println( str4 + " is: " + isValidPattern(str4));
    }

    public static boolean isValidPattern(String pattern) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);

            if (isOpening(ch))
                stack.push(ch);

            else if (isClosing(ch)) {
                if (stack.empty())
                    return false;

                if (!isMatching(stack.pop(), ch))
                    return false;
            }
            else
                return false;
        }

        return stack.empty();
    }

    private static boolean isOpening(char c) {
        return c == '(' ||
               c == '{' ||
               c == '[';
    }

    private static boolean isClosing(char c) {
        return c == ')' ||
               c == '}' ||
               c == ']';
    }

    private static boolean isMatching(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
}
