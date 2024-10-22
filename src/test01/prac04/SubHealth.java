package test01.prac04;

public class SubHealth extends Health {
	double s_weight;
	double fat;
	String result;

	SubHealth() {
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

		this.fat = (this.weight / this.s_weight) * 100;
		if (this.fat > 150) {
			result = "고도비만";
		} else if (this.fat > 131) {
			result = "중도비만";

		} else if (this.fat > 121) {
			result = "경도비만";

		} else if (this.fat > 111) {
			result = "과체중";

		} else if (this.fat > 91) {
			result = "정상(표준체중)";

		} else {
			result = "저체중";
		}

	}

	void output2() {
		output();
		System.out.printf("표준체중 : %.2f\n", this.s_weight);
		System.out.printf("비만도 : %.2f\n", this.fat);
		System.out.println("결과 : " + this.result);
		System.out.printf("당신은 비만도 %.2f이고, %s입니다.", this.fat,this.result );
	}

}
