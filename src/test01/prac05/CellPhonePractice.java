package test01.prac05;

import java.util.Scanner;

public class CellPhonePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CallDMBCellPhone with Scanner
		Scanner scanner = new Scanner(System.in);
		DmbCellPhone newCellPhoneScanner;
		
		System.out.println("초기 설정을 시작합니다.");
		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.print("모델명을 입력하세요>");
			String userInput = scanner.nextLine();

			if (userInput.isEmpty()) {
				System.out.println("모델명을 입력해 주세요.");
				continue;
			}
			String model = userInput;

			System.out.print("색상을 입력하세요>");
			userInput = scanner.nextLine();
			if (userInput.isEmpty()) {
				System.out.println("색상을 입력해 주세요.");
				continue;
			}
			String color = userInput;

			System.out.print("채널을 입력하세요>");
			userInput = scanner.nextLine();
			if (userInput.isEmpty()) {
				System.out.println("채널을 입력해 주세요.");
				continue;
			}
			int channel = Integer.parseInt(userInput);

			newCellPhoneScanner = new DmbCellPhone(model, color, channel);
			System.out.println("초기설정이 완료 되었습니다.");
			break;
		}

		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.전원 켜기 || 2. 전원 끄기 || 3.전화 받기 || 4.DMB 켜기 || 5.DMB 채널 변경 || 6.DMB 끄기");
			System.out.println("--------------------------------------------------");
			System.out.print("기능(1~6)을 선택하세요>");

			String userInput = scanner.nextLine();
			if (userInput.isEmpty()) {

				continue;
			}

			int selectedFunction;
			try {
				selectedFunction = Integer.parseInt(userInput);
			} catch (Exception e) {
				System.out.println("기능을 숫자로 입력하세요.");
				continue;
			}

			switch (selectedFunction) {
			case 1:
				newCellPhoneScanner.powerOn();
				continue;
			case 2:
				newCellPhoneScanner.powerOff();
				break;
			case 3:
				newCellPhoneScanner.bell();
				newCellPhoneScanner.catchCall(scanner);
				continue;
			case 4:
				newCellPhoneScanner.turnOnDMB();
				continue;
			case 5:
				int channelNumber;
				while (true) {
					System.out.print("변경할 채널을 입력하세요.>");
					userInput = scanner.nextLine();
					if (userInput.isEmpty()) {
						System.out.println("채널을 입력해주세요.");
						continue;
					}

					try {
						channelNumber = Integer.parseInt(userInput);
					} catch (Exception e) {
						System.out.println("채널을 숫자로 입력해주세요.");
						continue;
					}
					break;
				}
				newCellPhoneScanner.changeDMBChannel(channelNumber);
				continue;
			case 6:
				newCellPhoneScanner.turnOffDMB();
				continue;
			default:
				System.out.println("기능을 다시 선택해 주세요.");
				continue;
			}

			break;
		}
		
		scanner.close();

	}

}
