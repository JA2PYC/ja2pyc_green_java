package ch06.pac04;

public class ClassMemberService {
	boolean login(String id, String password) {
		if (id == "hong" && password == "12345") {
			System.out.println(id +"님 로그인 되었습니다.");
			return true;
		} else {
			System.out.println("로그인에 실패했습니다.");
			return false;
		}
	}

	void logout(String id) {
		System.out.println(id + "님 로그아웃 되었습니다.");
	}
}
