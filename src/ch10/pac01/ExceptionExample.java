package ch10.pac01;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Null Pointer Exception
		System.out.println("-------------------- Null Pointer Exception --------------------");
		String nullString = null;
		try {
			callNullString(nullString);
		} catch (NullPointerException e) {
			System.out.println("NullPointerEception : " + e);
		}

		// Array Index Out Of Bounds Exception
		System.out.println("-------------------- Array Index Out Of Bounds Exception --------------------");
		String[] stringArr = { "JAVA", "C#" };
		try {
			for (int i = 0; i <= stringArr.length; i++) {
				System.out.println("stringArr[" + i + "]" + stringArr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException : " + e);
		}

		// Number Format Exception
		System.out.println("-------------------- Number Format Exception --------------------");
		String stringNumber = "3.14159";
		try {
			double doubleValue = Double.parseDouble(stringNumber);
			System.out.println("doubleValue : " + doubleValue);
			int intValue = Integer.parseInt(stringNumber);
			System.out.println("intValue : " + intValue);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException : " + e);
		}

		// Class Cast Exception
		System.out.println("-------------------- Class Cast Exception --------------------");
		ClassCast newCast = new ClassCast();
		ClassInheritance newInheritance = new ClassInheritance();
		try {
			ClassCast castedCast = newInheritance;
			System.out.println("castedCast : " + castedCast);
			ClassInheritance castedInheritance = (ClassInheritance) newCast;
			System.out.println("castedInheritance : " + castedInheritance);
		}catch (ClassCastException e ) {
			System.out.println("ClassCastException : " + e);
		}
		
		
	}
	
	static void callNullString(String nullString) {
		System.out.println("nullString : " + nullString.toString());		
	}
	
	static class ClassCast {
		
	}

	static class ClassInheritance extends ClassCast {
		
	}
}