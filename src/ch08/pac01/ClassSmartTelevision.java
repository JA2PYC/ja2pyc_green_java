package ch08.pac01;

public class ClassSmartTelevision implements InterfaceRemoteControl, InterfaceSearchable {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("스마트 TV 전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV 전원을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > InterfaceRemoteControl.MAX_VOLUME) {
			volume = InterfaceRemoteControl.MAX_VOLUME;
		} else if (volume < InterfaceRemoteControl.MIN_VOLUME) {
			volume = InterfaceRemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

		System.out.println("현재 스마트 TV 볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
