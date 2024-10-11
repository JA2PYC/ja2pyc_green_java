package ch06.pac04;

public class ClassCar {
	// Field
	int gas;
	int speed;

	// Constructor

	// Method
	void keyTurnOn() {
		System.out.println("시동을 겁니다.");
	}

	int getSpeed() {
		return speed;
	}

	void accelator() {
		for (int i = 10; i < 60; i += 10) {
			speed = i;
			System.out.println("가속합니다. 속도 : " + speed + "km/h");
		}
	}

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("Gas가 없습니다. Gas 잔량 : " + gas);
			return false;
		}

		System.out.println("Gas 잔량 : " + gas);
		return true;
	}

	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달립니다. Gas 잔량 : " + gas);
				gas -= 1;
			} else {
				System.out.println("멈춥니다. Gas 잔량 : " + gas);
				return;
			}
		}
	}
}
