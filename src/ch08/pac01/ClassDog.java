package ch08.pac01;

public class ClassDog implements InterfaceSoundable {
	@Override
	public String sound() {
		return "멍멍";
	}

	void call() {
		System.out.println("Call : " + sound());
		sound();
	}

	void feed() {
		System.out.println("Feed : " + sound());
		sound();
	}

	public static void main(String[] args) {
		ClassDog newDog = new ClassDog();
		newDog.feed();
		newDog.call();
	
	}
}
