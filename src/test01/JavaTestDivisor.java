package test01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class JavaTestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JAVA Test 1 Divisor 박성현
		
		// Set Scanner
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("입력>");
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
		
		scanner.close();
	}

}
