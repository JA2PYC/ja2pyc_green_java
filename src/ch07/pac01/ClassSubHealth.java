package ch07.pac01;

public class ClassSubHealth extends ClassHealth {
	double s_weight;
	double fat;
	String result;

	ClassSubHealth() {
		this.s_weight = 0;
		this.fat = 0;
		this.result = null;
	}

	void calculate() {
		if (this.gender == 'm' || this.gender == 'M') {
			s_weight = (this.tall - 100) * 0.9;
		} else {
			s_weight = (this.tall - 100) * 0.85;
		}

		this.fat = this.weight / this.s_weight;
		if (this.fat > 1.50) {
			result = "고도비만";
		} else if (this.fat > 1.31) {
			result = "중도비만";

		} else if (this.fat > 1.21) {
			result = "경도비만";

		} else if (this.fat > 1.11) {
			result = "과체중";

		} else if (this.fat > 0.91) {
			result = "정상(표준체중)";

		} else {
			result = "저체중";
		}

	}

	void output_details() {
		output();
		System.out.println("-------------------- 비만도 정보 --------------------");
		System.out.println("표준체중 : " + this.s_weight);
		System.out.println("비만도 : " + this.fat);
		System.out.println("결과 : " + this.result);
	}
}
