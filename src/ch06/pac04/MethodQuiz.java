package ch06.pac04;

public class MethodQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Quiz 3
		ClassStudent newStudent = new ClassStudent();
		newStudent.name = "JAVA";
		newStudent.ban = 3;
		newStudent.kor = 90;
		newStudent.eng = 85;
		newStudent.math =94;
		
		int totalScore = newStudent.getTotal();
		System.out.println("totalScore : " + totalScore);
		
		float avgScore = newStudent.getAverage();
		System.out.println("avgScore : " + avgScore);
	}

}
