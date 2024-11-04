package quiz01;

public class Quiz09 {
	public static String rf (String str, int index, boolean[] seen) {
		if (index < 0) return "";
		char c = str.charAt(index); // d -> char (int)
		String result = rf(str, index-1, seen);
		if (!seen[c]) {
			seen[c] = true;
			return c + result;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abacabcd";
		int length = str.length(); // 8
		boolean[] seen = new boolean[256];
		// "abacabcd", 7, seen@Adresss
		System.out.println(rf(str, length-1, seen));
	}

}
