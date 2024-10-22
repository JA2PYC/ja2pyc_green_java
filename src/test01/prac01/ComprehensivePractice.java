package test01.prac01;

// Scanner Package
import java.util.Scanner;

// Arrays Package
import java.util.Arrays;

// Set Package
import java.util.List;
import java.util.ArrayList;

public class ComprehensivePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set Scanner
		Scanner scanner = new Scanner(System.in);

		// Practice 1
		System.out.println("-------------------- Practice 1 --------------------");
		int sumMultiple3 = 0;
		for (int i = 3; i <= 100; i += 3) {
			if (i % 3 == 0) {
				sumMultiple3 += i;
			}
		}
		System.out.println("sumMultipl3 : " + sumMultiple3);

		// Practice 2
		System.out.println("-------------------- Practice 2 --------------------");
		while (true) {
			int firstNumber = (int) Math.floor(Math.random() * 6 + 1);
			int secondNumber = (int) Math.floor(Math.random() * 6 + 1);

			System.out.println("(" + firstNumber + ", " + secondNumber + ")");
			if (firstNumber + secondNumber == 5) {
				break;
			}
		}

		// Practice 3
		System.out.println("-------------------- Practice 3 --------------------");
		int moneyValue = 37210;
		int[] units = { 10000, 5000, 1000, 500, 100, 50, 10 };
		String[] unitNames = { "만원권", "오천원권", "천원권", "오백원권", "백원권", "오십원권", "십원권" };
		String[] currencyUnits = { "장", "장", "장", "개", "개", "개", "개" };

		System.out.println("금액 : " + moneyValue);

		for (int i = 0; i < units.length; i++) {
			int unitCount = moneyValue / units[i];
			moneyValue %= units[i];

			System.out.printf("%s %d %s\n", unitNames[i], unitCount, currencyUnits[i]);

		}

		// Practice 4
		System.out.println("-------------------- Practice 4 --------------------");
		try {
			System.out.print("약수 확인기 입력>");
			String divisorInput = scanner.nextLine();

			List<Integer> divisorList = new ArrayList<>();

			int divisorNumber = Integer.parseInt(divisorInput);
			for (int i = 1; i <= divisorNumber; i++) {
				if (divisorNumber % i == 0 && !divisorList.contains(i)) {
					divisorList.add(i);
				}
			}

			System.out.println(divisorList);
			System.out.println("약수의 개수는 " + divisorList.size() + "개 입니다.");
		} catch (Exception e) {
			System.out.println("정수를 입력해주세요." + e);
		}

		// Practice 5
		System.out.println("-------------------- Practice 5 --------------------");

		try {
			System.out.print("홀수 짝수 확인기 입력>");
			String oddEvenInput = scanner.nextLine();

			int oddCounter = 0;
			int evenCounter = 0;
			String[] oddEvenArr = oddEvenInput.split(",");

			for (int i = 0; i < oddEvenArr.length; i++) {
				if (Integer.parseInt(oddEvenArr[i]) % 2 != 0) {
					oddCounter++;
				} else {
					evenCounter++;
				}
			}

			System.out.println(Arrays.toString(oddEvenArr));
			System.out.println("홀수는 " + oddCounter + "개, 짝수는 " + evenCounter + "개 입니다.");
		} catch (Exception e) {
			System.out.println("홀수 짝수 확인기 예외가 발생했습니다.");
		}

		scanner.close();
		System.out.println("-------------------- End --------------------");

	}

}
