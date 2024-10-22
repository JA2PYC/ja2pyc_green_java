package ch09.pac01;

public class ClassOutterInterface {
	
	// Field
	InterfaceNestedStatic interfaceNestedStaticField;
	
	void setInterfaceListener (InterfaceNestedStatic listener) {
		this.interfaceNestedStaticField = listener;
	}
	
	void event() {
		 interfaceNestedStaticField.method();
	}
	
	// Nested Interface
	interface InterfaceNested {
		void method();
	}
	
	// Nested Static Interface
	static interface InterfaceNestedStatic {
		void method();
	}
}
