package ch08.pac01;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Interface can't instantiate
		System.out.println("-------------------- Interface Constant --------------------");
		// InterfaceRemoteControl newInterface = new InterfaceRemoteControl();
		int maxVolume = InterfaceRemoteControl.MAX_VOLUME;
		int minVolume = InterfaceRemoteControl.MIN_VOLUME;
		System.out.println("maxVolume : " + maxVolume);
		System.out.println("minVolume : " + minVolume);
		
		// Not Interface
		System.out.println("-------------------- Not Interface --------------------");
		ClassTelevision newTelevision = new ClassTelevision();
		newTelevision.turnOn();
		
		// Use Interface
		System.out.println("-------------------- Use Interface --------------------");
		InterfaceRemoteControl newInterface = new ClassAudio();
		newInterface.turnOn();
		newInterface.turnOff();
		newInterface = new ClassTelevision();
		newInterface.turnOff();
		
		// Multiple Interface
		System.out.println("-------------------- Multiple Interface --------------------");
		ClassSmartTelevision newSmartTelevision = new ClassSmartTelevision();
		InterfaceRemoteControl newRemoteControl = newSmartTelevision;
		newRemoteControl.turnOn();
		InterfaceSearchable newSearchable = newSmartTelevision;
		newSearchable.search("JAVA");
		
		
	}

}
