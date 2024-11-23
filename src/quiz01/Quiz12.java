package quiz01;

class Parent {
	int x, y;

	Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getT() {
		System.out.println("parent");
		return x * y;
	}
}

class Child extends Parent {
	int x;

	Child(int x) {
		super(x + 1, x);
		System.out.println("child");
		this.x = x;
	}

	int getT(int n) {
		System.out.println("child");
		return super.getT() + n;
	}
}

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child(3);
		System.out.println(parent.getT());
	}

}
