package test01.prac02;

import java.util.Scanner;

public class PracticeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산하고자 하는 두 정수 값과 연산자를 입력하세요.>");
		String userString = scanner.nextLine();

		Calculator calculator = new Calculator();
		calculator.callCalculator(userString);
		
		scanner.close();
	}

}
