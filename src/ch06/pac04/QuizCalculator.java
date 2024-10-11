package ch06.pac04;

import java.util.Scanner;

public class QuizCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Start Calculator
		System.out.println("계산기를 시작합니다.");

		// Set Scanner
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// Set First Number
			System.out.print("첫번째 숫자>");
			String userInput = scanner.nextLine();
			double firstNumber;
			try {
				firstNumber = Double.parseDouble(userInput);
			} catch (NumberFormatException e) {
				continue;
			}

			// Set Operator
			System.out.print("연산자를 선택하세요 (+,-,*,/) >");
			String operator = scanner.nextLine();
			int operatorType;
			if (operator.equals("+")) {
				operatorType = 0;
			} else if (operator.equals("-")) {
				operatorType = 1;
			} else if (operator.equals("*")) {
				operatorType = 2;
			} else if (operator.equals("/")) {
				operatorType = 3;
			} else {
				continue;
			}

			// Set Second Number
			System.out.print("두번째 숫자>");
			userInput = scanner.nextLine();
			double secondNumber;
			try {
				secondNumber = Double.parseDouble(userInput);
			} catch (NumberFormatException e) {
				continue;
			}

			ClassQuizCalculator calculator = new ClassQuizCalculator();
			double calcResult;
			switch (operatorType) {
			case 0:
				calcResult = calculator.getAdd(firstNumber, secondNumber);
				break;
			case 1:
				calcResult = calculator.getSub(firstNumber, secondNumber);
				break;
			case 2:
				calcResult = calculator.getMul(firstNumber, secondNumber);
				break;
			case 3:
				calcResult = calculator.getDiv(firstNumber, secondNumber);
				break;
			default:
				continue;
			}

			System.out.println("calcResult : " + calcResult);
			
			System.out.print("계산을 계속할까요? (Y/N)>");
			userInput = scanner.nextLine();
			if (userInput.equalsIgnoreCase("Y") || userInput.equalsIgnoreCase("YES")) {
				continue;
			}
			
			break;
		}

		scanner.close();
		System.out.println("계산기를 종료합니다.");
	}

}
