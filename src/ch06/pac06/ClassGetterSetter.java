package ch06.pac06;

public class ClassGetterSetter {
	private int intValue;
	private boolean status;

	// Int Getter
	public int getIntValue() {
		return this.intValue;
	}

	// Int Setter
	public void setIntValue(int intValue) {
		if (intValue < 0) {
			this.intValue = 0;
		} else {
			this.intValue = intValue;
		}
	}

	// Boolean Getter
	public boolean isStatus() {
		return this.status;
	}

	// Boolean Setter
	public void setStatus(boolean status) {
		this.status = status;
	}
}
