package ch07.pac02;

public class ClassParent {

	ClassParent() {
		this("ClassParent");
		System.out.println("ClassParent");
	}

	ClassParent(String str) {
		System.out.println("ClassParent(str)" + str);
	}

	public void method1() {
		System.out.println("Parent method1()");
	}

	public void method2() {
		System.out.println("Parent method2()");
	}

	void checkInsanceof(ClassParent parent) {
		if (parent instanceof ClassChild) {
			ClassChild newChild = (ClassChild) parent;
			System.out.println("Class 변환 성공");
			newChild.method3();
		} else {
			System.out.println("Class 변환 실패");
		}
	}

	void changeType(ClassParent parent) {
		ClassChild newChild = (ClassChild) parent;
		newChild.method3();
	}
}
