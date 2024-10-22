package test01.prac02;

import java.util.Scanner;

public class PracticeSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("입력>");
		String userInput = scanner.nextLine();

		solution(userInput);
		
		scanner.close();
	}

	static void solution(String userInput) {
		try {
			String[] stringArr = userInput.split(" ");
			
			if (stringArr.length != 2) {
				System.out.println("수식의 인수는 2개 이어야 합니다. 띄어쓰기로 구분해주세요.");
				return;
			}
			
			int firstNumber = Integer.parseInt(stringArr[0]);
			int secondNumber = Integer.parseInt(stringArr[1]);
			int sumResult = 0;
			
			if (firstNumber <= secondNumber) {
				for (int i = firstNumber; i <= secondNumber; i ++ ) {
					sumResult += i;
				}
			} else {
				for (int i = firstNumber; i >= secondNumber; i--) {
					sumResult += i;
				}
			}
			
			System.out.println(firstNumber + " " + secondNumber + " " + sumResult);
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			return;
		}
	}
}
