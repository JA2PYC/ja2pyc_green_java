package ch06.pac04;

import java.util.ArrayList;

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

	double formulaCalculator(String userInput) {
		boolean isCalculating = true;
		while (isCalculating) {
			// Check Formula
			ArrayList<Character> digitList = new ArrayList<Character>();
			ArrayList<Character> letterList = new ArrayList<Character>();
			ArrayList<Character> operatorList = new ArrayList<Character>();

			boolean isDigit = false;
			String formula = "";
			String separationIndex = "";
			int operationCounter = 0;
			for (int i = 0; i < userInput.length(); i++) {
				char targetCh = userInput.charAt(i);
				if (Character.isDigit(targetCh)) {
					if (isDigit == false) {
						separationIndex += (i + ",");
						isDigit = true;
					}
					formula += targetCh;
					digitList.add(targetCh);
				} else if (Character.isLetter(targetCh)) {
					// Skip Letter
					letterList.add(targetCh);
				} else {
					if (targetCh == '+' || targetCh == '-' || targetCh == '*' || targetCh == '/') {
						if (isDigit == true) {
							separationIndex += (i + ",");
							isDigit = false;
						} else {
							System.out.println("연산자는 연속으로 올 수 없습니다.");
							isCalculating = false;
							break;
						}
						operationCounter++;
						formula += targetCh;
						operatorList.add(targetCh);
					}
				}
			}

			// Delete Letter

			// Set Parameter
			String[] separationIndexArray = separationIndex.split(",");
			System.out.println("separationIndexArray : " + separationIndexArray.toString());

			// Calculate
			while (operationCounter > 0) {
				while (formula.indexOf("*") >= 0) {
					System.out.println("indexOf : " + formula.indexOf("*"));
					break;
				}
				while (formula.indexOf("/") >= 0) {
					System.out.println("indexOf : " + formula.indexOf("/"));
					break;
				}
				while (formula.indexOf("+") >= 0) {
					System.out.println("indexOf : " + formula.indexOf("+"));
					break;
				}
				while (formula.indexOf("-") >= 0) {
					System.out.println("indexOf : " + formula.indexOf("-"));
					break;
				}
				
				operationCounter--;
			}

			System.out.println("formula : " + formula);
			System.out.println("separationIndex : " + separationIndex);
			System.out.println("digitList : " + digitList);
			System.out.println("oepratorList : " + operatorList);
			isCalculating = false;
			break;
		}
		return 0.0;
	}

}
