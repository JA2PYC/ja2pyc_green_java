package ch07.pac03;

public abstract class ClassPhone {
	// Field
	public String owner;
	
	// Constructor
	public ClassPhone(String owner) {
		this.owner = owner;
	}
	
	// Method
	public void turnOn() {
		System.out.println("휴대폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("휴대폰 전원을 끕니다.");
	}
	
	public abstract void calling();
	
	public abstract void bell();
	
	static void phoneCalling (ClassPhone phone) {
		phone.calling();
	}
}
