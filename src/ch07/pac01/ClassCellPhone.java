package ch07.pac01;

import java.util.Scanner;

public class ClassCellPhone {
	// Field
	String model;
	String color;

	// Constructor
	ClassCellPhone() {
	}

	ClassCellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// Method
	// Final Can't Override
	final void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	protected void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	protected void bell() {
		System.out.println("벨이 울립니다.");
	}

	void catchCall(Scanner scanner) {
		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.말한다 || 2.듣는다 || 3.전화 끊기");
			System.out.println("--------------------------------------------------");
			System.out.print("기능(1~3)을 선택하세요>");
			String userInput;
			userInput = scanner.nextLine();
			if (userInput.isEmpty()) {
				System.out.println("기능을 입력하세요.");
				continue;
			}

			int selectedFunction;
			try {
				selectedFunction = Integer.parseInt(userInput);
			} catch (Exception e) {
				System.out.println("기능을 숫자로 입력하세요.");
				continue;
			}

			String message;
			switch (selectedFunction) {
			case 1:
				System.out.print("메시지를 입력하세요>");
				message = scanner.nextLine();
				sendVoice(message);
				continue;
			case 2:
				System.out.print("메시지를 입력하세요>");
				message = scanner.nextLine();
				receiveVoice(message);
				continue;
			case 3:
				hangUp();
				break;
			default:
				System.out.println("기능을 다시 선택하세요.");
				continue;
			}
			System.out.println("-------------------- 통화종료 --------------------");
			break;
		}
	}

	void sendVoice(String message) {
		System.out.println("나 : " + message);
	}

	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

	void getInfo() {
		System.out.println("모델 : " + this.model);
		System.out.println("색상 : " + this.color);
	}
}
