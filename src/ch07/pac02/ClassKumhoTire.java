package ch07.pac02;

public class ClassKumhoTire extends ClassTire {
	// Field

	// Constructor
	ClassKumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// Method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println("금호 타이어 위치 : " + location + ", 수명 : " + (maxRotation -accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("금호 타이어 교체필요 : " + location);
			return false;
		}
	}
}
