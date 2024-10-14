package ch06.pac06;

import ch06.pac04.*;
import ch06.pac05.*;

public class PackageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Import Package
		ClassMemberService newMemberService = new ClassMemberService();
		ClassCard newCard = new ClassCard();
		System.out.println("newMemberService : " + newMemberService);
		System.out.println("newCard : " + newCard);
		
		ch06.pac04.ClassCar pac04Car = new ch06.pac04.ClassCar();
		ch06.pac05.ClassCar pac05Car = new ch06.pac05.ClassCar();
		System.out.println("pac04Car : " + pac04Car);
		System.out.println("pac05Car : " + pac05Car);

		// Class Access Modifier
		ClassAccessModifier accessModifierPublic = new ClassAccessModifier(false);
		ClassAccessModifier accessModifierDefault = new ClassAccessModifier(1);
		ClassAccessModifier accessModifierProtected = new ClassAccessModifier(1, 1.0);
		// ClassAccessModifier accessModifierPrivate = new ClassAccessModifier("Private");

		System.out.println("AccessModifierPublic : " + accessModifierPublic);
		System.out.println("AccessModifierDefault : " + accessModifierDefault);
		System.out.println("AccessModifierProtected : " + accessModifierProtected);

		// Field Access
		System.out.println("Public Field : " + accessModifierPublic.boolValue);
		System.out.println("Default Field : " + accessModifierDefault.intValue);
		System.out.println("Protected Field : " + accessModifierProtected.doubleValue);
		// System.out.println("Private Field : " + accessModifierPublic.strValue); 
		
		// Method Access
		accessModifierPublic.methodPublic();
		accessModifierDefault.methodDefault();
		accessModifierProtected.methodProtected();
		accessModifierPublic.callMethodPivate();
		
		// Class Car Getter Setter
		ClassCar newCar = new ClassCar();
		newCar.setSpeed(-50);
		System.out.println("Get Speed : " + newCar.getSpeed());
		System.out.println("Is Stop : " + newCar.isStop());
		newCar.setSpeed(60);
		System.out.println("Get Speed : " + newCar.getSpeed());
		System.out.println("Is Stop : " + newCar.isStop());
		if (!newCar.isStop()) {
			newCar.setStop(true);
		}
		System.out.println("Get Speed : " + newCar.getSpeed());
		System.out.println("Is Stop : " + newCar.isStop());
	}

}
