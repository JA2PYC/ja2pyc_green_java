package test02;

public class Student {
	
	// Java Test 2 Student 박성현
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		int totalResult = this.kor + this.eng + this.math;
		return totalResult;
	}

	float getAverage() {
		int totalScore = getTotal();
		float avgResult = (float) Math.round((float) totalScore / 3 * 100) / 100;

		return avgResult;
	}
}
