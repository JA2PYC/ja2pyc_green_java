package ch06.pac03;

public class ClassResidentRegistration {

	String name;
	int age;
	String family;
	String nation;

	ClassResidentRegistration() {

	}

	ClassResidentRegistration(String newName) {
		this(newName, 0, "", "");
	}

	ClassResidentRegistration(String newName, int newAge) {
		this(newName, newAge, "", "");
	}

	ClassResidentRegistration(String newName, String newFamily) {
		this(newName, 0, newFamily, "");
	}
	
	ClassResidentRegistration(String newName, int newAge, String newFamily) {
		this(newName, newAge, newFamily, "");
	}

	ClassResidentRegistration(String newName, int newAge, String newFamily, String newNation) {
		this.name = newName;
		this.age = newAge;
		this.family = newFamily;
		this.nation = newNation;
	}

}
