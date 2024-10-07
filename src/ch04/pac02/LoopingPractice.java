package ch04.pac02;

import java.util.Scanner;

public class LoopingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question 2
		int sumQ2 = 0;
		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 3 == 0) {
				sumQ2 += (i + 1);
				System.out.println("i : " + (i + 1));
			}
		}
		System.out.println("sumQ2 : " + sumQ2);

		// Question 3
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("Num 1 : " + num1 + ", Num 2 : " + num2);
			if ((num1 + num2) == 5) {
				System.out.println("합계가 5입니다.");
				break;
			}
		}

		// Question 4
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if ((x * 4) + (y * 5) == 60) {
					System.out.println("4 * " + x + " + 5 * " + y + " = " + ((4 * x) + (5 * y)));
				}
			}
		}

		// Question 5
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// Question 5 with printf()
		System.out.println("Question 5 with printf()");
		for (int i = 0; i < 4; i++) {
			String str = "";
			for (int j = 0; j < 4; j++) {
				if (i >= j) {
					str = str.concat("*");
				}
			}
			System.out.printf("%-4s\n", str);
		}

		// Question 6
		for (int i = 0; i < 4; i++) {
			for (int j = 3; j >= 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// Question 6 with printf()
		System.out.println("Question 6 with printf()");
		for (int i = 0; i < 4; i++) {
			String str = "";
			for (int j = 0; j < 4; j++) {
				if (i >= j) {
					str = str.concat("*");
				}
			}
			System.out.printf("%4s\n", str);
		}

		// Question 7
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.에금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");

			String scannerInput = scanner.nextLine();
			if (scannerInput.equals("1")) {
				System.out.print("예금액> ");
				String deposits = scanner.nextLine();
				int depositsInt = Integer.parseInt(deposits);
				balance += depositsInt;
				System.out.println("잔액> " + balance);
			} else if (scannerInput.equals("2")) {
				System.out.print("출금액> ");
				String withdrawals = scanner.nextLine();
				int withdrawalsInt = Integer.parseInt(withdrawals);
				balance -= withdrawalsInt;
				System.out.println("잔액> " + balance);
			} else if (scannerInput.equals("3")) {
				System.out.println("잔액> " + balance);
			} else if (scannerInput.equals("4")) {
				break;
			} else {
				System.out.println("적절하지 않은 입력입니다. (1~4)를 입력해주세요.");
			}
		}

		System.out.println("프로그램 종료.");
	}

}
