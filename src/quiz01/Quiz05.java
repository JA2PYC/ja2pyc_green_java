package quiz01;

class Printer {
	void print(Integer a) {
		System.out.println("A : " + a);
	}
	
	void print(Object a) {
		System.out.println("B : " + a);
	}
	
	void print(Number a) {
		System.out.println("C : " + a);
	}
}


public class Quiz05 {
	static class T {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Container(new T()).print();
	}
	
	public static class Container {
		T value;
		
		public Container(T t) {
			value = t;
		}
		
		public void print() {
			new Printer().print(value);
		}
	}


}