package ch03.pac02;

public class LogicalOperatorExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int charCode = 'A';
		int charInput = System.in.read();

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 입니다. : " + charCode);
		}

		if ((charInput >= 97) && (charInput <= 122)) {
			System.out.println("소문자 입니다. : " + charInput);
		}

		if ((charInput < 48) && !(charInput > 57)) {
			System.out.println("숫자 입니다. : " + charInput);
		}

		int value = 6;
		int intInput = System.in.read();
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 입니다. : " + value);
		}

		if ((intInput % 2 == 0) || (intInput % 3 == 0)) {
			System.out.println("2 또는 3의 배수 입니다. : " + intInput);
		}
	}

}
