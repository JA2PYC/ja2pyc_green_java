package ch08.pac02;

public class InterfacePolymorphismExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ClassCar
		System.out.println("-------------------- Class Car --------------------");
		ClassCar newCar = new ClassCar();
		newCar.run();
		
		// Interface Polymorphism
		System.out.println("-------------------- Interface Polymorphism --------------------");
		newCar.FLTire = new ClassKHTire();
		newCar.FRTire = new ClassKHTire();
		newCar.BLTire = new ClassKHTire();
		newCar.BRTire = new ClassKHTire();
		newCar.run();
		
		// ClassDriver
		System.out.println("-------------------- Class Driver --------------------");
		ClassDriver newDriver = new ClassDriver();
		InterfaceVehicle newVehicleBus = new ClassBus();
		InterfaceVehicle newVehicleTaxi = new ClassTaxi();
		newDriver.drive(newVehicleBus);
		newDriver.drive(newVehicleTaxi);
		
		// Interface Casting
		System.out.println("-------------------- Interface Casting --------------------");
		ClassBus newBus = (ClassBus) newVehicleBus;
		newBus.horn();

		// Interface instanceof
		System.out.println("-------------------- instanceof --------------------");
		if (newVehicleTaxi instanceof ClassTaxi) {
			ClassTaxi newTaxi = (ClassTaxi) newVehicleTaxi;
			newTaxi.horn();
		}
		
		// Interface Extends
		System.out.println("-------------------- Interface Extends --------------------");
		InterfaceCar newInterfaceCar = new ClassCar();
		newInterfaceCar.turnOn();
		newInterfaceCar.run();
		newInterfaceCar.roll();
		newInterfaceCar.turnOff();
		
		// Interface Casting
		System.out.println("-------------------- Interface Casting --------------------");
		InterfaceTire newInterfaceTire = newInterfaceCar;
		newInterfaceTire.roll();
		
		System.out.println("-------------------- Interface Casting --------------------");
		InterfaceVehicle newInterfaceVehicle = newInterfaceCar;
		newInterfaceVehicle.run();

		// ClassSonata
		System.out.println("-------------------- Class Extends --------------------");
		ClassSonata newSonata = new ClassSonata();
		newSonata.turnOn();
		newSonata.run();
		newSonata.roll();
		newSonata.turnOff();

		// Casting Extended Class
		System.out.println("-------------------- Casting Extended Class --------------------");
		InterfaceCar newInterfaceCarSonata = newSonata;
		newInterfaceCarSonata.turnOn();
		newInterfaceCarSonata.roll();
		newInterfaceCarSonata.run();
		newInterfaceCarSonata.turnOff();
		
		// Casting Interface
		System.out.println("-------------------- Casting Interface Extended Class --------------------");
		InterfaceVehicle newInterfaceVehicleSonata = newSonata;
		newInterfaceVehicleSonata.run();
		
		// Casting Interface
		System.out.println("-------------------- Casting Interface Extended Class --------------------");
		InterfaceTire newInterfaceTireSonata = newSonata;
		newInterfaceTireSonata.roll();
		
	}

}
