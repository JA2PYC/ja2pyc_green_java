package ch01.pac01;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, Java");

		// call Print String
		String str = "Hello World";
		callPrintString(str);
	}

	public static void callPrintString(String args) {
		System.out.println(args);
	}

}
