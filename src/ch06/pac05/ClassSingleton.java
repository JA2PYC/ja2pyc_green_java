package ch06.pac05;

public class ClassSingleton {
	// Field
	private static ClassSingleton singleton = new ClassSingleton();
	static int staticField;

	// Constructor
	private ClassSingleton() {
		
	}

	// Method
	static ClassSingleton getSingleton() {
		return singleton;
	}
}
