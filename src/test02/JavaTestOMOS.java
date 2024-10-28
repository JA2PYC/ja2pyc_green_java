package test02;

public class JavaTestOMOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.kor = 66;
		student.eng = 82;
		student.math = 76;
		
		int totalScore = student.getTotal();
		float avgScore = student.getAverage();
		
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + avgScore);
	}

}
