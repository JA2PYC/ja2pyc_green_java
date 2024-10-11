package ch06.pac04;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Class Calculator
		System.out.println("---------- Class Calculator ----------");
		ClassCalculator newCalculator = new ClassCalculator();
		newCalculator.powerOn();

		int plusResult = newCalculator.plus(5, 6);
		System.out.println("plusResult : " + plusResult);

		double divideResult = newCalculator.divide(10, 4);
		System.out.println("divideResult : " + divideResult);

		int[] intArr = { 1, 2, 3 };
		int sumIntArrResult = newCalculator.sumIntArr(intArr);
		System.out.println("sumIntArrResult: " + sumIntArrResult);

		int sumIntValuesResult = newCalculator.sumIntValues(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("sumIntValuesResult : " + sumIntValuesResult);

		int sumNewIntValuesResult = newCalculator.sumIntValues(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		System.out.println("sumNewIntValuesResult : " + sumNewIntValuesResult);

		double avgResult = newCalculator.avgInt(13, 27);
		System.out.println("avgResult : " + avgResult);

		int plusOverloadingResult = newCalculator.plus((byte) 5, (int) 6);
		System.out.println("plusOverloadingResult : " + plusOverloadingResult);

		double areaRectangleResult = newCalculator.areaRectangle(10);
		System.out.println("areaRectangleResult : " + areaRectangleResult);

		double areaRectangleOverloadingResult = newCalculator.areaRectangle(10, 20);
		System.out.println("areaRectangleOverloadingResult : " + areaRectangleOverloadingResult);

		newCalculator.powerOff();

		// Class Car
		System.out.println("---------- Class Car ----------");
		ClassCar newCar = new ClassCar();
		newCar.gas = 5;

		boolean gasStatus = newCar.isLeftGas();
		if (gasStatus) {
			System.out.println("출발합니다.");
			newCar.run();
		} else {
			System.out.println("자동차에 가스가 없습니다.");
		}

		if (newCar.isLeftGas()) {
			System.out.println("가스가 남아 있습니다.");
		} else {
			System.out.println("가스를 주입하세요.");
		}

		newCar.keyTurnOn();

		int currentSpeed = newCar.getSpeed();
		System.out.println("현재 속도 : " + currentSpeed);

		newCar.accelator();
		System.out.println("현재 속도 : " + currentSpeed);
		System.out.println("객체 속도 : " + newCar.speed);

		// Class Member Service
		System.out.println("---------- Class Member Service ----------");
		ClassMemberService newMember = new ClassMemberService();
		
		boolean loginResult = newMember.login("hong", "12345");
		System.out.println("loginResult : " + loginResult);
		
		if (loginResult) {
			System.out.println("로그인 성공");
			newMember.logout("hong");
		} else {
			System.out.println();
		}
		
		// Class Printer
		System.out.println("---------- Class Printer ----------");
		ClassPrinter newPrinter = new ClassPrinter();
		
		newPrinter.println(10);
		newPrinter.println(5.7);
		newPrinter.println(true);
		newPrinter.println("JAVA");
		
	}

}
