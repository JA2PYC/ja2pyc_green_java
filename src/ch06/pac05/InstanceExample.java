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

		// Class Singleton
		// ClassSingleton oldSingleton = new ClassSingleton();
		// ClassSingleton newSingleton = new ClassSingleton();

		ClassSingleton oldSingleton = ClassSingleton.getSingleton();
		ClassSingleton newSingleton = ClassSingleton.getSingleton();

		if (oldSingleton == newSingleton) {
			System.out.println("같은 객체 입니다. : " + newSingleton);
		} else {
			System.out.println("다른 객체 입니다. : " + oldSingleton + ", " + newSingleton);
		}

		// Class Card
		ClassCard cardClover1 = new ClassCard("클로버", "검정", "1");
		ClassCard cardHeart9 = new ClassCard("하트", "빨강", "9");
		ClassCard.height = 30;
		System.out.println("cardClover1 : " + cardClover1.shape + ", " + cardClover1.color + cardClover1.number
				+ ", 가로 : " + ClassCard.width + ", 세로 : " + ClassCard.height);
		System.out.println("cardHeart9 : " + cardHeart9.shape + ", " + cardHeart9.color + cardHeart9.number + ", 가로 : "
				+ ClassCard.width + ", 세로 : " + ClassCard.height);

		// Class Person
		ClassPerson newPerson = new ClassPerson("1234", "JAVA");
		// newPerson.nation = "Denmark"; // Compile Error
		// newPerson.ssn = "5678"; // Compile Error
		newPerson.name = "JAVASCRIPT";
		System.out.println(
				"newPerson / Nation : " + newPerson.nation + ", SSN : " + newPerson.ssn + ", Name : " + newPerson.name);
		ClassPerson renewPerson = new ClassPerson ("5678", "C#");
		System.out.println(
				"newPerson / Nation : " + renewPerson.nation + ", SSN : " + renewPerson.ssn + ", Name : " + renewPerson.name);

		// Class Earth
		System.out.println("Earth Radius : " + ClassEarth.EARTH_RADIUS + "km");
		System.out.println("Earth Area : " + ClassEarth.EARTH_AREA + "km^2");
		
		// Class Shop Service
		ClassShopService oldShopService = ClassShopService.getInstance();
		ClassShopService newShopService = ClassShopService.getInstance();
		
		if (oldShopService == newShopService ) {
			System.out.println("같은 객체 입니다. : " + newShopService);
		} else {
			System.out.println("다른 객체 입니다. : " + oldShopService + ", " + newShopService);
		}
	}

}
