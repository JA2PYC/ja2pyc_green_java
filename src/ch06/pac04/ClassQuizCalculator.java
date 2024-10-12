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

	double formulaCalculator(String formula) {
		boolean isCalculating = true;
		while (isCalculating) {
			// Check Formula
			ArrayList<Character> digitList = new ArrayList<Character>();
			ArrayList<Character> letterList = new ArrayList<Character>();
			ArrayList<Character> operatorList = new ArrayList<Character>();
			for (int i = 0; i < formula.length(); i++) {
				char targetCh = formula.charAt(i);
				if (Character.isDigit(targetCh)) {
					digitList.add(targetCh);
					System.out.println("isDigit : " + targetCh);
				} else if (Character.isLetter(targetCh)) {
					letterList.add(targetCh);
					System.out.println("isLetter : " + targetCh);
				} else {
					operatorList.add(targetCh);
					System.out.println("else : " + targetCh);
				}
			}
			
			// Delete Letter

			// Set targetArr

			// Calculate

			System.out.println("formula : " + formula);
			System.out.println("digitList : " + digitList);
			System.out.println("letterList : " + letterList);
			System.out.println("oepratorList : " + operatorList);
			isCalculating = false;
			break;
		}
		return 0.0;
	}

}
