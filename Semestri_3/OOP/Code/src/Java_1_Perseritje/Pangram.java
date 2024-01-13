package Java_1_Perseritje;

public class Pangram {
	
	public static boolean isPangram(String str) {
		str = str.toLowerCase();
		int [] chars = new int[26];
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == ' ')
				continue;
			int in = (int)c - 97;
			chars[in]++;
		}
		for(int i = 0; i < chars.length; i++) {
			if(chars[i] == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		boolean isPangram = isPangram(str);
		System.out.println(isPangram);
	}
}