package ch02.pac01;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		int v2 = 0;
		if (v1 > 10) {
			// Scope Error
			// int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		
		System.out.println("V3 : " + v3);
	}

}
