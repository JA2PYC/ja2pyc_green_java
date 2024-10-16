package ch07.pac01;

import ch07.pac01.sub01.*;

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ClassDMBCellPhone
		ClassDMBCellPhone newDmbPhone = new ClassDMBCellPhone("삼성", "검정", 123);
		// Inherited Field
		System.out.println("Model : " + newDmbPhone.model);
		System.out.println("Color : " + newDmbPhone.color);
		
		// Own Field
		System.out.println("Channel : " + newDmbPhone.channel);
		
		// Inherited Method
		newDmbPhone.powerOn();
		newDmbPhone.bell();
		newDmbPhone.sendVoice("안녕하세요");
		newDmbPhone.receiveVoice("반갑습니다.");
		newDmbPhone.hangUp();
		
		// Own Method
		newDmbPhone.turnOnDMB();
		newDmbPhone.changeDMBChannel(456);
		newDmbPhone.turnOffDMB();
		
		// ClassSmartPhone
		ClassSmartPhone newSmartPhone = new ClassSmartPhone("사과", "흰색", 0, "iOS");
		System.out.println("Model : " + newSmartPhone.model);
		System.out.println("Color : " + newSmartPhone.color);
		System.out.println("Channel : " + newSmartPhone.channel);
		System.out.println("OsType : " + newSmartPhone.ostype);
		
		// Own Method
		newSmartPhone.getOsType();
		
		// Overrided Method
		newSmartPhone.turnOnDMB();
		// ClassSmartPhone.phoneType = ClassSmartPhone.DMB_PHONE;
		newSmartPhone.changeDMBChannel(123);
		newSmartPhone.turnOffDMB();
		
		// ClassWindowsCellPhone
		ClassWindowsCellPhone newWindowsPhone = new ClassWindowsCellPhone("윈도우", "파랑", 123);
		newWindowsPhone.bell();
	}

}
