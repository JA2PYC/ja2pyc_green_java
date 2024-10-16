package ch07.pac02;

public class ClassParent {

	ClassParent() {
		this("ClassParent");
		System.out.println("ClassParent");
	}
	
	ClassParent(String str){
		System.out.println("ClassParent(str)" + str);
	}
	
	public void method1() {
		System.out.println("Parent method1()");
	}

	public void method2() {
		System.out.println("Parent method2()");
	}
}
