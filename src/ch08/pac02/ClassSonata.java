package ch08.pac02;

public class ClassSonata extends ClassCar{
	@Override
	public void run() {
		System.out.println("소나타가 달립니다.");
	}
	
	@Override
	public void roll() {
		System.out.println("소나타 바귀카 굴러갑니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("소나타 시동을 겁니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("소나타 시동을 끕니다.");
	}
}
