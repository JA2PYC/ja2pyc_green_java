package ch05.pac01;

public class ReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			String str = "****";
			str = str.substring(0, (i + 1));
			System.out.printf("%-4s\n", str);
		}
	}

}
