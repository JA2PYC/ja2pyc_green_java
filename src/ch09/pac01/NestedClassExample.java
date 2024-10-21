package ch09.pac01;

public class NestedClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Class Outter
		System.out.println("-------------------- Class Outter --------------------");
		ClassOutter newOutter = new ClassOutter();
		newOutter.method();
		
		System.out.println("-------------------- Class Outter Method Call Class Nested --------------------");
		newOutter.methodCallNestedClass();
		
		System.out.println("-------------------- Class Outter Method Call Class Nested Static --------------------");
		newOutter.methodCallNestedStaticClass();
		
		System.out.println("-------------------- Class Nested --------------------");
		ClassOutter.ClassNested newNested = newOutter.new ClassNested(1);
		newNested.methodNested();
		
		System.out.println("-------------------- Class Nested Static --------------------");
		ClassOutter.ClassNestedStatic newNestedStatic = new ClassOutter.ClassNestedStatic(1);
		newNestedStatic.methodNestedStatic();
		
		System.out.println("-------------------- Class Local --------------------");
		newOutter.methodLocal();
	}

}
