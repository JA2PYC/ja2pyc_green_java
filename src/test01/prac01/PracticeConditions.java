package test01.prac01;

import java.util.Scanner;

public class PracticeConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Practice 1
		Scanner scanner = new Scanner(System.in);
		System.out.print("3의 배수 판별기 숫자를 입력하세요>");
		int userInput = scanner.nextInt();
		if ((userInput % 3) == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		scanner.nextLine();

		// Practice 2
		System.out.print("홀수 짝수 판별기 숫자를 입력하세요>");
		userInput = scanner.nextInt();
		if ((userInput % 2) != 0) {
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("짝수 입니다.");
		}
		scanner.nextLine();

		// Practice 3
		System.out.print("학점을 입력하세요>");
		userInput = scanner.nextInt();
		if (userInput >= 90) {
			System.out.println("학점 : A");
		} else if (userInput >= 80) {
			System.out.println("학점 : B");
		} else if (userInput >= 70) {
			System.out.println("학점 : C");
		} else if (userInput >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
		System.out.println("좀 더 노력하세요.");
        scanner.nextLine();

		// Practice 4
		System.out.println("수식을 입력하세요>");
		String userString = scanner.nextLine();
		String[] stringArr = userString.split(" ");
		if (stringArr.length != 3) {
			System.out.println("수식의 인수가 부족합니다.");
			scanner.close();
			return;
		}

		try {
			double firstNumber = Double.parseDouble(stringArr[0]);
			String operator = stringArr[1];
			double secondNumber = Double.parseDouble(stringArr[2]);
			double result = 0;

			switch (operator) {
			case "+":
				result = firstNumber + secondNumber;
				break;
			case "-":
				result = firstNumber - secondNumber;
				break;
			case "*":
				result = firstNumber * secondNumber;
				break;
			case "/":
				if (secondNumber == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					scanner.close();
					return;
				}
				result = firstNumber / secondNumber;
				break;
			default:
				System.out.println("계산할 수 없는 연산자 입니다.");
				scanner.close();
				return;
			}

			System.out.printf("계산 결과는 %.2f 입니다.\n", + result);
		} catch (Exception e) {
			System.out.println("계산할 수 없습니다.");
		}

		scanner.close();
		System.out.println("---------- 프로그램 종료 --------------------");
	}

}
