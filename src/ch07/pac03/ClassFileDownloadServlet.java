package ch07.pac03;

public class ClassFileDownloadServlet extends ClassHttpServlet {
	@Override
	public void service() {
		System.out.println("파일을 다운로드 합니다.");
	}
}
