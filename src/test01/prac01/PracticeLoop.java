package test01.prac01;

import java.util.Scanner;

public class PracticeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Practice 1
		Scanner scanner = new Scanner(System.in);
		int deposit = 0;

		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 예금 || 2.출금 || 3.조회 || 4.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택>");
			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				System.out.print("예금액>");
				userInput = scanner.nextLine();
				try {
					deposit += Integer.parseInt(userInput);
				} catch (Exception e) {
					System.out.println("예금액을 입력해 주세요.");
					continue;
				}
				System.out.println("예금 잔액 : " + deposit);
				continue;
			} else if (userInput.equals("2")) {
				System.out.print("출금액>");
				userInput = scanner.nextLine();
				try {
					deposit -= Integer.parseInt(userInput);
				} catch (Exception e) {
					System.out.println("출금액을 입력해주세요.");
					continue;
				}
				System.out.println("예금 잔액 : " + deposit);
				continue;
			} else if (userInput.equals("3")) {
				System.out.println("예금 조회 : " + deposit);
				continue;
			} else if (userInput.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘 못된 선택입니다.");
				continue;
			}
		}
		
		scanner.close();
		System.out.println("--------------------------------------------------");
	}

}
