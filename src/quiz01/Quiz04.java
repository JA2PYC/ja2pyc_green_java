package quiz01;

class B {
	int x = 3;

	int getX() {
		return x * 2;
	}
}

class A extends B {
	int x = 7;

	@Override
	int getX() {
		return x * 3;
	}
}

public class Quiz04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1 = new A();
		A b2 = new A();
		System.out.println(b1.getX());
		System.out.println(b1.x);
		System.out.println(b2.getX());
		System.out.println(b2.x);
		System.out.println(b1.getX() + b1.x + b2.getX() + b2.x);
	}

}
