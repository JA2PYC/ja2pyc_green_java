package ch07.pac02;

public class ClassTire {
	// Field
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	// Constructor
	ClassTire() {
		
	}
	public ClassTire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// Method
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println("타이어 위치 : " + this.location + ", 수명 : " + (this.maxRotation - this.accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("타이어 교체필요 : " + this.location);
			return false;
		}
			
	}
	
	void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}
