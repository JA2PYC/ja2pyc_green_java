package test01.prac04;

public class Health {
	char gender;
	double tall;
	double weight;
	
	Health() {
		
	}
	
	void input(char gender, double tall, double weight) {
		this.gender = gender;
		this.tall = tall;
		this.weight = weight;
	}
	
	void output() {
		System.out.println("*****비만도 Check*****");
		System.out.println("성별(M/F) : " + this.gender);
		System.out.println("신장(Cm) : " + this.tall);
		System.out.println("체중(Kg) : " + this.weight);
	}
}
