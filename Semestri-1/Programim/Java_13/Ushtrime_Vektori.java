package Java_13;


/*
 * Vektort ne Poziten TEK dhe Shifrat Cift
 *
 *  */

public class Ushtrime_Vektori {
    public static void main(String[] args) {

        int[] v = {1, 2, 3, 10, 2, 4, 10, 10, 3, 21, 312, 312,312,312,312,312, 3, 123, 12, 3, 123, 12, 13};
        dd(tekCift(v));
        int[] i = tekCift(v);
        System.out.println("Numra Cift " + i[0]);
        System.out.println("Numra Tek "  + i[1]);

        System.out.println(secondMax(v));

    }

    public static int[] tekCift(int[] nums) {

        int[] count = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count[0]++;
            else count[1]++;
        }
        return count;
    }

    public static int shumaTek(int[] nums) {

        int acc = 0;

        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] % 2 == 0) {
                acc += nums[i];
            }
        }


        return acc;
    }


    public static int secondMax(int[] nums) {
        int max = nums[0];
        int secondMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax) {
//                shiko nese numir eshte i njejt
                if (nums[i] != max) {
                    secondMax = nums[i];
                }

            }
        }
        return secondMax;
    }

    public static void dd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] -> " + arr[i]);
        }
    }
}
