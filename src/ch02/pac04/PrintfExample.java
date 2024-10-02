package ch02.pac04;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "String";
		System.out.print("print : " + str1);
		System.out.println("println : " + str1);
		System.out.printf("printf : %s\n", str1);

		// Argument Index
		String str2 = "Print";
		String str3 = "Printf";
		System.out.printf("printf : %s 출력 %3$s %s %s\n", str1, str2, str3);

		// Precision
		int value1 = 123;
		System.out.printf("가격 : %d원\n", value1);
		System.out.printf("가격 : %6d원\n", value1);
		System.out.printf("가격 : %-6d원\n", value1);
		System.out.printf("가격 : %06d원\n", value1);
		System.out.printf("가격 : %06d원\n", value1);

		float value2 = 123.45f;
		System.out.printf("가격 : %10.2f원\n", value2);
		System.out.printf("가격 : %-10.2f원\n", value2);
		System.out.printf("가격 : %010.2f원\n", value2);
		System.out.printf("가격 : %7.2f원\n", value2);
		System.out.printf("가격 : %-7.2f원\n", value2);
		System.out.printf("가격 : %07.2f원\n", value2);

		double value3 = 3.1415926535897932384626433832795;
		System.out.println("원주율 : " + value3);
		System.out.printf("원주율 : %.20f\n", value3);
		System.out.printf("반지름이 %d인 원의 넓이 : %.13f\n", 10, value3 * 10 * 10);

		String value4 = "123";
		System.out.printf("문자열 : %s\n", value4);
		System.out.printf("문자열(6) : %6s\n", value4);
		System.out.printf("문자열(-6) : %-6s\n", value4);
		
		String value5 = "456";
		System.out.printf("문자열 : %1$s %2$s\n", value4, value5);
		System.out.printf("문자열(\\t) : %1$s\t%2$s\n", value4, value5);
		System.out.printf("문자열(%%) : %1$s %% %2$s\n", value4, value5);
		
		String name ="땃쥐";
		String job = "쥐";
		System.out.printf("%6d | %-10s | %10s\n" , 1, name, job);
	}

}
