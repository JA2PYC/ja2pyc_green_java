package test01.prac01;

// Scanner Package
import java.util.Scanner;

// Set Package
import java.util.List;
import java.util.ArrayList;

public class ComprehensivePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력>");
		String divisorInput = scanner.nextLine();

		List<Integer> divisorList = new ArrayList<>();
		try {
			int divisorNumber = Integer.parseInt(divisorInput);
			for (int i = 1; i <= divisorNumber; i++) {
				if (divisorNumber % i == 0 && !divisorList.contains(i)) {
					divisorList.add(i);
				}
			}
		} catch (Exception e) {
			System.out.println("정수를 입력해주세요." +e);
		}

		System.out.println(divisorList);
		System.out.println("약수의 개수는 " + divisorList.size() + "개 입니다.");

		
		scanner.close();
		System.out.println("-------------------- End --------------------");

	}

}
