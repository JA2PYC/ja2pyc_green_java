package ch04.pac01;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double score = Math.random() * 100;
		System.out.println("Score : " + score);
		// if
		if (score >= 90) {
			System.out.println("점수가 90점 보다 큽니다.");
			System.out.println("등급은 A등급 입니다.");
		}

		if (score < 90) {
			System.out.println("점수가 90점 보다 작습니다.");
			System.out.println("등급은 B등급 입니다.");
		}

		// if else
		if (score >= 90) {
			System.out.println("점수가 90점 보다 큽니다.");
			System.out.println("등급은 A등급 입니다.");
		} else {
			System.out.println("점수가 90점 보다 작습니다.");
			System.out.println("등급은 B등급 입니다.");
		}

		if (score >= 90) {
			System.out.println("점수가 100 ~ 90점 입니다.");
			System.out.println("등급은 A등급 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 89 ~ 80점 입니다.");
			System.out.println("등급은 B등급 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 79 ~ 70점 입니다.");
			System.out.println("등급은 C등급 입니다.");
		} else {
			System.out.println("점수가 70점 미만 입니다.");
			System.out.println("등급은 D등급 입니다.");
		}

		// Random Int
		int diceNum = (int) (Math.random() * 6) + 1;

		if (diceNum == 1) {
			System.out.println("주사위 값 1 : " + diceNum);
		} else if (diceNum == 2) {
			System.out.println("주사위 값 2 : " + diceNum);
		} else if (diceNum == 3) {
			System.out.println("주사위 값 3 : " + diceNum);
		} else if (diceNum == 4) {
			System.out.println("주사위 값 4 : " + diceNum);
		} else if (diceNum == 5) {
			System.out.println("주사위 값 5 : " + diceNum);
		} else {
			System.out.println("주사위 값 6 : " + diceNum);
		}

		// Switch
		// Use diceNum
		switch (diceNum) {
		case 1:
			System.out.println("주사위 값 1 : " + diceNum);
			break;
		case 2:
			System.out.println("주사위 값 2 : " + diceNum);
			break;
		case 3:
			System.out.println("주사위 값 3 : " + diceNum);
			break;
		case 4:
			System.out.println("주사위 값 4 : " + diceNum);
			break;
		case 5:
			System.out.println("주사위 값 5 : " + diceNum);
			break;
		case 6:
			System.out.println("주사위 값 6 : " + diceNum);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + diceNum);
		}

		// Switch char
		char grade = 'B';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다. 회원등급 : " + grade);
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다. 회원등급 : " + grade);
			break;
		default:
			System.out.println("신규 회원입니다. 회원등급 : " + grade);
			break;
		}

		// Switch String
		String position = "부장";
		switch (position) {
		case "부장":
			System.out.println("부장 월급 : 700만원");
			break;
		case "과장":
			System.out.println("팀장 월급 : 500만원");
			break;
		default:
			System.out.println("사원 월급 : 300만원");
			break;
		}
		
	}

}
