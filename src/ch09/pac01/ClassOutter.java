package ch09.pac01;

public class ClassOutter {

	// NestedClass
	class ClassNested {

	}

	// Nested Static Class
	static class ClassNestedStatic {

	}

	// Local Class
	void method() {
		class ClassLocal {
			void callClass () {
				System.out.println("ClassLocal");
			}
		}
		
		ClassLocal newClassLocal = new ClassLocal();
		newClassLocal.callClass();
	}

	// Nested Interface
	interface InterfaceNested {

	}
}
