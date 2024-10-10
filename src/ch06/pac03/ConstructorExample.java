package ch06.pac03;

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Class Resident Registration
		System.out.println("---------- Class Resident Registration ----------");
		ClassResidentRegistration newResidentJava = new ClassResidentRegistration("김자바", "Oracle");
		System.out.println("newResidentJava : " + newResidentJava);
		System.out.println("residentJavaName : " + newResidentJava.name);
		System.out.println("residentJavaAge : " + newResidentJava.age);
		System.out.println("residentJavaFamily : " + newResidentJava.family);
		System.out.println("residentJavaNation : " + newResidentJava.nation);

		ClassResidentRegistration newResidentCSharp = new ClassResidentRegistration("김씨샵", 24);
		System.out.println("newResidentCSharp : " + newResidentCSharp);
		System.out.println("residentCSharpName : " + newResidentCSharp.name);
		System.out.println("residentCSharpAge : " + newResidentCSharp.age);
		System.out.println("residentCSharpFamily : " + newResidentCSharp.family);
		System.out.println("residentCSharpNation : " + newResidentCSharp.nation);

		ClassResidentRegistration newResidentPhp = new ClassResidentRegistration("김피에", 29, "PHP", "덴마크");
		System.out.println("newResidentPhp : " + newResidentPhp);
		System.out.println("residentPhpName : " + newResidentPhp.name);
		System.out.println("residentPhpAge : " + newResidentPhp.age);
		System.out.println("residentPhpFamily : " + newResidentPhp.family);
		System.out.println("residentPhpNation : " + newResidentPhp.nation);

		// Class Board
		System.out.println("---------- Class Board ----------");
		ClassBoard board1 = new ClassBoard("게시판 공지사항", "공지사항");
		System.out.println("board : " + board1);
		System.out.println("board.title : " + board1.title);
		System.out.println("board.content : " + board1.content);
		System.out.println("board.writer : " + board1.writer);
		System.out.println("board.date : " + board1.date);
		System.out.println("board.hitcount : " + board1.hitcount);
		
		System.out.println("---------- Class Board ----------");
		ClassBoard board2 = new ClassBoard("게시판 이용방법", "이용방법 안내", "관리자");
		System.out.println("board : " + board2);
		System.out.println("board.title : " + board2.title);
		System.out.println("board.content : " + board2.content);
		System.out.println("board.writer : " + board2.writer);
		System.out.println("board.date : " + board2.date);
		System.out.println("board.hitcount : " + board2.hitcount);

		System.out.println("---------- Class Board ----------");
		ClassBoard board3 = new ClassBoard("게시판 글", "글 내용", "회원", "어제");
		System.out.println("board : " + board3);
		System.out.println("board.title : " + board3.title);
		System.out.println("board.content : " + board3.content);
		System.out.println("board.writer : " + board3.writer);
		System.out.println("board.date : " + board3.date);
		System.out.println("board.hitcount : " + board3.hitcount);
		
		System.out.println("---------- Class Board ----------");
		ClassBoard board4 = new ClassBoard("새 글", "새 글 내용", "새 회원", "오늘", 10);
		System.out.println("board : " + board4);
		System.out.println("board.title : " + board4.title);
		System.out.println("board.content : " + board4.content);
		System.out.println("board.writer : " + board4.writer);
		System.out.println("board.date : " + board4.date);
		System.out.println("board.hitcount : " + board4.hitcount);
		
	}

}
