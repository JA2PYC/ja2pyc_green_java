package ch07.pac02;

public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Class Child
		ClassChild newChild = new ClassChild();
		ClassParent newParent = newChild;

		if (newParent == newChild) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("다른 객체 입니다.");
		}
		
		// Parent Method
		newParent.method1();
		// Polymorphism
		newParent.method2();
		// Can't Use
		// newParent.method3();

		// Child Method
		newChild.method1();
		newChild.method2();
		newChild.method3();
		
	}

}
