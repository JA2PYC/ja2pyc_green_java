package ch07.pac02;

public class ClassCar {
	// Field
	ClassTire flTire = new ClassTire("FL", 6);
	ClassTire frTire = new ClassTire("FR", 6);
	ClassTire blTire = new ClassTire("BL", 6);
	ClassTire brTire = new ClassTire("BR", 6);

	// Constructor

	// Method
	int run() {
		System.out.println("자동차가 달립니다.");
		if (flTire.roll() == false) {
			stop();
			return 1;
		}
		if (frTire.roll() == false) {
			stop();
			return 2;
		}
		if (blTire.roll() == false) {
			stop();
			return 3;
		}
		if (brTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
