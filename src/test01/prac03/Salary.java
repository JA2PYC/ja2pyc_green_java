package test01.prac03;

public class Salary {
	String name;
	int salary;

	Salary(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	void getInformation1() {
		System.out.println("이름 : " + this.name);
		System.out.println("연봉 : " + this.salary);
	}
}
