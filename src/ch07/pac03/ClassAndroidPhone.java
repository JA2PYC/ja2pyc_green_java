package ch07.pac03;

public class ClassAndroidPhone extends ClassPhone{
	// Field
	
	// Constructor
	public ClassAndroidPhone(String owner) {
		super(owner);
	}
	
	// Method
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	@Override
	public void calling() {
		System.out.println("안드로이드폰으로 전화를 겁니다.");
	}
	
	@Override
	public void bell() {
		System.out.println("안드로이드폰이 울립니다.");
	}
}
