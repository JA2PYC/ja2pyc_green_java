package ch07.pac01;

public class ClassDMBCellPhone extends ClassCellPhone {
	// Field
	public static final int DMB_PHONE = 1;
	protected int channel;

	// Constructor
	ClassDMBCellPhone() {
	}

	public ClassDMBCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

	// Method
	void turnOnDMB() {
		System.out.println("채널 " + this.channel + "번 방송 수신을 시작합니다.");
	}

	void changeDMBChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + this.channel + "번으로 변경합니다.");
	}

	protected void turnOffDMB() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	@Override
	void getInfo() {
		System.out.println("모델 : " + this.model);
		System.out.println("색상 : " + this.color);
		System.out.println("채널 : " + this.channel);
	}

}
