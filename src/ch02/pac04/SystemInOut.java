package ch02.pac04;

import java.util.Scanner;

public class SystemInOut {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String name = "감자바";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";

		System.out.println("이름 : " + name + "\n나이 : " + age + "\n전화 : " + tel1 + "-" + tel2 + "-" + tel3);
		System.out.print("이름 : " + name + "\n나이 : " + age + "\n전화 : " + tel1 + "-" + tel2 + "-" + tel3 + "\n");
		System.out.printf("이름 : %s\n나이 : %d\n전화 : %s-%s-%s\n", name, age, tel1, tel2, tel3);

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("첫 번째 수 : ");
			String strNum1 = scanner.nextLine();

			System.out.print("두 번째 수 : ");
			String strNum2 = scanner.nextLine();

			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			int result = num1 + num2;
			System.out.println("합 : " + result);
		} finally {
			scanner.close();
		}
	}

}
