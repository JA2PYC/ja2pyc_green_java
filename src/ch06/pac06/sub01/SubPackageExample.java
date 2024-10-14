package ch06.pac06.sub01;

import ch06.pac06.*;

public class SubPackageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassAccessModifier accessModifierPublic = new ClassAccessModifier(true);
		// ClassAccessModifier accessModifierDefault = new ClassAccessModifier(1); // Compile Error
		// ClassAccessModifier accessModifierProtected = new ClassAccessModifier(1, 1.0); // Compile Error
		// ClassAccessModifier accessModifierPrivate = new ClassAccessModifier("Private"); // Compile Error
		
		System.out.println("AccessModifierPublic : " + accessModifierPublic);
	}

}
