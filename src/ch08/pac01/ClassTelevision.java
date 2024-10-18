package ch08.pac01;

public class ClassTelevision implements InterfaceRemoteControl {
	// Field
	private int volume = 5;

	// Method
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

	@Override
	public void setVolume(int volume) {
		if (volume > InterfaceRemoteControl.MAX_VOLUME) {
			this.volume = InterfaceRemoteControl.MAX_VOLUME;
		} else if (volume < InterfaceRemoteControl.MIN_VOLUME) {
			this.volume = InterfaceRemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
