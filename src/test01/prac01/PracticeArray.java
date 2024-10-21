package test01.prac01;

import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Practice 1
		System.out.println("-------------------- Practice 1 --------------------");
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
		System.out.println("-------------------- Practice 2 --------------------");
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

		// Practice 3
		System.out.println("-------------------- Practice 3 & 4 --------------------");
		String[] studentNames = { "정자바", "이그린", "컴퓨터", "최씨샵", "씨뿔뿔" };
		// int[][] studentScores = { { 90, 95, 98 }, { 75, 85, 88 }, { 60, 68, 77 }, {
		// 82, 63, 84 }, { 74, 77, 98 } };
		// Practice 4
		String[] subjectNames = { "국어", "영어", "수학" };
		int[][] studentScores = new int[5][3];
		for (int i = 0; i < studentScores.length; i++) {
			System.out.println("입력>");
			for (int j = 0; j < studentScores[i].length; j++) {
				while (true) {
					System.out.print((i + 1) + "번째 학생의 " + subjectNames[j] + "점수를 입력하세요>");
					try {
						studentScores[i][j] = Integer.parseInt(scanner.nextLine());
					} catch (Exception e) {
						System.out.println("점수 입력에 실패했습니다.");
						continue;
					}
					break;
				}
			}
		}
		int[] subjectTotals = new int[3];
		int grandTotal = 0;
		double totalAverage = 0;
		int maxValue = 0;
		int minValue = 100;

		System.out.println(" 이름     국어   영어   수학   총점   평균");
		System.out.println("========================================");

		for (int i = 0; i < studentScores.length; i++) {
			int studentSum = 0;
			for (int j = 0; j < studentScores[i].length; j++) {
				studentSum += studentScores[i][j];
				subjectTotals[j] += studentScores[i][j];
				maxValue = Math.max(maxValue, studentScores[i][j]);
				minValue = Math.min(minValue, studentScores[i][j]);
			}

			double studentAvg = (double) studentSum / 3.0;
			grandTotal += studentSum;
			totalAverage += studentAvg;

			System.out.printf("%-4s %4d %5d %5d %5d %5.1f\n", studentNames[i], studentScores[i][0], studentScores[i][1],
					studentScores[i][2], studentSum, studentAvg);
		}

		System.out.println("========================================");

		System.out.printf("총점 : ");
		for (int i = 0; i < subjectTotals.length; i++) {
			System.out.printf("%5d ", subjectTotals[i]);
		}
		System.out.printf("%5d %5.2f\n", grandTotal, totalAverage / studentNames.length);
		System.out.printf("최대값 : %d, 최소값 : %d\n", maxValue, minValue);

		scanner.close();
		System.out.println("-------------------- End --------------------");
	}

}
