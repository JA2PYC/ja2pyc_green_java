package test01.prac02;

public class PracticeStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		student.kor = 90;
		student.eng = 88;
		student.math = 94;
		
		int totalScore = student.getTotal();
		float avgScore = student.getAverage();
		
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + avgScore);
	}

}
