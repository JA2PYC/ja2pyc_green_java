package ch02.pac03;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1 : " + value1);
		System.out.println("value1 + 1 : " + (value1 + 1));
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);

		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);

		System.out.println("str1 : " + str1);
		System.out.println("str1 + 1 : " + (str1 + 1));
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);

		int x = 5;
		int y = 2;
		float result1 = (float) x / y;
		System.out.println("Result 1 : " + result1);
		
		long var1 = 2l;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result2 = (int) (var1+ var2) + (int) (var3 + Double.parseDouble(var4)); 
		System.out.println("Result 2 : " + result2);
	}

}
