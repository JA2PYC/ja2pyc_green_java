package ch08.pac01;

public class ClassMyInterface {
	// Field
	InterfaceRemoteControl remoteControl;
	InterfaceRemoteControl remoteControlTelevision = new ClassTelevision();
	
	// Constructor
	ClassMyInterface (){
		
	}
	
	ClassMyInterface (InterfaceRemoteControl remoteControl){
		this.remoteControl = remoteControl;
		remoteControl.turnOn();
		remoteControl.setVolume(remoteControl.getVolume());
	}
	
	void turnOnAudio() {
		remoteControl = new ClassAudio();
		remoteControl.turnOn();
		remoteControl.setVolume(remoteControl.getVolume());
	}
	
	void turnOnRemoteControl (InterfaceRemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.setVolume(remoteControl.getVolume());
	}
}
