package ch10.pac02;

public class HandleExceptionExample {

	public static void main(String[] args) throws ClassNotFoundException, ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub

		// Class for Name
		System.out.println("-------------------- Class for Name --------------------");
		// Compile Exception
		// Class classStrings = Class.forName("String");
		try {
			Class<?> classForName = Class.forName("java.lang.Strings");
			System.out.println("classForName : " + classForName);
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			System.out.println("ClassNotFoundException : " + e);
		}
		
		// Throws
		System.out.println("-------------------- Throws --------------------");
		// Must use Try Catch or Throws
		// findClass("String");
		// Use Try Catch
		try {
			findClass("String");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : " + e);
		}
		// Use Throws
		// findClass("Integer");
		
		
		// Try Multiple Catch Finally
		System.out.println("-------------------- Try Mulitple Catch Finally --------------------");
		String firstString = null;
		String secondString = null;
		try {
			firstString = args[0];
			secondString = args[1];
			int firstNumber = Integer.parseInt(firstString);
			int secondNumber = Integer.parseInt(secondString);
			int result = firstNumber + secondNumber;
			System.out.println("Result : " + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개변수가 부족합니다.");
			return;
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			return;
		} catch (Exception e) {
			System.out.println("예상치 못한 예외가 발생했습니다.");
			return;
		} finally {
			System.out.println("프로그램 종료");
		}

		System.out.println("--------------------------------------------------");
	}

	static void findClass(String targetString) throws ClassNotFoundException {
		Class<?> targetClass = Class.forName(targetString);
		System.out.println("targetClass : " + targetClass);
	}

}
