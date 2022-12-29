package Java_13;

public class FirstLetter {
    public static void main(String[] args) {

        int number = 887901;

        System.out.println("----------------- Me Int -----------------");
        System.out.println(firstNumberOf(number));

        System.out.println("----------------- Me String -----------------");
        System.out.println(firstNumberOf(number));
    }

    public static int firstNumberOf(int number) {
        int firstNumber = 0;

        while (number > 0) {
            firstNumber = number % 10;
            number /= 10;
        }

        return firstNumber;
    }

    public static int firstNumberOf(String number) {
        return Integer.parseInt(number.substring(0, 1));
    }
}
