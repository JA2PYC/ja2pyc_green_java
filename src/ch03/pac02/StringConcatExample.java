package ch03.pac02;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println("Str1 : " + str1);
		System.out.println("Str2 : " + str2);

		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println("Str3 : " + str3);
		System.out.println("Str4 : " + str4);
	}

}
