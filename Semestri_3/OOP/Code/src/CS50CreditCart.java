public class CS50CreditCart {
    public static void main(String[] args) {
//        4003600000000014
        String n = "4003600000000014";
        int check_sum = 0;
        int other_sum = 0;

        for (int i = 0; i < n.length(); i++) {

            if (i % 2 == 0) {
                int num = Character.getNumericValue(n.charAt(i));
                num *= 2;
                if (num > 9) {
                    num -= 9;
                }
                check_sum += num;
            } else {
                int num = Character.getNumericValue(n.charAt(i));
                other_sum += num;
            }

        }
        int total_sum = check_sum + other_sum;
        if (total_sum % 10 == 0) {
            System.out.println(total_sum);
            System.out.println(check_sum);
            System.out.println("Valid");
            System.out.println(cartType(n));
        } else {
            System.out.println("Invalid");
        }

    }

    public static String cartType(String cart) {
        if (cart.startsWith("34") || cart.startsWith("37")) {
            return " American Express";
        }

        if (cart.startsWith("51") || cart.startsWith("52") || cart.startsWith("53") || cart.startsWith("54") || cart.startsWith("55")) {
            return "MASTER CARD";
        }

        if (cart.startsWith("4")) {
            return "VISA";
        }

        return "SOMETHING ELSE";
    }
}
