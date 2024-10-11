package ch06.pac04;

public class ClassQuizCalculator {

	double getAdd(double x, double y) {
		double result = x + y;
		return result;
	}

	double getSub(double x, double y) {
		double result;
		if (x >= y) {
			result = x - y;
		} else {
			result = y - x;
		}
		return result;
	}

	double getMul(double x, double y) {
		double result = x * y;
		return result;
	}

	double getDiv(double x, double y) {
		double result = x / y;
		return result;
	}

	int calcOverloading(int x, String operator, int y) {
		int result;
		if (operator.equals("+")) {
			result = x + y;
		} else if (operator.equals("-")) {
			result = x - y;
		} else {
			result = 0;
		}
		return result;
	}

	double calcOverloading(double x, String operator, double y) {
		double result;
		if (operator.equals("*")) {
			result = x * y;
		} else if (operator.equals("/")) {
			result = x / y;
		} else {
			result = 0;
		}
		return result;
	}

}
