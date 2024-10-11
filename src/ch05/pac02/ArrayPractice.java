package ch05.pac02;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Question 1
		int[] array;
		// array = {1,2,3};
		array = new int[] { 1, 2, 3 };
		System.out.println("array : " + array);

		// Question 2
		int[] intEmpty = new int[3];
		for (int intValue : intEmpty) {
			System.out.println("intValue[i] : " + intValue);
		}

		// Question 3
		int[][] scoreArray = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		System.out.println(
				"scoreArray.lenght : " + scoreArray.length + ", scoreArray[2].length : " + scoreArray[2].length);

		// Question 4
		int max = 0;
		int[] numberArray = { 1, 2, 10, 4, 5 };
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] > max) {
				max = numberArray[i];
			}
		}
		System.out.println("Max : " + max);

		// Question 5
		int[][] subjectScoreArray = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;
		int subjectLength = 0;

		for (int i = 0; i < subjectScoreArray.length; i++) {
			for (int j = 0; j < subjectScoreArray[i].length; j++) {
				sum += subjectScoreArray[i][j];
			}
			subjectLength += subjectScoreArray[i].length;
		}
		avg = (double) sum / subjectLength;
		System.out.println("Sum : " + sum);
		System.out.println("Avg : " + avg);

		// Question 6
		boolean run = true;
		int studentsNum = 0;
		int[] studentsScore = null;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수>");
				studentsNum = Integer.parseInt(scanner.nextLine());
				System.out.println("학생수 : " + studentsNum);
			} else if (selectNo == 2) {
				if (studentsNum == 0) {
					System.out.println("학생수를 먼저 입력해주세요.");
					continue;
				}
				studentsScore = new int[studentsNum];
				for (int i = 0; i < studentsNum; i++) {
					System.out.print("점수 " + (i + 1) + "번>");
					studentsScore[i] = Integer.parseInt(scanner.nextLine());
					System.out.println("점수 " + (i + 1) + "번 : " + studentsScore[i]);
				}
			} else if (selectNo == 3) {
				if (studentsScore == null) {
					System.out.println("저장된 점수가 없습니다.");
					continue;
				}
				String strScore = "";
				for (int i = 0; i < studentsScore.length; i++) {
					strScore += studentsScore[i] + ", ";
				}
				strScore = strScore.trim();
				if (strScore.endsWith(",")) {
					strScore = strScore.substring(0, strScore.length() - 1);
				}
				System.out.println("점수 목록 : " + strScore);
			} else if (selectNo == 4) {
				if (studentsScore == null) {
					System.out.println("저장된 점수가 없습니다.");
					continue;
				}
				int totalScore = 0;
				int maxScore = 0;
				double avgScore;
				for (int i = 0; i < studentsScore.length; i++) {
					if (studentsScore[i] > maxScore) {
						maxScore = studentsScore[i];
					}
					totalScore += studentsScore[i];
				}
				avgScore = (double) totalScore / studentsScore.length;
				System.out.println("최고 점수 : " + maxScore);
				System.out.println("점수 총합 : " + totalScore);
				System.out.println("점수 평군 : " + avgScore);
			} else if (selectNo == 5) {
				run = false;
				scanner.close();
				break;
			} else {
				System.out.println("잘못된 입력입니다. 1~5를 입력해주세요.");
			}
		}

		if (run == false) {
			System.out.println("프로그램이 종료 되었습니다.");
		}

	}

}
