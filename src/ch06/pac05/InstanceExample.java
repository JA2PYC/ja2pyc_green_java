package ch06.pac05;

public class InstanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Class Car
		ClassCar carRay = new ClassCar("Ray");
		carRay.run();
		ClassCar carCasper = new ClassCar("Casper");
		carCasper.run();
		carCasper.run();

		// Class Calculator
		int plusResult = ClassCalculator.plus(2, 3);
		System.out.println("plusResult : " + plusResult);
		int minusResult = ClassCalculator.minus(5, 2);
		System.out.println("minusResult : " + minusResult);
		double piValue = ClassCalculator.pi;
		System.out.println("piValue : " + piValue);

		// Class Name
		int staticValue = ClassName.staticField;
		System.out.println("staticValue : " + staticValue);

		// Set Instance
		ClassName newName = new ClassName();
		newName.nameMethod1();
		System.out.println("staticValue : " + ClassName.staticField);
		ClassName.nameMethod2();
		System.out.println("staticValue : " + ClassName.staticField);
		ClassName.nameMethod3();
		System.out.println("staticValue : " + ClassName.staticField);

		// Construct Static Value
		ClassName newStaticName = new ClassName(50);
		System.out.println("newStaticName : " + newStaticName);
		System.out.println("staticValue : " + ClassName.staticField);

		// Construct Singleton
		// ClassName newSingletonName = new ClassName(150, 250); // Canont Access
		// ClassName newSingletonName = ClassName.fieldSingleton; // Cannot Access
		ClassName newSingletonName = ClassName.getInstance();
		System.out.println("newSingletonName : " + newSingletonName);
		newSingletonName.field = 1500;
		int singletonField = newSingletonName.field;
		System.out.println("singletonField : " + singletonField);
		System.out.println("staticValue : " + ClassName.staticField);

		ClassName newSingletonName2 = ClassName.getInstance();
		System.out.println("newSingletonName : " + newSingletonName2);
		int singletonField2 = newSingletonName2.field;
		System.out.println("singletonField : " + singletonField2);
		System.out.println("staticValue : " + ClassName.staticField);
	}

}
