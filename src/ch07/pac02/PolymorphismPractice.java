package ch07.pac02;

public class PolymorphismPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Practice 2
		System.out.println("--------------------------------------------------");
		ClassSnowTire newSnowTire = new ClassSnowTire();
		ClassTire newTire = newSnowTire;
		newSnowTire.run();
		newTire.run();
		
		// Practice 5
		System.out.println("--------------------------------------------------");
		ClassController newController = new ClassController();
		newController.setService(new ClassMemberService());
		newController.memberService.login();
		
		newController.setService(new ClassAService());
		newController.memberService.login();
	}

}
