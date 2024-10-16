package ch07.pac02;

public class ClassService {
	void login() {
		System.out.println("일반 회원으로 로그인 되었습니다.");
	}
}

class ClassMemberService extends ClassService{
	@Override
	void login() {
		System.out.println("멤버 회원으로 로그인 되었습니다.");
	}
}

class ClassAService extends ClassMemberService {
	@Override
	void login() {
		System.out.println("A등급 회원으로 로그인 되었습니다.");
	}
}
