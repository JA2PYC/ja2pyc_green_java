package ch06.pac05;

public class ClassCar {
	// Field
	String model;
	int speed;
	int maxSpeed = 100;

	// Constructor
	ClassCar(String model) {
		this.model = model;
	}

	// Method
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i = 0; i < 3; i++) {
			if (this.speed >= this.maxSpeed) {
				return;
			}
			this.setSpeed(this.speed += 10);
			System.out.println(this.model + "가 달립니다. 시속 : " + this.speed + "km/h");
		}
	}
}
