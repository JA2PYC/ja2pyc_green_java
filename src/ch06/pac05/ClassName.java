package ch06.pac05;

public class ClassName {
	// Static Field
	static int staticField;

	// Field
	int field;
	
	// Field Singleton
	private static ClassName fieldSingleton = new ClassName(100, 200);

	// Constructor
	ClassName() {
		field = 5;
	}

	ClassName(int intValue) {
		staticField = intValue;
	}
	
	// Constructor Singleton
	private ClassName(int intStaticValue, int intValue) {
		staticField = intStaticValue;
		field = intValue;
	}

	// Static Method
	static void nameMethod2() {
		System.out.println("Static nameMethod2");
		staticField = 20;
		System.out.println("staticField : " + staticField);
	}

	static void nameMethod3() {
		System.out.println("Static nameMethod3");
		System.out.println("staticField : " + staticField);
		// this.field = 10; // Compile Error
		// this.nameMethod1(); //Compile Error
		ClassName instanceName = new ClassName();
		instanceName.field = 30;
		instanceName.nameMethod1();
	}

	// Method
	void nameMethod1() {
		System.out.println("nameMethod1");
		staticField = 10;
		System.out.println("staticField : " + staticField);
	}
	
	// Method Singleton
	static ClassName getInstance() {
		return fieldSingleton;
	}

}
