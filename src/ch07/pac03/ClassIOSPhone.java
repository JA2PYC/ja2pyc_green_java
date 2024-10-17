package ch07.pac03;

public class ClassIOSPhone extends ClassPhone{
	
	public ClassIOSPhone (String owner){
		super(owner);
	}
	
	public void calling() {
		System.out.println("아이폰으로 전화를 겁니다.");
	}
	
	public void bell() {
		System.out.println("아이폰이 울립니다.");
	}
}
