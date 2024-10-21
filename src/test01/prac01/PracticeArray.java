package test01.prac01;

import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Practice 1
		int[] score = new int[5];
		score[0] = 80;
		score[1] = 74;
		score[2] = 63;
		score[3] = 97;
		score[4] = 88;

		int sum = 0;
		int maxScore = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] > maxScore) {
				maxScore = score[i];
			}
			sum += score[i];
		}
		double avg = (double) sum / score.length;
		System.out.println("총점 : " + sum + ", 평균 : " + avg + ", 최대점수 : " + maxScore);

		// Practice 2
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 값>");
		String firstInput = scanner.nextLine();
		System.out.print("두번째 값>");
		String secondInput = scanner.nextLine();
		System.out.print("세번째 값>");
		String thirdInput = scanner.nextLine();
		System.out.print("네번째 값>");
		String fourthInput = scanner.nextLine();
		System.out.print("다섯번째 값>");
		String fifthInput = scanner.nextLine();

		try {
			int firstValue = Integer.parseInt(firstInput);
			int secondValue = Integer.parseInt(secondInput);
			int thirdValue = Integer.parseInt(thirdInput);
			int fourthValue = Integer.parseInt(fourthInput);
			int fifthValue = Integer.parseInt(fifthInput);

			int sumValue = firstValue + secondValue + thirdValue + fourthValue + fifthValue;
			double avgValue = (double) sumValue / 5;
			
			System.out.println("합계 : " + sumValue + ", 평균 : " + avgValue);
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}

		scanner.close();
	}

}
