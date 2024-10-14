package ch06.pac06;

public class ClassCar {
	// Field
	private int speed;
	private boolean stop;

	// Constructor

	// Method
	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.stop = true;
			this.speed = 0;
		} else {
			this.stop = false;
			this.speed = speed;
		}
	}

	public boolean isStop() {
		return this.stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
