package Challage;

public class NumriShumshifror {
    public static void main(String[] args) {
//        3854639327
//        3 me 7

//        tell wich number its the bigger first number or last
//        85463932
//        7

        int n = 854639327;
        int first = n;
        int last =  (n % 10);
        int count = 0;

        while (first > 0) {
            first = first / 10;
            count++;
        };


        System.out.println(count);
        int firstNumber = (int) (n / Math.pow(10, count - 1));
        System.out.println(firstNumber);
        System.out.println(last);

    }

}
