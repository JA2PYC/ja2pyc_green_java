package ch07.pac02;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassCar newCar = new ClassCar();

		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
			int problemLocation = newCar.run();

			switch (problemLocation) {
			case 1:
				System.out.println("FL 타이어 교체");
				newCar.flTire = new ClassHankookTire("FL", 15);
				break;
			case 2:
				System.out.println("FR 타이어 교체");
				newCar.frTire = new ClassKumhoTire("FR", 13);
				break;
			case 3:
				System.out.println("BL 타이어 교체");
				newCar.blTire = new ClassHankookTire("BL", 15);
				break;
			case 4:
				System.out.println("BR 타이어 교체");
				newCar.brTire = new ClassKumhoTire("BR", 13);
				break;
			default:
				System.out.println("타이어 정상");
				break;
			}
		}
		
		System.out.println("--------------------------------------------------");
	}

}
