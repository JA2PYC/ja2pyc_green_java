package ch06.pac04;

public class ClassQuizCalculator {

	double getAdd(double x, double y) {
		double result = x + y;
		return result;
	}

	double getSub(double x, double y) {
		double result = x - y;
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
			throw new IllegalArgumentException("Invalid Operator : " + operator);
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
			throw new IllegalArgumentException("Invalid Operator : " + operator);
		}
		return result;
	}

	private String calcFormula(String formula, String operator) throws Exception {
		// Verify Operator
		if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
			throw new Exception("Operator Error");
		}

		//Set Index
		int targetIndex = formula.indexOf(operator);
		int firstIndex = -1;
		int secondIndex = targetIndex + 1;
		int endIndex = formula.length();

		// Set First Index
		for (int i = targetIndex - 1; i >= 0; i--) {
			char targetChar = formula.charAt(i);
			if (!Character.isDigit(targetChar) && targetChar != '.') {
				firstIndex = i + 1;
				break;
			}
		}
		if (firstIndex == -1)
			firstIndex = 0;

		// Set End Index
		for (int i = targetIndex + 1; i < formula.length(); i++) {
			char targetChar = formula.charAt(i);
			if (!Character.isDigit(targetChar) && targetChar != '.') {
				endIndex = i;
				break;
			}
		}

		// Set Values
		double beforeValue = Double.parseDouble(formula.substring(firstIndex, targetIndex));
		double afterValue = Double.parseDouble(formula.substring(secondIndex, endIndex));
		
		// Calculate
		double calcResult;
		switch (operator) {
		case "+":
			calcResult = beforeValue + afterValue;
			break;
		case "-":
			calcResult = beforeValue - afterValue;
			break;
		case "*":
			calcResult = beforeValue * afterValue;
			break;
		case "/":
			if (afterValue == 0)
				throw new Exception("Divide by Zero");
			calcResult = beforeValue / afterValue;
			break;
		default:
			throw new Exception("Calculation Error");
		}

		// Set Calculated Formula
		formula = formula.substring(0, firstIndex) + calcResult + formula.substring(endIndex);
		return formula;
	}

	double formulaCalculator(String userInput) throws Exception {
		// Delete Letter
		if (userInput.isEmpty()) {
			throw new Exception("Empty Formula");
		}
		String formula = userInput.replaceAll("[^0-9+\\-*/().]", "");
		System.out.println("formula : " + formula);

		// Check Start or End with Operation
		if (formula.startsWith("+") || formula.startsWith("-") || formula.startsWith("*") || formula.startsWith("/")
				|| formula.endsWith("+") || formula.endsWith("-") || formula.endsWith("*") || formula.endsWith("/")) {
			throw new Exception("Formula Operation Error");
		}

		// Check Duplicated Operation
		for (int i = 0; i < formula.length() - 1; i++) {
			char currentChar = formula.charAt(i);
			char nextChar = formula.charAt(i + 1);

			if ((currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/')
					&& (nextChar == '+' || nextChar == '-' || nextChar == '*' || nextChar == '/')) {
				throw new Exception("Formula Operation Error");
			}
		}

		// Preferred Operator
		while (formula.contains("(")) {
			int openIndex = formula.lastIndexOf("(");
			int closeIndex = formula.indexOf(")", openIndex);
			if (closeIndex == -1)
				throw new Exception("Formula Error");

			String subFormula = formula.substring(openIndex + 1, closeIndex);
			double subResult = formulaCalculator(subFormula);

			formula = formula.substring(0, openIndex) + subResult + formula.substring(closeIndex + 1);
		}

		// Calculate
		while (formula.indexOf("*") >= 0 || formula.indexOf("/") >= 0) {
			int multipleIndex = formula.indexOf("*");
			int divideIndex = formula.indexOf("/");
			if (divideIndex == -1 || (multipleIndex != -1 && multipleIndex < divideIndex)) {
				formula = calcFormula(formula, "*");
			} else {
				formula = calcFormula(formula, "/");
			}
			System.out.println("formula : " + formula);
		}
		while (formula.indexOf("+") >= 0 || formula.indexOf("-") >= 0) {
			int plusIndex = formula.indexOf("+");
			int minusIndex = formula.indexOf("-");
			if (minusIndex == -1 || (plusIndex != -1 && plusIndex < minusIndex)) {
				formula = calcFormula(formula, "+");
			} else {
				formula = calcFormula(formula, "-");
			}
			System.out.println("formula : " + formula);
		}

		// Return Result
		System.out.println("formula : " + formula);
		return Double.parseDouble(formula);
	}

}
