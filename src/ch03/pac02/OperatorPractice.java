package ch03.pac02;

import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 1
		byte b = 5;
		// b = -b;
		b = (byte) -b;
		int result = 10 / b;
		System.out.println("Result : " + result);

		// Question 2
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println("X : " + x);
		System.out.println("Y : " + y);
		System.out.println("Z : " + z);

		// Question 3
		boolean stop = true;
		int stopCounter = 0;
		while (!stop) {
			System.out.println("Stop : " + stop + "StopCounter : " + stopCounter);
			stopCounter++;
			if (stopCounter > 10) {
				break;
			}
		}
		System.out.println("StopCounter : " + stopCounter);

		// Question 4
		int pencils = 534;
		int students = 30;

		int pencilsPerStudent = (pencils / students);
		System.out.println("pencilsPerStudent : " + pencilsPerStudent);

		int pencilsLeft = (pencils % students);
		System.out.println("pencilsLeft : " + pencilsLeft);

		// Question 5
		int var1 = 5;
		int var2 = 2;
//		double var3 = var1 / var2;
		double var3 = (double) var1 / var2;
		int var4 = (int) (var3 * var2);
		System.out.println("Var4 : " + var4);

		// Question 6
		int value = 356;
		System.out.println("Value : " + value / 356 * 300);

		// Question 7
		float value1 = 10f;
		float value2 = value1 / 100;
		if (value2 == (float) 0.1) {
			System.out.println("10% 입니다.");
		} else {
			System.out.println("10%가 아닙니다.");
		}
		System.out.printf("Value1 : %20.18f, Value2 : %20.18f, (float)0.1 : %20.18f\n", value1, value2, (float) 0.1);
		System.out.printf("(double)0.1 : %20.18f\n", (double) 0.1);

		// Question 8
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double) (lengthTop + lengthBottom) * height) / 2;
		System.out.println("Area : " + area);

		// Question 9
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("첫 번째 수 : ");
			String firstNumber = scanner.nextLine();
			System.out.print("두 번째 수 : ");
			String secondNumber = scanner.nextLine();
			System.out.println("------------------------------");
			if (Double.parseDouble(secondNumber) == 0) {
				String calcResult = "무한대";
				System.out.println("결과 : " + calcResult);
			} else {
				double calcResult = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
				System.out.println("결과 : " + calcResult);
			}
		} finally {

		}

		// Question 10
		int val1 = 10;
		int val2 = 3;
		int val3 = 14;
		double val4 = (double) val1 * val1 * Double.parseDouble(val2 + "." + val3);
		System.out.println("원의 넓이 : " + val4);

		// Question 11
		try {
			System.out.print("아이디 : ");
			String strName = scanner.nextLine();

			System.out.print("패스워드 : ");
			String strPassword = scanner.nextLine();
			int intPassword = Integer.parseInt(strPassword);

			if (strName.equals("java")) {
				if (intPassword == 12345) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패 : 패스워드가 일치하지 않음.");
				}
			} else {
				System.out.println("로그인 실패 : 아이디가 존재하지 않음.");
			}
		} finally {

		}

		// Question 12
		int valueX = 10;
		int valueY = 5;
		System.out.println("X : " + valueX + ", valueY : " + valueY);
		System.out.println("X>7 && Y<=5 : " + ((valueX > 7) && (valueY <= 5)));
		System.out.println("X%3 ==2 || Y%2 != 1 : " + ((valueX % 3 == 2) || (valueY % 2 != 1)));

		scanner.close();
		
		// Question 13
		int valueQ13 = 10;
		valueQ13 += 10;
		System.out.println("ValueQ13 : " + valueQ13);
		valueQ13 -= 10;
		System.out.println("ValueQ13 : " + valueQ13);
		valueQ13 *= 10;
		System.out.println("ValueQ13 : " + valueQ13);
		valueQ13 /= 10;
		System.out.println("ValueQ13 : " + valueQ13);
		valueQ13 %= 3;
		System.out.println("ValueQ13 : " + valueQ13);
		
		// Question 14
		int score = 85;
		String resultQ14 = (!(score>90) ? "가" : "나");
		System.out.println("Result : " + resultQ14);
	}

}
