package ch99.pac01;

public class RecursiveFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abacbd";
		boolean[] booleanArr = new boolean[256];
		String result = recursiveFunction(str, str.length()-1, booleanArr); // ("abacbd", 5, [false * 256])
		System.out.println("Result : " + result);
		
	}

	static String recursiveFunction(String str, int index, boolean[] booleanArr) {
		if (index < 0) {
			return "";
		}
		char charValue = str.charAt(index); // d(100), 5
		String result = recursiveFunction(str, index-1, booleanArr);  
		if (!booleanArr[charValue]) { // booleanArr[a] -> [b] -> [a] -> [c] -> [b] -> [d]  
			booleanArr[charValue] = true;
			return charValue + result;
		}
		return result; // dcba
		
		// Result Flow
		// ""
		// a + ""
		// b + a
		// ba
		// c + ba
		// cba
		// dcba
	}
}
