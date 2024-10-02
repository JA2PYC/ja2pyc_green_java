package ch02.pac03;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// Compile Error Int Operation
		// byte byteValue3 = byteValue1 + byteValue2;

		int intValue1 = byteValue1 + byteValue2;
		System.out.println("intValue 1 : " + intValue1);

		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println("intValue 2 : " + intValue2);
		System.out.println("(char) intValue 2 : " + (char) intValue2);

		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println("intValue 4 : " + intValue4);

		int intValue5 = 10;
		// Compile Error
		// int intValue6 = 10 / 4.0;
		double doubleValue = intValue5 / 4.0;
		System.out.println("doubleValue : " + doubleValue);

		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println("result : " + result);
	}

}
