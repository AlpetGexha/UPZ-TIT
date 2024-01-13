package Java_1_Perseritje;

import java.util.Scanner;

public class CountingBits2 {
	
	public static void display(int [] v) {
		System.out.print("[");
		for(int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if(i < v.length-1)
				System.out.print(", ");
		}
		System.out.print("]");
	}
	
	public static int convertAndCount(int n) {
		int count1 = 0;
		while(n > 0) {
			if(n % 2 == 1)
				count1++;
			n /= 2;
		}
		return count1;
	}

	public static int[] countingBits(int n) {
		int [] ans = new int[n+1];
		
		for(int i = 0; i <= n; i++) {
			int c = convertAndCount(i);
			ans[i] = c;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("n = ");
		int n = s.nextInt();
		int [] ans = countingBits(n);
		display(ans);
		s.close();
	}
}
