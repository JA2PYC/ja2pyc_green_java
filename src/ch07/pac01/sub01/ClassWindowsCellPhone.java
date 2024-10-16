package ch07.pac01.sub01;

import ch07.pac01.*;

public class ClassWindowsCellPhone extends ClassDMBCellPhone {
	// Field
	protected void powerOff() {
		System.out.println("윈도우 폰 전원을 끕니다.");
	}
	
	public void bell() {
		System.out.println("윈도우 폰 벨이 울립니다.");
	}
	
	// Constructor
	public ClassWindowsCellPhone(String model, String color, int channel){
		super(model, color, channel);
	}
	
}
