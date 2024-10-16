package ch07.pac02;

public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Class Child
		System.out.println("--------------------------------------------------");
		ClassChild newChild = new ClassChild();
		ClassParent newParent = newChild;

		if (newParent == newChild) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("다른 객체 입니다.");
		}

		System.out.println("-------------------- nweParent --------------------");
		// Parent Method
		newParent.method1();
		// Polymorphism
		newParent.method2();
		// Can't Use
		// newParent.method3();

		System.out.println("-------------------- nweChild --------------------");
		// Child Method
		newChild.method1();
		newChild.method2();
		newChild.method3();

		System.out.println("-------------------- oldChild --------------------");
		ClassChild oldChild = null;
		if (newParent instanceof ClassChild) {
			System.out.println("instanceof : " + (newParent instanceof ClassChild));
			oldChild = (ClassChild) newParent;
			oldChild.method1();
			oldChild.method2();
			oldChild.method3();
		}

		System.out.println("newParent : " + newParent);
		System.out.println("newChild : " + newChild);
		if (oldChild != null) {
			System.out.println("oldChild : " + oldChild);
		}

		// Check Instanceof
		newParent.checkInsanceof(newParent);

		ClassParent instanceParent = new ClassParent();
		try {
			instanceParent.changeType(instanceParent);
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}

		// ClassVehicle
		System.out.println("--------------------------------------------------");
		ClassDriver newDriver = new ClassDriver();
		ClassVehicle newVehicle = new ClassVehicle();
		ClassBus newBus = new ClassBus();
		ClassTaxi newTaxi = new ClassTaxi();
		newDriver.driver(newVehicle);
		newDriver.driver(newBus);
		newDriver.driver(newTaxi);
	}

}
