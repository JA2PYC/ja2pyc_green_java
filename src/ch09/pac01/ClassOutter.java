package ch09.pac01;

public class ClassOutter {

	// Outter Method
	void method() {
		System.out.println("ClassOutter");
	}

	// Method Use Nested Class
	void methodCallNestedClass() {
		ClassNested newNested = new ClassNested();
		newNested.methodNested();
	}
	
	void methodCallNestedStaticClass() {
		ClassOutter.ClassNestedStatic newNestedStatic = new ClassOutter.ClassNestedStatic();
		newNestedStatic.methodNestedStatic();
	}

	// Nested Instance Class
	class ClassNested {
		// Nested Field
		int nestedInt;

		// Nested Constructor
		ClassNested() {

		}

		ClassNested(int nestedInt) {
			this.nestedInt = nestedInt;
		}

		// Nested Method
		void methodNested() {
			System.out.println("ClassNested nestedInt : " + this.nestedInt);
		}
	}

	// Nested Static Class
	static class ClassNestedStatic {
		// Nested Static Field
		int nestedStaticInt;

		// Nested Static Constructor
		ClassNestedStatic() {

		}

		ClassNestedStatic(int nestedStaticInt) {
			this.nestedStaticInt = nestedStaticInt;
		}

		// Nested Static Method
		void methodNestedStatic() {
			System.out.println("ClassNestedStatic nestedStaticInt : " + this.nestedStaticInt);
		}
	}

	// Method Use Local Class
	void methodLocal() {
		// Class Local
		class ClassLocal {
			void callClass() {
				System.out.println("ClassLocal");
			}
		}

		// Use Local Class
		ClassLocal newClassLocal = new ClassLocal();
		newClassLocal.callClass();
	}

	// Nested Interface
	interface InterfaceNested {

	}
}
