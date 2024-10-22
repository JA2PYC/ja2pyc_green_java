package test01.prac02;

public class Calculator {
	double getAdd(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;
	}

	double getSub(double firstNumber, double secondNumber) {
		double result = firstNumber - secondNumber;
		return result;
	}

	double getMul(double firstNumber, double secondNumber) {
		double result = firstNumber * secondNumber;
		return result;
	}

	double getDiv(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		return result;
	}
	
	boolean callCalculator(String userString)	{

		try {
			
			String[] stringArr = userString.split(" ");
			
			if (stringArr.length != 3) {
				System.out.println("수식의 인수가 부족합니다. 띄어쓰기로 구분해주세요.");
				return false;
			}
			
			double firstNumber = Double.parseDouble(stringArr[0]);
			String operator = stringArr[1];
			double secondNumber = Double.parseDouble(stringArr[2]);
			double result = 0;

			switch (operator) {
			case "+":
				result = getAdd(firstNumber, secondNumber);
				break;
			case "-":
				result = getSub(firstNumber, secondNumber);
				break;
			case "*":
				result = getMul(firstNumber, secondNumber);
				break;
			case "/":
				if (secondNumber == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					return false;
				}
				result = getDiv(firstNumber, secondNumber);
				break;
			default:
				System.out.println("계산할 수 없는 연산자 입니다.");
				return false;
			}

			System.out.printf("연산 결과는 %.2f 입니다.\n", + result);
			return true;
		} catch (Exception e) {
			System.out.println("계산할 수 없습니다.");
			return false;
		}

	}
}
