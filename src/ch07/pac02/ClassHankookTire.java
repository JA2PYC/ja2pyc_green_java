package ch07.pac02;

public class ClassHankookTire extends ClassTire {
	// Field

	// Constructor
	public ClassHankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// Method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println("한국 타이어 위치 : " + location + ", 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("한국 타이어 교체필요 : " + location);
			return false;
		}
	}
}
