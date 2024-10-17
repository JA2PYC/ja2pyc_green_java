package ch08.pac01;

public class ClassAudio implements InterfaceRemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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
		
		System.out.println("현재 Audio 볼륨 : " + this.volume);	
	}

}
