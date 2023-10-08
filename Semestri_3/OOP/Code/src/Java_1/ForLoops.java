package Java1;

public class ForLoops {
	
	public static void patternA(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i <= j)
					System.out.print((i + j - 1) + " ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
	
	public static void patternB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if((i + j) % 2 == 0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		patternB(4);
	}
}