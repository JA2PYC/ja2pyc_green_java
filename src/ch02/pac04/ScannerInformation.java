package ch02.pac04;

import java.util.Scanner;

public class ScannerInformation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("이름 : ");
		String strName = scanner.nextLine();
		System.out.print("전화번호 : ");
		String strTel = scanner.nextLine();
		System.out.print("이메일 : ");
		String strEmail = scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println("이름 : " + strName);
		System.out.println("전화번호 : " + strTel);
		System.out.println("이메일 : " + strEmail);
	}

}
