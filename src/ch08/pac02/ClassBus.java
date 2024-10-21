package ch08.pac02;

public class ClassBus implements InterfaceVehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	void horn() {
		System.out.println("버스가 경적을 울립니다.");
	}
	
}
