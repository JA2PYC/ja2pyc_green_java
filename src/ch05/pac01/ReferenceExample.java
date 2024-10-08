package ch05.pac01;

import java.util.Scanner;

public class ReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reference Type

		// String
		String name = new String("JAVA");
		String type = "Language";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name : " + name);
		System.out.println("Type : " + type);
		System.out.println("Scanner : " + scanner);

		scanner.close();

		// String stringEmpty;
		// System.out.println("stringEmpty : " + stringEmpty);
		String stringNull = null;

		// Null 
		if (stringNull == null) {
			System.out.println("stringNull : " + stringNull);
		}

		if (name != null) {
			System.out.println("Name Not Null : " + name);
		}
		
		// NullPointerExceoption
		int[] intArray = null;
		// intArray[0] = 10;
		System.out.println("intArray : " + intArray);
		intArray = new int[3];
		System.out.println("intArray : " + intArray);
		intArray = new int[] {1,2,3};
		System.out.println("intArray : " + intArray);
		
		

		// String Equals Example

		// Use String Literal
		String strVar1 = "C#";
		String strVar2 = "C#";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음 strVar1 : " + strVar1 + ", strVar2 : " + strVar2);
		}

		// Use new String
		String strVar3 = new String("JAVA");
		String strVar4 = new String("JAVA");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음 strVar3 : " + strVar3 + ", strVar4 : " + strVar4);
		}

		// Set New Literal
		System.out.println("New Literal");
		strVar2 = "PHP";
		System.out.println("strVar1 : " + strVar1 + ", strVar2 : " + strVar2);

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음 strVar1 : " + strVar1 + ", strVar2 : " + strVar2);
		}

		// Set Same Literal
		System.out.println("Same Literal");
		strVar2 = "C#";
		System.out.println("strVar1 : " + strVar1 + ", strVar2 : " + strVar2);

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음 strVar1 : " + strVar1 + ", strVar2 : " + strVar2);
		}

		// Set New String
		System.out.println("Set String");
		strVar4 = "PHP";
		System.out.println("strVar3 : " + strVar3 + ", strVar4 : " + strVar4);

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음 strVar3 : " + strVar3 + ", strVar4 : " + strVar4);
		}

		// Set Same String
		System.out.println("Same String");
		strVar4 = "JAVA";
		System.out.println("strVar3 : " + strVar3 + ", strVar4 : " + strVar4);

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음 strVar3 : " + strVar3 + ", strVar4 : " + strVar4);
		}
	}
}
