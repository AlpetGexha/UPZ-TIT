package java8;

public class DrawFirstLetter {

    public static void main(String[] args) {
        int row = 6;
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0 || j == i || i == (row / 2)) {
                    System.out.print(j+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
