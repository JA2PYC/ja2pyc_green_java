package ch06.pac05;

public class ClassCalculator {
	static double pi = 3.14159;

	static int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	static int minus(int x, int y) {
		int result;
		if (x >= y) {
			result = x - y;
		} else {
			result = y - x;
		}
		return result;
	}
}
