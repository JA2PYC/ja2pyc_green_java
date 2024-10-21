package ch08.pac02;

public class ClassTaxi implements InterfaceVehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	void horn()	{
		System.out.println("택시가 경적을 울립니다.");
	}
}
