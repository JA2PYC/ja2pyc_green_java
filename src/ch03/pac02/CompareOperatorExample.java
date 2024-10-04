package ch03.pac02;

public class CompareOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		boolean result4 = (num1 >= num2);
		System.out.println("Result1 : " + result1);
		System.out.println("Result2 : " + result2);
		System.out.println("Result3 : " + result3);
		System.out.println("Result4 : " + result4);

		char char1 = 'A';
		char char2 = 'B';
		boolean result5 = (char1 < char2);
		System.out.println("Result5 : " + result5);

		int v2 = 1;
		double v3 = 1.0;
		System.out.println("V2 == V3 : " + (v2 == v3));
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println("V4 : " + v4 + ", V5 : " + v5);
		System.out.printf("V4 : %20.18f, V5 : %20.18f\n", v4, v5);
		System.out.println("V4 == V5 : " + (v4 == v5));
		System.out.println("(float)V4 == V5 : " + ((float)v4 == v5));
		
		String strVar1 = "신용권";
		String strVar2 = "신용권";
		System.out.println("strVar1.equals(strVar2) : " + strVar1.equals(strVar2));
	}

}
