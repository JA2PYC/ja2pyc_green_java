package ch07.pac01;

public class ClassHealth {
	char gender;
	double tall;
	double weight;

//	ClassHealth() {
//		
//	}

	void input(char gender, double tall, double weight) {
		this.gender = gender;
		this.tall = tall;
		this.weight = weight;
	}

	void output() {
		System.out.println("-------------------- 기본 정보 --------------------");
		System.out.println("성별 : " + this.gender);
		System.out.println("신장 : " + this.tall);
		System.out.println("체중 : " + this.weight);
	}

}
