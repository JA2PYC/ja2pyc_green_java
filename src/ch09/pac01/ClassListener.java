package ch09.pac01;

public class ClassListener implements ClassInterface.InterfaceNested {
	@Override 
	public void nestedMethod() {
		System.out.println("nestedMethod - implemented");
	}
}
