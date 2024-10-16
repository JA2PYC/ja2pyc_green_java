package ch07.pac02;

public class ClassChild extends ClassParent {

	ClassChild() {
		this("ClassChild");
		System.out.println("ClassChild");
	}
	
	ClassChild(String str){
		System.out.println("ClassChild(str)" + str);
	}
	@Override
	public void method2() {
		System.out.println("Child method2()");
	}

	public void method3() {
		System.out.println("Child method3()");
	}
}
