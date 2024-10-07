package ch03.pac02;

public class TestPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable Test
		// Qeustion 1
		// 논리형
		// boolean booleanVar;

		// 정수형
		// byte byteVar; // 1byte
		// short shortVar; // 2byte
		// char charVar; // 2byte
		// int intVar; // 4byte
		// long longVar; // 8byte

		// 실수형
		// float floatVar; // 4byte
		// double doubleVar; // 8byte

		// Question 2
		// long regNo = 12345678901234L;

		// Question 3
		// 리터럴
		// 100, 100L, 3.14f
		// 변수
		// i, l, PI
		// 키워드
		// int, long, float
		// 상수
		// final

		// Question 4
		// b.Byte

		// Question 5
		System.out.println("1" + "2"); // 12
		System.out.println(true + ""); // true String
		System.out.println('A' + 'B'); // 65 + 66 = 131
		System.out.println('1' + 2); // 49 + 2 = 51
		System.out.println('1' + '2'); // 49 + 50 = 99
		System.out.println('J' + "ava"); // Java
		// System.out.println(true + null); // Error Type mismatch

		// Question 6
		// b.True c.NULL d.Class e.System

		// Question 7
		// a.$ystem c.7eleven d.If g.$MAX_NUM

		// Question 8
		// b.long e.double

		// Question 9
		// d.float f= l; e.i = ch;
		// byte b = 10;
		// char ch = 'A';
		// int i = 100;
		// long l = 1000L;

		// Question 10
		// 0 ~ 65535

		// Question 11
		// a.byte b = 256; b.char c = ''; c.char answer = 'no'; d.float f =3.14;

		// Question 12
		// c.float floatVar = 0.0;

		// Operator Test
		// Question 1
		int x = 2;
		int y = 5;
		char c = 'A';

		System.out.println(1 + x << 33); // 1 + 10 = 1100000000000000000000000 Overflow 110
		System.out.println(y >= 5 || x < 0 && x > 2); // true
		System.out.println(y += 10 - x++); // 13 // X = 3 Y =13
		System.out.println(x += 2); // 5 // X = 5
		System.out.println(!('A' <= c && c <= 'z')); // false
		System.out.println('C' - c); // 2
		System.out.println('5' - '0'); // 5
		System.out.println(c + 1); // 66
		System.out.println(++c); // B
		System.out.println(c++); // B
		System.out.println(c); // C

		// Question 2
		int appleQuantity = 123;
		int basketSize = 10;
		int requireBasket;
		if (appleQuantity % basketSize == 0) {
			requireBasket = appleQuantity / basketSize;
		} else {
			requireBasket = appleQuantity / basketSize + 1;
		}
		System.out.println(requireBasket);

		// Question 3
		double randomNum = Math.random();
		if (randomNum > 0.6) {
			randomNum = 1;
		} else if (randomNum < 0.4) {
			randomNum = -1;
		} else {
			randomNum = 0;
		}

		System.out.println(randomNum);
		String randomNumResult = randomNum > 0 ? "양수" : (randomNum < 0 ? "음수" : "0");
		System.out.println(randomNumResult);

		// Question 4
		byte q4a = 10;
		byte q4b = 20;
		byte q4c = (byte) (q4a + q4b);
		System.out.println("Q4C : " + q4c);

		char q4ch = 'A';
		q4ch = (char) (q4ch + 2);
		System.out.println("Q4CH : " + q4ch);

		float q4f1 = (float) 3 / 2;
		long q4l = 3000L * 3000 * 3000;
		System.out.println("Q4F : " + q4f1);
		System.out.println("Q4L : " + q4l); // int Overflow

		float q4f2 = 0.1f;
		double q4d = 0.1;
		boolean q4Result = (float) q4d == q4f2;
		System.out.println("Q4Result : " + q4Result);

		// Question 5
		double q5rand = Math.random();
		char q5ch;
		if (q5rand > 0.8) {
			q5ch = 'a';
		} else if (q5rand > 0.6) {
			q5ch = 'A';
		} else if (q5rand > 0.4) {
			q5ch = '0';
		} else {
			q5ch = '!';
		}

		boolean q5b = false;
		if (q5ch >= 97 && q5ch <= 122) {
			q5b = true;
		} else if (q5ch >= 65 && q5ch <= 90) {
			q5b = true;
		} else if (q5ch >= 48 && q5ch <= 57) {
			q5b = true;
		}

		System.out.println("Q5CH : " + q5ch);
		System.out.println("Q5B : " + q5b);
	}

}
