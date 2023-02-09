package Challage;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};

        int[] tmp = shuffle(arr, 3);
        for (int i = 0; i < tmp.length; i++) {
            System.out.print(tmp[i] + " ");
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            arr[j] = nums[i];
            j++;

            arr[j] = nums[i + n];
            j++;

        }
        return arr;
    }
}

