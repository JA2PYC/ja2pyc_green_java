package ch07.pac01;

public final class ClassSmartPhone extends ClassDMBCellPhone {
	// Field
	public static final int SMART_PHONE = 2;
	public static int phoneType; 
	String ostype;

	// Constructor
	ClassSmartPhone() {
		
	}
	
	ClassSmartPhone(String model, String color, int channel, String ostype) {
		super(model, color, channel);
		this.ostype = ostype;
		ClassSmartPhone.phoneType = SMART_PHONE;
	}

	// Method Overriding
	
	@Override
	void turnOnDMB() {
		System.out.println("DMB는 사용할 수 없습니다.");
	}
	
	@Override
	void changeDMBChannel(int channel) {
		if (phoneType != ClassSmartPhone.DMB_PHONE) {
			System.out.println("DMB 기능은 지원하지 않습니다.");
		} else {
			super.changeDMBChannel(channel);
		}
	}
	
	@Override
	protected void turnOffDMB() {
		System.out.println("DMB는 사용할 수 없습니다.");
	}
	
	// Method
	void getOsType() {
		System.out.println("OS : " + ostype);
	}
}
