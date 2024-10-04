package ch03.pac01;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 3;

		System.out.println("X : " + x + ", Y : " + y);
		System.out.println("Operator + : " + (x + y));
		System.out.println("Operator - : " + (x - y));
		System.out.println("Operator * : " + (x * y));
		System.out.println("Operator / : " + (x / y));
		System.out.println("Operator % : " + (x % y));

		boolean result = x + y > 10 && x - y < 10;
		System.out.println("Result : " + result);
		
		boolean test = true | false;
		System.out.println("Test : " + test);
	}

}
