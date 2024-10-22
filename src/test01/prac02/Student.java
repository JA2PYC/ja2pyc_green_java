package test01.prac02;

public class Student {
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
