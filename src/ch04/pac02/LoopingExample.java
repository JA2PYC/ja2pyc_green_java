package ch04.pac02;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sum from 1 to 100
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			sum += i + 1;
		}
		System.out.println("Sum : " + sum);

		// Print from 1 to 100
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + (i + 1));
		}

		// For with float
		for (float i = 0f; i <= 1.0f; i += 0.1f) {
			System.out.println("i : " + (i + 0.1f));
		}

		// For Multiplication
		for (int i = 2; i <= 9; i++) {
			System.out.println("***" + i + "단 ***");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}

		// While
		int whileI = 1;
		while (whileI <= 10) {
			System.out.println("while(i) : " + whileI);
			whileI++;
		}

		// While Sum from 1 to 100
		int sumWithWhile = 0;
		int iWithWhile = 0;
		while (iWithWhile < 100) {
			sumWithWhile += iWithWhile + 1;
			iWithWhile++;
		}
		System.out.println("sumWithWhile : " + sumWithWhile);

		// While Break
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("Num : " + num);
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료.");

		// Break with Label
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료.");

		// Continue
		for (int i = 0; i < 10; i++) {
			if ((i + 1) % 2 != 0) {
				continue;
			}
			System.out.println("i : " + (i + 1));
		}

	}

}
