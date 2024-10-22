package test01.prac03;

public class MemberService {
	
	boolean login(String id, String password) {
		if (id == "hone") {
			if (password == "12345") {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	void logout (String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
