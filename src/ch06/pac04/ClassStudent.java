package ch06.pac04;

public class ClassStudent {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		int sumTotal = kor + eng + math;
		return sumTotal;
	}

	float getAverage() {
		int sumTotal = getTotal();
		float avgResult = sumTotal / 3;
		return avgResult;
	}
}