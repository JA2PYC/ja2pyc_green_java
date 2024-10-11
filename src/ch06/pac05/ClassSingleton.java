package ch06.pac05;

public class ClassSingleton {
	// Field
	private static ClassSingleton singleton = new ClassSingleton();
	static int fieldStatic;

	// Constructor
	private ClassSingleton() {
		
	}

	// Method
	ClassSingleton getSingleton() {
		return singleton;
	}
}
