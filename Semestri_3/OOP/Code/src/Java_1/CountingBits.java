package Examples;

import java.util.Scanner;

public class CountingBits {
	
	public static void display(int [] v) {
		  System.out.print("[");
		for(int i = 0; i < v.length; i++) {
			System.out.print(v[i]);
			if(i < v.length-1)
				System.out.print(", ");
		}
		System.out.print("]");
	}
	
	public static String decimalToBinary(int n) {
		String r = "";
		while(n > 0) {
			r = (n % 2) + r;
			n = n / 2;
		}
		return r;
	}
	
	public static int count(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1')
				count++;
		}
		return count;
	}

	public static int[] countingBits(int n) {
		int [] ans = new int[n+1];
		
		for(int i = 0; i <= n; i++) {
			String b = decimalToBinary(i);
			int c = count(b);
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