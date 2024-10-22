package ch09.pac01;

public class ClassOutter {
	int outterField;
	static int outterStaticField;
	ClassNested nested = new ClassNested();
	ClassNestedStatic nestedStatic = new ClassNestedStatic();
	// static ClassNested staticNested = new ClassNested();
	static ClassNestedStatic staticNestedStatic = new ClassNestedStatic();

	// Outter Method
	void method() {
		System.out.println("ClassOutter");
	}

	void methodOutter() {
		System.out.println("MethodOutter");
	}

	static void methodOutterStatic() {
		System.out.println("MethodOutterStatic");
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
		// ClassNested nested = new ClassNested();
		// ClassNestedStatic nestedStaticInNested = new ClassNestedStatic();

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

		void methodNestedOutterField() {
			outterField = 10;
			outterStaticField = 20;
			System.out.println("OutterField : " + outterField);
			System.out.println("OutterStaticField : " + outterStaticField);
		}

		void methodNestedOutterMethod() {
			methodOutter();
			methodOutterStatic();
		}
	}

	// Nested Static Class
	static class ClassNestedStatic {
		// Nested Static Field
		int nestedStaticInt;
		// ClassNested nested = new ClassNested();
		// ClassNestedStatic nestedStaticInNestedStatic = new ClassNestedStatic();

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

		void methodNestedStaticOutterField() {
			outterStaticField = 30;
			System.out.println("OutterStaticField : " + outterStaticField);
		}

		void methodNestedStaticOutterMethod() {

			methodOutterStatic();
		}
	}

	// Method Use Local Class
	void methodLocal(final int arg) {
		int localVariable = 100;
		// arg = 20;
		// localVariable = 200;
		// Class Local
		class ClassLocal {
			void callClass() {
				System.out.println("ClassLocal");
			}

			void methodResult() {
				int result = arg + localVariable;
				System.out.println("Result : " + result);
			}
		}

		// Use Local Class
		ClassLocal newClassLocal = new ClassLocal();
		newClassLocal.callClass();
		newClassLocal.methodResult();
	}

}
