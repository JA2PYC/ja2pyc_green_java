package ch06.pac04;

public class ClassCalculator {

	void powerOn() {
		System.out.println("계산기를 시작합니다.");
	}

	byte plus(byte x, byte y) {
		byte result = (byte) (x + y);
		return result;
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	int sumIntArr(int[] intArr) {
		int sumResult = 0;
		for (int i = 0; i < intArr.length; i++) {
			sumResult += intArr[i];
		}
		return sumResult;
	}

	int sumIntValues(int... intValues) {
		int sumResult = 0;
		for (int i = 0; i < intValues.length; i++) {
			sumResult += intValues[i];
		}
		return sumResult;
	}

	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}

	double avgInt(int x, int y) {
		double sum = plus(x, y);
		double avgResult = sum / 2;
		printlnResult("평균 : " + avgResult);
		return avgResult;
	}
	
	double areaRectangle (double width)	{
		return width * width;
	}
	
	double areaRectangle (double width, double height) {
		return width * height;
	}

	void printlnResult(String message) {
		System.out.println(message);
	}

	void powerOff() {
		System.out.println("계산기를 종료합니다.");
	}
}
