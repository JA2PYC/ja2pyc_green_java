package ch08.pac01;

public interface InterfaceRemoteControl {
	// Constant Field
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	// Must Initialize Filed
	// int CURRENT_VOLUME;
	
	// Abstract Method
	public abstract void turnOn();

	public void turnOff();

	void setVolume(int volume);
}
