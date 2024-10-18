package ch08.pac02;

public class ClassCar implements InterfaceCar{
	// Field
	InterfaceTire FLTire = new ClassHKTire();
	InterfaceTire FRTire = new ClassHKTire();
	InterfaceTire BLTire = new ClassHKTire();
	InterfaceTire BRTire = new ClassHKTire();
	
	public void run() {
		FLTire.roll();
		FRTire.roll();
		BLTire.roll();
		BRTire.roll();
	}
	
	public void roll() {
		System.out.println("자동차 바퀴가 굴러갑니다.");
	}
	
	public void turnOn() {
		System.out.println("자동차 시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("자동차 시동을 끕니다.");
	}
	
}
