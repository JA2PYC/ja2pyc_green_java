package ch08.pac01;

public class InterfacePractice {

	static void printSound(InterfaceSoundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new ClassCat());
		printSound(new ClassDog());
		
	}

}
